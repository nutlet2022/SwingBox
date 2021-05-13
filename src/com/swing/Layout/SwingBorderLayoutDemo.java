package com.swing.Layout;

import javax.swing.*;
import java.awt.*;

public class SwingBorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(new BorderLayout());

        Font font = new Font("宋体",Font.PLAIN,36);
        UIManager.put("Button.font",font);
        JButton button1 = new JButton("上");
        JButton button2 = new JButton("左");
        JButton button3 = new JButton("中");
        JButton button4 = new JButton("右");
        JButton button5 = new JButton("下");

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.WEST);
        frame.add(button3,BorderLayout.CENTER);
        frame.add(button4,BorderLayout.EAST);
        frame.add(button5,BorderLayout.SOUTH);

        frame.setBounds(500,500,500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
