package com.test9;
//功能：演示使用线程的注意事项

public class Runnable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1=new Cat();
		Pig pig1=new Pig();
		Thread thread1=new Thread(pig1);
		Thread thread2=new Thread(pig1);
		thread1.start();
		thread2.start();
	}

}


class Cat extends Thread{
	public void run() {
		System.out.println("11");
		// TODO Auto-generated method stub

	}
}

class Pig implements Runnable {
	public void run() {
		System.out.println("22");
	}
}