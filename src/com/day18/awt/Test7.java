package com.day18.awt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test7 extends Frame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int x, y;

	private Label lb = new Label("", Label.CENTER);

	public Test7() {

		add(lb, BorderLayout.SOUTH);

		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());

		setBackground(new Color(150, 150, 150)); // ����
		setForeground(new Color(0, 0, 255)); // ���ڻ�

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		setTitle("��ǥ���");
		setSize(400, 400);
		setVisible(true);

	}

	@Override
	public void paint(Graphics g) {
		String str;
		str = "(" + x + "," + y + ")";
		g.drawString(str, x, y);
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	class MouseHandler extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

	}
	
	class MouseMotionHandler extends MouseMotionAdapter{

		@Override
		public void mouseDragged(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			String str = String.format("(%d , %d)",e.getX(),e.getY());
			
			lb.setText(str);
		}
		
		
		
	}

	public static void main(String[] args) {
		new Test7();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
