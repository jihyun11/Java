package org.example.javaswing;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMouseEventLabel extends JFrame implements ActionListener, KeyListener {

    private JLabel label;
    public final int STEP = 20;
    private Container contentPane;

    public MyMouseEventLabel(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        contentPane = getContentPane();

        label = new JLabel("김지현");
        label.setSize(80, 25);

//		label.addAncestorListener((AncestorListener) this);
        contentPane.add(label);

        contentPane.addKeyListener(this);

        contentPane.setFocusable(true);
        contentPane.requestFocus();

        setVisible(true);
    }

    public static void main(String[] args) {

        new MyMouseEventLabel("자바 프로그래밍 응용 과제");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();


    }


    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
        int i = e.getKeyCode();

        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        if (c == KeyEvent.VK_ENTER) {
            label.setText("r=" + r + ", g=" + g + ", b=" + b);
            contentPane.setBackground(new Color(r, g, b));
        } else if (i == KeyEvent.VK_Q) {
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}

