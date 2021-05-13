package com.swing.animation;

import java.awt.*;

public class Ball {
    private int cx,cy;
    private int vx,vy;
    private int d;

    public Ball(int cx,int cy, int d ,int vx, int vy) {
        this.cx = cx;
        this.cy = cy;
        this.vx = vx;
        this.vy = vy;
        this.d =  d;
    }

    public void update() {
        cx += vx;
        cy += vy;
    }

    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(cx,cy,d,d);
    }
}
