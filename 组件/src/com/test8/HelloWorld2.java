/**
 * ��ʾ���ͨ���̳�Thread�������߳�
 */
package com.test8;

public class HelloWorld2 {

	public static void main(String[] args) {
		//����һ��Cat����
		Dog dog=new Dog();
		//����һ���̶߳���
		Thread thread=new Thread(dog);
		//�����̣߳��ᵼ��run��������
		thread.start();
		
	}

}


class Dog implements Runnable {
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