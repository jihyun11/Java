package org.example.javaswing;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    public Calculator(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JTextField jf = new JTextField("", 20);
        add(jf);
        JButton jButton = new JButton("1");
        add(jButton);
        JButton jButton2 = new JButton("2");
        add(jButton2);
        JButton jButton3 = new JButton("3");
        add(jButton3);
        JButton jButton4 = new JButton("4");
        add(jButton4);
        JButton jButton5 = new JButton("5");
        add(jButton5);
        JButton jButton6 = new JButton("6");
        add(jButton6);
        JButton jButton7 = new JButton("7");
        add(jButton7);
        JButton jButton8 = new JButton("8");
        add(jButton8);
        JButton jButton9 = new JButton("9");
        add(jButton9);

        JButton jButton0 = new JButton("0");
        add(jButton0);
        JButton jButtonP = new JButton("+");
        add(jButtonP);
        JButton jButtonM = new JButton("-");
        add(jButtonM);
        JButton jButtonMul = new JButton("*");
        add(jButtonMul);
        JButton jButtonNa = new JButton("/");
        add(jButtonNa);
        JButton jButtonRe = new JButton("=");
        add(jButtonRe);
        JButton jButtonCan = new JButton("AC");
        add(jButtonCan);




        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator("calculator");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
