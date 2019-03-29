package com.test12;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



class YouDead extends JFrame{
	JPanel myPanel2 = null;
	JButton jButton= null;


	public YouDead(){
		myPanel2 = new JPanel();
		jButton=new JButton("YouDead");
		this.add(jButton,BorderLayout.PAGE_START);
		this.add(myPanel2);
		this.setTitle("YouDead");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setLocation(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
	public static void main(String[] args) {
		YouDead dead=new YouDead();
	}

}

	