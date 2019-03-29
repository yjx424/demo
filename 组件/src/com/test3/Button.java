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
	//定义一个panel
	JPanel mp=null;
	JButton jb1=null;
	JButton jb2=null;
	JButton jb3=null;
	
	
public static void main(String[] args) {
		Button button=new Button();
	
		
	}
	

	
	
	
	public Button() {
		mp=new JPanel();
		jb1=new JButton("黑色");
		jb2=new JButton("红色");
		jb3=new JButton("点击");
		
		
		this.add(jb1,BorderLayout.NORTH);
		mp.setBackground(Color.BLACK);
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		this.add(jb3,BorderLayout.EAST);
		
		//注册监听
		jb1.addActionListener(this);
		//指定action命令
		jb1.setActionCommand("黑色");
		jb2.addActionListener(this);
		jb2.setActionCommand("红色");
		jb3.addActionListener(this);
		jb3.setActionCommand("点击");
		
		this.setSize(200,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
}
	//对事件处理的方法
	public void actionPerformed(ActionEvent e) {
		//判断是哪个按钮被点击
		if(e.getActionCommand().equals("黑色")) {
			System.out.println("点击的是黑色按钮");
			mp.setBackground(Color.black);
			
		}else if (e.getActionCommand().equals("红色")) {
			System.out.println("点击的是红色按钮");
			mp.setBackground(Color.red);
			
		}else if(e.getActionCommand().equals("点击")){
			Scanner sc = new Scanner(System.in); 
			System.out.println("输入");
			String name =sc.nextLine();
			System.out.println(name);
			
			
	        
	       
	      
			
		}
	}
}
		
	


