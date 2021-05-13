package com.java.swing;

import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("测试窗口");
        frame.setSize(500,800);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton btn = new JButton("测试按钮");

        btn.setFont(new Font("宋体",Font.PLAIN, 14));
        panel.add(btn);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
