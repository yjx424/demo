/**
 * ��ʾ���ͨ���̳�Thread�������߳�
 */
package com.test8;

public class HelloWorld {

	public static void main(String[] args) {
		//����һ��Cat����
		Cat cat=new Cat();
		//�����̣߳��ᵼ��run��������
		cat.start();

	}

}


class Cat extends Thread{
	int times=0;
	//��дrun����
	public void run() {
		while(true) {
			//����һ��
			//1000��ʾ1000����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times++;
		System.out.println("hello,world"+times);
		
		if(times==10) {
			//�˳�
			break;
		}
	   }
	}
}