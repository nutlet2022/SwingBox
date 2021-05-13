package com.swing.animation;

import java.awt.*;

public class MyPanel extends Panel {
    Ball ball;
    public MyPanel() {
        ball = new Ball(0,0,100,20,20);
    }

    public void animate() {
        ball.update();
        this.repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        ball.render(g);
    }
}
