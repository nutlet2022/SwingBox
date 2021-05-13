package com.swing.Layout;

import javax.swing.*;
import java.awt.*;

public class SwingCardLayoutDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("卡片窗口管理布局");
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();

        JPanel cards = new JPanel(new CardLayout());
        Font font = new Font("宋体",Font.PLAIN,32);
        UIManager.put("Button.font",font);

        jPanel1.add(new JButton("登录按钮"));
        jPanel1.add(new JButton("注册按钮"));
        jPanel1.add(new JButton("找回密码按钮"));

        UIManager.put("TestField.font",font);

        jPanel2.add(new JTextField("用户名文本框",20));
        jPanel2.add(new JTextField("密码文本框",20));
        jPanel2.add(new JTextField("验证码文本框",20));

        cards.add(jPanel1,"card1");
        cards.add(jPanel2,"card2");

        CardLayout c1 = (CardLayout)(cards.getLayout());
        c1.show(cards,"card1");
        jFrame.add(cards);
        jFrame.setBounds(300,300,1200,800);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
