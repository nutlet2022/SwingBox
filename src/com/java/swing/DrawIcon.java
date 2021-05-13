package com.java.swing;

import javax.swing.*;
import java.awt.*;

public class DrawIcon implements Icon {

    private int width;
    private int height;

    public int getIconHeight() {
        return this.height;
    }

    public int getIconWidth() {
        return this.width;
    }

    public DrawIcon(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void paintIcon(Component arg0, Graphics arg1,int x, int y) {
        arg1.fillOval(x, y,width,height);
    }

    public static void main(String[] args) {
        DrawIcon icon = new DrawIcon(15, 15);

        JFrame jf = new JFrame("??");
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("这是一个 Frame 窗体",icon,SwingConstants.CENTER);
        //jl.setHorizontalAlignment(SwingConstants.CENTER);       //文字居中

        container.add(jl);
        container.setBackground(Color.WHITE);
        jf.setVisible(true);        //窗体可视
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
