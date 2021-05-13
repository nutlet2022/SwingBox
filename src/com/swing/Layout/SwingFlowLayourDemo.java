package com.swing.Layout;

import javax.swing.*;
import java.awt.*;

public class SwingFlowLayourDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Swing 流式布局管理器");
        JPanel jPanel = new JPanel();

        Font font = new Font("宋体", Font.PLAIN,32);
        UIManager.put("Button.font",font);

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("1");
        JButton btn3 = new JButton("1");
        JButton btn4 = new JButton("1");
        JButton btn5 = new JButton("1");
        JButton btn6 = new JButton("1");
        JButton btn7 = new JButton("1");
        JButton btn8 = new JButton("1");
        JButton btn9 = new JButton("1");

        jPanel.add(btn1);
        jPanel.add(btn2);
        jPanel.add(btn3);
        jPanel.add(btn4);
        jPanel.add(btn5);
        jPanel.add(btn6);
        jPanel.add(btn7);
        jPanel.add(btn8);
        jPanel.add(btn9);

        jPanel.setLayout(new FlowLayout(FlowLayout.LEADING,40,40));
        jPanel.setBackground(Color.gray);
        jFrame.add(jPanel);
        jFrame.setBounds(20,20,500,500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
