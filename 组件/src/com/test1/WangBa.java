
/**

 * ���ܣ���һ���ڹ�

 */
package com.test1;
import java.awt.*;
import javax.swing.*;

public class WangBa  extends JFrame{

	MyPanel2 mp = null;

	//���캯��

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

 

//�ҵ���塣ֻ��JPanel�л�ͼ������JFrameû�У��ʱ�����JFrame�����JPanel

class MyPanel2 extends JPanel{

	//����һ���ڹ�

	Tortoise t = null;

	

	//���캯��

    public MyPanel2(){	

    	t = new  Tortoise(100,100);

    }

    

    //���ڹ�

    public void drawTortoise(int x, int y, Graphics g){

    	//1.����

    	g.setColor(Color.green);

    	g.fillOval(x+60, y, 30, 15);

    	//2.������

    	g.setColor(Color.black);

    	g.fillOval(x+65, y+3, 5, 5);

    	//3.������

    	g.fillOval(x+78, y+3, 5, 5);

    	//4.������

    	g.setColor(Color.green);

    	g.fillOval(x+70, y, 10, 42);

    	//5.���ڹ��

    	g.setColor(Color.red);

    	g.fillOval(x+40, y+40, 70, 100);

    	//6.�����Ͻ�

    	g.setColor(Color.green);

    	g.fillOval(x+15, y+60, 30, 10);

    	//7.�����Ͻ�

    	g.fillOval(x+105, y+60, 30, 10);

    	//8.�����½�

    	g.fillOval(x+15, y+110, 30, 10);

    	//9.�����½�

    	g.fillOval(x+105, y+110, 30, 10);

    	//10.��β��

    	g.setColor(Color.black);
    	g.drawArc(x+10, y+20, 120, 300, 50, 100);
    	g.drawOval(x, y, 12, 11);
    	g.drawArc(x, y, 11, 12, 11, 11);

    }

 

   

	//����JPanel��paint����

	//Graphics �ǻ�ͼ����Ҫ�ࡣ����԰�������һֻ����

	public void paint(Graphics g){

			//1.���ø��ຯ����ɳ�ʼ������

			//��仰������

			super.paint(g);

			//2.���ڹ꣬���÷�������

			this.drawTortoise(50, 50, g);

	}

	

}

 

//����һ���ڹ���

class Tortoise {

		//��ʾ�ڹ�ĺ�����

		int x = 0;

 

		//��ʾ�ڹ��������

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
