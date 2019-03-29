package com.test7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event extends JFrame  {
	Mypanel mypanel =null;
	//���캯��
	public Event() {
	mypanel=new Mypanel();
	this.add(mypanel);
	this.setTitle("sky");
	this.setSize(400, 300);
	this.setVisible(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.addMouseListener(mypanel);	
	this.addKeyListener(mypanel);
	this.addMouseMotionListener(mypanel);
	this.addWindowListener(mypanel);
	}

	public static void main(String[] args) {
		Event control=new Event();
		// TODO Auto-generated method stub

	}

}
//1.��MyPanel֪����갴�µ���Ϣ������֪�����꣨x,y��
//2.��MyPanel֪���ĸ�������
//3.��MyPanel֪������ƶ�����ק
//4.��MyPanel֪�����ڵı仯����С������󻯣��رգ�

class Mypanel extends JPanel implements MouseListener,
KeyListener,MouseMotionListener,WindowListener{
	public void paint(Graphics g) {
		super.paint(g);
	}

	//�����
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������� x="+e.getX()+"y="+e.getY());
	}

	//����ƶ���MyPanel
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�������");
	}

	//����뿪MyPanel
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�������");
	}

	//��갴��
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��갴����");
	}

	//����ͷ�
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("����ɿ���");
	}

	//������
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar()+"��������");
	}

	//���ɿ�
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	//������
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	//�����ק
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//����ƶ�
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��굱ǰ���� x="+e.getX());
	}

	//
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window���ڼ�����Activated");
	}

	//
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window���ڹر���Closed");

	}

	//
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window�������ڹر�Closing");

	}

	//
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window���ڷǼ���Deactivated");

	}

	//
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window���ڻָ���Deiconified");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window������С��Iconified");

	}

	//
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window���ڴ���Opened");

	}
}