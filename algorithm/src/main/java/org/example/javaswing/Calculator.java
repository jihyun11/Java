package org.example.javaswing;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JButton jButton;

    public Calculator(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());



        JTextField jf = new JTextField("", 20);
        add(jf);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(3, 3));

        jButton = new JButton("1");
        jButton.addActionListener(this);
        jPanel.add(jButton);

        JButton jButton2 = new JButton("2");
        jPanel.add(jButton2);

        JButton jButton3 = new JButton("3");
        jPanel.add(jButton3);
        JButton jButton4 = new JButton("4");
        jPanel.add(jButton4);
        JButton jButton5 = new JButton("5");
        jPanel.add(jButton5);
        JButton jButton6 = new JButton("6");
        jPanel.add(jButton6);
        JButton jButton7 = new JButton("7");
        jPanel.add(jButton7);
        JButton jButton8 = new JButton("8");
        jPanel.add(jButton8);
        JButton jButton9 = new JButton("9");
        jPanel.add(jButton9);

        add(jPanel);
//        JButton jButton0 = new JButton("0");
//        add(jButton0);
//        JButton jButtonP = new JButton("+");
//        add(jButtonP);
//        JButton jButtonM = new JButton("-");
//        add(jButtonM);
//        JButton jButtonMul = new JButton("*");
//        add(jButtonMul);
//        JButton jButtonNa = new JButton("/");
//        add(jButtonNa);
//        JButton jButtonRe = new JButton("=");
//        add(jButtonRe);
//        JButton jButtonCan = new JButton("AC");
//        add(jButtonCan);




        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator("calculator");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == jButton) {
            System.out.println("1 누름");
        }

    }
}
