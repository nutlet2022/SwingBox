package com.swing.action;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SwingKeyListener extends JFrame implements KeyListener {

    private JTextArea text = new JTextArea();
    public SwingKeyListener() {
        setTitle("键盘监听事件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,500,500);

        JScrollPane contentPane = new JScrollPane(text);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));

        setContentPane(contentPane);
        text.addKeyListener(this);
        text.setFont(new Font("黑体", Font.BOLD,36));
    }

    public static void main(String[] args) {
        SwingKeyListener frame = new SwingKeyListener();
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        text.append("\n键盘" + KeyEvent.getKeyText(arg0.getKeyCode()) + "键向下\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
