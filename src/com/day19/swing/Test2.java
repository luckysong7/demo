package com.day19.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.AbstractDocument.Content;

public class Test2 extends JFrame implements ActionListener {
	/**
	 * 
	 */

	List<DataVO> lists = new ArrayList<Test2.DataVO>();

	private static final long serialVersionUID = 1L;

	private JTextField[] tf = new JTextField[4];

	private JButton btn1, btn2;

	static private JTable table;

	private String path = System.getProperty("user.dir");

	private File f = new File(path, "\\data\\score2.txt");
	DataVO vo;

	public Test2() throws Exception {

		getContentPane().setLayout(null); // 레이아웃 초기화

		String[] caption = { "이름", "국어", "영어", "수학" };

		for (int i = 0; i < caption.length; i++) {
			JLabel lbl = new JLabel(caption[i]);
			lbl.setBounds(10, (i + 1) * 30, 50, 20);
			getContentPane().add(lbl);

			tf[i] = new JTextField();

			tf[i].setBounds(80, (i + 1) * 30, 70, 20);
			getContentPane().add(tf[i]);
		}

		btn1 = new JButton("추가");
		btn1.setBounds(10, 160, 60, 20);
		btn1.addActionListener(this);
		getContentPane().add(btn1);

		btn2 = new JButton("종료");
		btn2.setBounds(90, 160, 60, 20);
		btn2.addActionListener(this);
		getContentPane().add(btn2);

		addTable();

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		setTitle("성적처리");
		setSize(550, 250);
		setVisible(true);

		if (!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}

		if (f.exists()) {
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);

			lists = (List<DataVO>) ois.readObject();
			String[] data = new String[6];
			Iterator<DataVO> it = lists.iterator();
			while (it.hasNext()) {
				vo = it.next();

				data[0] = (String) vo.getName();
				data[1] = (String) vo.getKor();
				data[2] = (String) vo.getEng();
				data[3] = (String) vo.getMat();
				data[4] = (String) vo.getTot();
				data[5] = (String) vo.getAvg();
				((MyTableModel) table.getModel()).addRow(data);
			}
		}

	}

	private void addTable() {

		String[] title = { "이름", "국어", "수학", "영어", "총점", "평균" };

		MyTableModel model = new MyTableModel(title);

		table = new JTable(model);

		// 스크롤바 생성
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(160, 30, 355, 150);
		getContentPane().add(sp);

		// 컬럼크기 자동변경 OFF
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		// 컬럼폭 지정
		for (int i = 0; i < title.length; i++) {
			TableColumn col = table.getColumnModel().getColumn(i);
			col.setPreferredWidth(55);
		}

	}

	static class MyTableModel extends DefaultTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String[] title;

		// 의존성 주입
		public MyTableModel(String[] t) {
			this.title = t;
		}

		@Override
		public int getColumnCount() {
			if (title == null || title.length == 0) {
				return 0;
			}
			return title.length;

		}

		@Override
		public String getColumnName(int column) {
			if (title == null || title.length == 0) {
				return null;
			}
			return title[column];

		}

	}

	public static void main(String[] args) throws Exception {
		new Test2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob instanceof JButton) {
			JButton b = (JButton) ob;
			if (b == btn1) {
				try {
					process();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (b == btn2) {

				try {
					FileOutputStream fos = new FileOutputStream(f);
					ObjectOutputStream oos = new ObjectOutputStream(fos);

					oos.writeObject(lists);

					oos.close();
					fos.close();

				} catch (Exception e2) {
					// TODO: handle exception
				}
				System.exit(0);
			}
		}

	}

	class DataVO implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String name;
		String kor;
		String eng;
		String mat;
		String tot;
		String avg;

		public String getName() {
			return name;
		}

		public String getKor() {
			return kor;
		}

		public String getEng() {
			return eng;
		}

		public String getMat() {
			return mat;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setKor(String kor) {
			this.kor = kor;
		}

		public void setEng(String eng) {
			this.eng = eng;
		}

		public void setMat(String mat) {
			this.mat = mat;
		}

		public String getTot() {
			return tot;
		}

		public void setTot(String tot) {
			this.tot = tot;
		}

		public String getAvg() {
			return avg;
		}

		public void setAvg(String avg) {
			this.avg = avg;
		}

	}

	private void process() throws Exception {

		String[] data = new String[6];

		DataVO vo;
		int tot;

		try {
			tot = 0;

			data[0] = tf[0].getText();
			for (int i = 1; i < 4; i++) {
				data[i] = tf[i].getText(); // 국영수
				tot += Integer.parseInt(tf[i].getText()); // 총점
			}

			data[4] = Integer.toString(tot); // 총점
			data[5] = Integer.toString(tot / 3); // 평균

			vo = new DataVO();
			vo.setName(data[0]);
			vo.setKor(data[1]);
			vo.setEng(data[2]);
			vo.setMat(data[3]);
			vo.setTot(data[4]);
			vo.setAvg(data[5]);

			lists.add(vo);
			// 테이블에 배열값 넣기
			((MyTableModel) table.getModel()).addRow(data);

			// 텍스트필드 초기화
			for (int i = 0; i < tf.length; i++) {
				tf[i].setText("");

			}
			tf[0].requestFocus();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
