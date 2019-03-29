package com.test10;

import javax.net.ssl.SSLException;

public class Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiketWindow tiketWindow1=new TiketWindow();
		//TiketWindow tiketWindow2=new TiketWindow();
		//TiketWindow tiketWindow3=new TiketWindow();
		Thread thread1=new Thread(tiketWindow1);
		Thread thread2=new Thread(tiketWindow1);
		Thread thread3=new Thread(tiketWindow1);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}

class TiketWindow implements Runnable{
	private int nums=2000;

	@Override
	public void run() {

		// TODO Auto-generated method stub
		while (true) {
			synchronized (this) {
				if (nums>0) {
					System.out.println
					(Thread.currentThread().getName()+"正在售出第"+nums+"张票");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					nums--;
				}else {
					break;
				}
			}
			
		}
		
	}
}