package com.test2;


import java.awt.BasicStroke;

import java.awt.Color;

import java.awt.Graphics2D;

import java.awt.RenderingHints;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.util.Random;

 

import javax.swing.JButton;

 

public class DrawListener extends MouseAdapter implements ActionListener{

	private int x1, y1, x2, y2;

	private int newx1,newy1,newx2,newy2;

	private Graphics2D g;

	private DrawMain df;

	private boolean flag=false;

	String shape="直线";

	Color color;

	private int [] arrx=new int[4];

	private int [] arry=new int[4];

	private  int temp=0;

	

	DrawListener(DrawMain d){

		df=d;

	}

	//获取形状和颜色

	public void actionPerformed(ActionEvent e){

	    if(e.getActionCommand().equals("")){

	    	JButton button = (JButton) e.getSource();  

			color = button.getBackground();   

			System.out.println("color = " + color);

	    }else{

	    	JButton button = (JButton) e.getSource();  

			shape = button.getActionCommand();   

			System.out.println("String = " + shape);

	    }

	}

 

	//实现画笔

	 public void mousePressed(MouseEvent e) {

		 g=(Graphics2D) df.getGraphics();

		 g.setColor(color);

		 x1=e.getX();

		 y1=e.getY();

		

	 }

	

	 public void mouseReleased(MouseEvent e) {

			x2 = e.getX();

			y2 = e.getY();

			if (shape.equals("直线")) {

				g.drawLine(x1, y1, x2, y2);

			}else if(shape.equals("弧线")){

				 g.drawArc(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1), 0, 180);

			}else if(shape.equals("多边形")&&!flag){

				g.drawLine(x1, y1, x2, y2);

				newx1=x1;

				newy1=y1;

				newx2=x2;

				newy2=y2;

				flag=true;

			}else  if(shape.equals("圆")){

				 g.drawOval(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));

			 }else if(shape.equals("矩形")){

				 g.drawRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));

			 }else if(shape.equals("圆角矩形")){

				 g.drawRoundRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1),2,10);

			 }else if(shape.equals("椭圆")){

				 g.drawOval(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));

			 }

	 }

 

	 public void mouseClicked(MouseEvent e) {

		 if(shape.equals("多边形")&&flag){

			 x2=e.getX();

			 y2=e.getY();

			 if(e.getClickCount()==2){

				 g.drawLine(newx1, newy1, newx2, newy2);

				 flag=false;

			 }

			 g.drawLine(newx2, newy2, x2, y2);

			 

			 newx2=x2;

			 newy2=y2;

		    }else if(shape.equals("图形")){

			  arrx[temp]=e.getX();

			  arry[temp]=e.getY();

			  temp++;

			  if(temp==4){

				  int x=arrx[3];

				  int y=arry[3];

				  for(int i=0;i<=10000;i++){

					  Random ran=new Random();

					  int k=ran.nextInt(3);

					  x=(x+arrx[k])/2;

					  y=(y+arry[k])/2;

					  g.drawLine(x, y, x, y);

				  }

				  temp=0;

			  }

		   }else if(shape.equals("立体圆")){

//			   double a=-2,b=-2,c=-1.2,d=2;

			   double a=1.40,b=1.56,c=1.40,d=-6.56;

			   double x = 0,xo=0;

			   double y = 0,yo=0;

			   Color [] Col={Color.BLUE,Color.cyan,Color.green,Color.magenta,Color.red,Color.yellow};

			   for(int i=0;i<=90000;i++){

				  Random r=new Random();      //增加颜色

				  int R=r.nextInt(Col.length);

				  g.setColor(Col[R]);

				  

//				  x=Math.sin(a*yo)-Math.cos(b*xo);

//				  y=Math.sin(c*xo)-Math.cos(d*yo);

				  

				  x=d*Math.sin(a*xo)-Math.sin(b*yo);

				  y=c*Math.cos(a*xo)+Math.cos(b*yo);

				  int temp_x=(int)(x*50);

				  int temp_y=(int)(y*50);

				  

				  g.drawLine(temp_x+500, temp_y+300, temp_x+500, temp_y+300);

				  xo=x;

				  yo=y;

			}  

		}else if(shape.equals("三角形")){

			double a=-2,b=-2,c=-1.2,d=2;

			double x = 0,xo=0;

			double y = 0,yo=0;

			Color [] Col={Color.BLUE,Color.cyan,Color.green,Color.magenta,Color.red,Color.yellow};

			for(int i=0;i<=90000;i++){

				Random r=new Random();      //增加颜色

				int R=r.nextInt(Col.length);

				g.setColor(Col[R]);  

    			x=Math.sin(a*yo)-Math.cos(b*xo);

				y=Math.sin(c*xo)-Math.cos(d*yo);

				int temp_x=(int)(x*50);

				int temp_y=(int)(y*50);			  

				g.drawLine(temp_x+500, temp_y+300, temp_x+500, temp_y+300);

				xo=x;

				yo=y;

			}

		}

	}

	 

	

	 public void mouseDragged(MouseEvent e) {

			x2 = e.getX();

			y2 = e.getY();

			if (shape.equals("曲线")) {

//				g.setStroke(new BasicStroke(10));			

//				g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				g.drawLine(x1, y1, x2, y2);

				x1 = x2;

				y1 = y2;

			}else if(shape.equals("橡皮擦")){

				g.setStroke(new BasicStroke(80));							

				g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				g.setColor(Color.WHITE);

				g.drawLine(x1, y1, x2, y2);

				x1 = x2;

				y1 = y2;

			}else if(shape.equals("喷枪")){

			//	g.setStroke(new BasicStroke(2));	  //不用加粗						

			//	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				for(int k=0;k<20;k++){

					Random i=new Random();       

					int a=i.nextInt(8);

					int b=i.nextInt(10);

					g.drawLine(x2+a, y2+b, x2+a, y2+b);

				}

			}

		}

}
