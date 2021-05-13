package com.java.swing;

import javax.swing.*;
import java.awt.*;

public class SwingExample extends JFrame {

    public void CreateJFrame(String title) {
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("这是一个 Frame 窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);       //文字居中

        container.add(jl);
        container.setBackground(Color.WHITE);
        jf.setVisible(true);        //窗体可视
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingExample().CreateJFrame("创建一个 JFrame 窗体");
    }


}
