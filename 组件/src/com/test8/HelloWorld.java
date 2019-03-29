/**
 * 演示如何通过继承Thread来开发线程
 */
package com.test8;

public class HelloWorld {

	public static void main(String[] args) {
		//创建一个Cat对象
		Cat cat=new Cat();
		//启动线程，会导致run函数运行
		cat.start();

	}

}


class Cat extends Thread{
	int times=0;
	//重写run函数
	public void run() {
		while(true) {
			//休眠一秒
			//1000表示1000毫秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times++;
		System.out.println("hello,world"+times);
		
		if(times==10) {
			//退出
			break;
		}
	   }
	}
}