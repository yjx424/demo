package com.test5;

	import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import java.io.IOException; 
public class KeyboardSimulator { 
private static Robot robot = null; 
static { 
try { 
robot = new Robot(); 
} catch (AWTException ex) { 
throw new RuntimeException(ex); 
} 
}

private KeyboardSimulator() { 
//����ʵ���� 
} 
public static void input(String str){ 
if(str!=null){ 
for(char c : str.toCharArray()){ 
pressKey(c); 
} 
robot.keyPress(KeyEvent.VK_ENTER); 
} 
} 

/** 533001198510124839
 * 
* ģ�ⰴ�°��� 
* @param keyvalue 
*/ 
private static void pressKey(int keyvalue) { 
robot.keyPress(keyvalue); // ���°��� 
robot.keyRelease(keyvalue); // �ͷŰ��� 
} 
public static void main(String[] args) throws IOException { 
input("111"); 
} 
} 



