package com.test9;

public class Runnable1 {

	public static void main(String[] args) {
		Dog dog=new Dog(10);
		Bird bird=new Bird(10);
		Thread t1=new Thread(dog);
		Thread t2=new Thread(bird);
		t1.start();
		t2.start();
		

	}
}
//����ѧ��
class Bird implements Runnable{
	int n=0;
	int res=0;
	int times;
	//���캯��
    public Bird(int n) {
    	this.n=n;	
    	}
		//�ع�run
	public void run() {

		while(true) {
			try {
				Thread.sleep(800);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			res+=(++times);
			System.out.println("��ǰ�����"+res);
			if (times==n) {
				System.out.println("�������"+res);
				break;
			}
		}
	}
	
}

//��ӡ
class Dog implements Runnable{
	int n=0;
	int times;
	public Dog(int n) {
		this.n=n;
	}
	

	//�ع�run
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			times++;
			System.out.println("����һ���̣߳��������"+times+"��hello,world");
			if(times==n) {
				break;
			}
		}
		
	}
	}

	
