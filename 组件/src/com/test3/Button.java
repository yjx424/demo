package com.test3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Printable;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Button extends JFrame implements ActionListener{
	//����һ��panel
	JPanel mp=null;
	JButton jb1=null;
	JButton jb2=null;
	JButton jb3=null;
	
	
public static void main(String[] args) {
		Button button=new Button();
	
		
	}
	

	
	
	
	public Button() {
		mp=new JPanel();
		jb1=new JButton("��ɫ");
		jb2=new JButton("��ɫ");
		jb3=new JButton("���");
		
		
		this.add(jb1,BorderLayout.NORTH);
		mp.setBackground(Color.BLACK);
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		this.add(jb3,BorderLayout.EAST);
		
		//ע�����
		jb1.addActionListener(this);
		//ָ��action����
		jb1.setActionCommand("��ɫ");
		jb2.addActionListener(this);
		jb2.setActionCommand("��ɫ");
		jb3.addActionListener(this);
		jb3.setActionCommand("���");
		
		this.setSize(200,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
}
	//���¼�����ķ���
	public void actionPerformed(ActionEvent e) {
		//�ж����ĸ���ť�����
		if(e.getActionCommand().equals("��ɫ")) {
			System.out.println("������Ǻ�ɫ��ť");
			mp.setBackground(Color.black);
			
		}else if (e.getActionCommand().equals("��ɫ")) {
			System.out.println("������Ǻ�ɫ��ť");
			mp.setBackground(Color.red);
			
		}else if(e.getActionCommand().equals("���")){
			Scanner sc = new Scanner(System.in); 
			System.out.println("����");
			String name =sc.nextLine();
			System.out.println(name);
			
			
	        
	       
	      
			
		}
	}
}
		
	


