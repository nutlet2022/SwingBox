package com.swing.action;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class SwingActionListener1 extends JFrame {
    JLabel label;
    JButton button;

    int clicks = 0;

    public SwingActionListener1() {
        setTitle("动作事件监听器");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,1000,500);
        JPanel ocntentPane = new JPanel();

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));

        setContentPane(contentPane);
        button = new JButton("我是普通按钮");
        button.setFont(new Font("黑体",Font.BOLD,36));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("按钮被单击了 " + (clicks ++) + " 次");
            }
        });

        contentPane.add(button);
        label = new JLabel(" ");
        label.setFont(new Font("楷体",Font.BOLD,36));
        label.setText("初始化次数");
        contentPane.add(label, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingActionListener1 frame = new SwingActionListener1();
        frame.setVisible(true);
    }
}
