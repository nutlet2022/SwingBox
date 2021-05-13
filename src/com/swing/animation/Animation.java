package com.swing.animation;

import javax.swing.*;

public class Animation {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyPanel panel = new MyPanel();
        frame.setBounds(100,100,1200,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);

        while (true) {
            panel.animate();
            try {
               Thread.sleep(400);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
