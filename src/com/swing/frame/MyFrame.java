package com.swing.frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setBounds(500,500,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();

        JButton btn = new JButton("测试按钮");
        btn.setFont(new Font("黑体",Font.BOLD,36));
        panel1.add(btn);
        setContentPane(panel1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
