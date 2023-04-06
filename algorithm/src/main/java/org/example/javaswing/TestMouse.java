package org.example.javaswing;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestMouse extends JFrame implements ActionListener {

    private JButton button;
    private JButton button1;

    private JButton button2;

    private ImageIcon icon1;
    public TestMouse(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300, 300);

        button = new JButton("보내기");
        button.addActionListener(this);
        add(button);

        ImageIcon icon = new ImageIcon("/Users/mozzi/Desktop/java/algorithm/src/main/java/org/example/javaswing/normalIcon.gif");
        button1 = new JButton(icon);
        button1.addActionListener(this);
        add(button1);

        icon1 = new ImageIcon("/Users/mozzi/Desktop/java/algorithm/src/main/java/org/example/javaswing/pressedIcon.gif");




        setVisible(true);
    }

    public static void main(String[] args) {
        new TestMouse("테스트 마우스");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == button) {
            button.setText("전송");
        }

        if (obj == button1) {
            button1.setPressedIcon(icon1);
        }
    }
}
