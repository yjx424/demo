package com.test11;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShakeFrame extends JFrame {
private JButton btn = new JButton("Click me!");

public ShakeFrame() {
super("¶¶¶¯´°¿Ú");
this.setSize(300, 200);
this.setVisible(true);
this.setResizable(false);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

this.setLayout(null);
btn.setBounds(10, 10, 100, 30);
this.add(btn);

btn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int x = ShakeFrame.this.getX();
int y = ShakeFrame.this.getY();
for (int i = 0; i < 20; i++) {
if ((i & 1) == 0) {
x += 3;
y += 3;
} else {
x -= 3;
y -= 3;
}
ShakeFrame.this.setLocation(x, y);
try {
Thread.sleep(50);
} catch (InterruptedException e1) {
e1.printStackTrace();
}
}
}
});
}

public static void main(String[] args) {
new ShakeFrame();
}
} 