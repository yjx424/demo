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
//算数学题
class Bird implements Runnable{
	int n=0;
	int res=0;
	int times;
	//构造函数
    public Bird(int n) {
    	this.n=n;	
    	}
		//重构run
	public void run() {

		while(true) {
			try {
				Thread.sleep(800);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			res+=(++times);
			System.out.println("当前结果是"+res);
			if (times==n) {
				System.out.println("最后结果是"+res);
				break;
			}
		}
	}
	
}

//打印
class Dog implements Runnable{
	int n=0;
	int times;
	public Dog(int n) {
		this.n=n;
	}
	

	//重构run
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			times++;
			System.out.println("我是一个线程，在输出第"+times+"个hello,world");
			if(times==n) {
				break;
			}
		}
		
	}
	}

	
