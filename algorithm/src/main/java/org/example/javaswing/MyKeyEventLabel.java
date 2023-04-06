package org.example.javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyKeyEventLabel extends JFrame implements ActionListener, MouseListener, KeyListener, MouseMotionListener {

    private JLabel label;
    public final int STEP = 20;
    private Container contentPane;

    public MyKeyEventLabel(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        contentPane = getContentPane();

        label = new JLabel("김지현");
        label.setSize(80, 25);

//		label.addAncestorListener((AncestorListener) this);
        label.addMouseListener(this);
        contentPane.add(label);

        contentPane.addMouseListener(this);
        contentPane.addKeyListener(this);
        contentPane.addMouseMotionListener(this);

        contentPane.setFocusable(true);
        contentPane.requestFocus();

        setVisible(true);
    }

    public static void main(String[] args) {

        new MyMouseEventLabel("MyMouseEventLabel");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        label.setLocation(x, y);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object obj = e.getSource();
        if (obj == label) {
            contentPane.setBackground(Color.yellow);

        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object obj = e.getSource();
        if (obj != label) {
            contentPane.setBackground(Color.green);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
        int i = e.getKeyCode();

        if (i == KeyEvent.VK_UP) {
            label.setLocation(label.getX(), label.getY() - STEP);
        } else if (i == KeyEvent.VK_DOWN) {
            label.setLocation(label.getX(), label.getY() + STEP);
        } else if (i == KeyEvent.VK_LEFT) {
            label.setLocation(label.getX() - STEP, label.getY());
        } else if (i == KeyEvent.VK_RIGHT) {
            label.setLocation(label.getX() + STEP, label.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point p = e.getPoint();
        label.setLocation(p);

    }

    @Override
    public void mouseMoved(MouseEvent e) {


    }

}
