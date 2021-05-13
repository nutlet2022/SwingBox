package com.java.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog extends JDialog {

    public MyJDialog(MyFrame frame) {
        super(frame,"first JDiaLog window",true);
        Container container = getContentPane();
        container.add(new JLabel("this is dialog box"));
        setBounds(120,120,100,100);
    }

}


public class MyFrame extends JFrame {
    public static void main(String[] args){
        new MyFrame();
    }

    public MyFrame() {
        JFrame jf = new JFrame("窗体");
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("这是一个 Frame 窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);       //文字居中
        container.setLayout(null);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);

        JButton bl = new JButton("弹出对话框");
        bl.setBounds(10,10,200,21);
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(bl);

        container.add(jl);
        container.setBackground(Color.WHITE);
        jf.setVisible(true);        //窗体可视
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
