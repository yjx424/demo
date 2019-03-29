package com.test7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event extends JFrame  {
	Mypanel mypanel =null;
	//构造函数
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
//1.让MyPanel知道鼠标按下的消息，并且知道坐标（x,y）
//2.让MyPanel知道哪个键按下
//3.让MyPanel知道鼠标移动，拖拽
//4.让MyPanel知道窗口的变化（最小化，最大化，关闭）

class Mypanel extends JPanel implements MouseListener,
KeyListener,MouseMotionListener,WindowListener{
	public void paint(Graphics g) {
		super.paint(g);
	}

	//鼠标点击
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标点击了 x="+e.getX()+"y="+e.getY());
	}

	//鼠标移动到MyPanel
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标来了");
	}

	//鼠标离开MyPanel
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标走了");
	}

	//鼠标按下
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标按下了");
	}

	//鼠标释放
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标松开了");
	}

	//键按下
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar()+"键被按下");
	}

	//键松开
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	//键输入
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	//鼠标拖拽
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//鼠标移动
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标当前坐标 x="+e.getX());
	}

	//
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window窗口激活了Activated");
	}

	//
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window窗口关闭了Closed");

	}

	//
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window窗口正在关闭Closing");

	}

	//
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window窗口非激活Deactivated");

	}

	//
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window窗口恢复了Deiconified");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window窗口最小化Iconified");

	}

	//
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("window窗口打开了Opened");

	}
}