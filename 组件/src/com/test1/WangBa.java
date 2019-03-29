
/**

 * 功能：画一个乌龟

 */
package com.test1;
import java.awt.*;
import javax.swing.*;

public class WangBa  extends JFrame{

	MyPanel2 mp = null;

	//构造函数

	public WangBa(){

		mp = new MyPanel2();

		

		this.add(mp);

		

		this.setTitle("sky");

		this.setSize(400,300);

		this.setVisible(true);

		this.setLocation(300,200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

			

	public static void main(String[] args) {

		WangBa wangBa = new WangBa();

	}	

}

 

//我的面板。只有JPanel有画图方法，JFrame没有，故必须在JFrame中添加JPanel

class MyPanel2 extends JPanel{

	//定义一个乌龟

	Tortoise t = null;

	

	//构造函数

    public MyPanel2(){	

    	t = new  Tortoise(100,100);

    }

    

    //画乌龟

    public void drawTortoise(int x, int y, Graphics g){

    	//1.画脸

    	g.setColor(Color.green);

    	g.fillOval(x+60, y, 30, 15);

    	//2.画左眼

    	g.setColor(Color.black);

    	g.fillOval(x+65, y+3, 5, 5);

    	//3.画右眼

    	g.fillOval(x+78, y+3, 5, 5);

    	//4.画脖子

    	g.setColor(Color.green);

    	g.fillOval(x+70, y, 10, 42);

    	//5.画乌龟壳

    	g.setColor(Color.red);

    	g.fillOval(x+40, y+40, 70, 100);

    	//6.画左上脚

    	g.setColor(Color.green);

    	g.fillOval(x+15, y+60, 30, 10);

    	//7.画右上脚

    	g.fillOval(x+105, y+60, 30, 10);

    	//8.画左下脚

    	g.fillOval(x+15, y+110, 30, 10);

    	//9.画右下脚

    	g.fillOval(x+105, y+110, 30, 10);

    	//10.画尾巴

    	g.setColor(Color.black);
    	g.drawArc(x+10, y+20, 120, 300, 50, 100);
    	g.drawOval(x, y, 12, 11);
    	g.drawArc(x, y, 11, 12, 11, 11);

    }

 

   

	//覆盖JPanel的paint方法

	//Graphics 是绘图的重要类。你可以把他理解成一只画笔

	public void paint(Graphics g){

			//1.调用父类函数完成初始化任务

			//这句话不能少

			super.paint(g);

			//2.画乌龟，调用方法即可

			this.drawTortoise(50, 50, g);

	}

	

}

 

//定义一个乌龟类

class Tortoise {

		//表示乌龟的横坐标

		int x = 0;

 

		//表示乌龟的纵坐标

		int y = 0;

		

		public int getX() {

			return x;

		}

 

		public void setX(int x) {

			this.x = x;

		}

 

		public int getY() {

			return y;

		}

 

		public void setY(int y) {

			this.y = y;

		}

		public Tortoise(int x, int y){

			this.x = x;

			this.y = y;

		}

}
