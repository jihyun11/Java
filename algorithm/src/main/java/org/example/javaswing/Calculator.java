package org.example.javaswing;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.zip.GZIPInputStream;

public class Calculator extends JFrame implements ActionListener {

    private JButton jButton;
    private JTextField jf;

    public Calculator(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());




        jf = new JTextField("", 20);
        jf.setEditable(false);
        jf.setHorizontalAlignment(JTextField.RIGHT);
        add(jf);
        jf.requestFocus();

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(5, 4, 3, 3));

        jButton = new JButton("<-");
        jButton.addActionListener(this);
        jPanel.add(jButton);
        JButton jButton2 = new JButton("AC");
        jPanel.add(jButton2);
        JButton jButton3 = new JButton("%");
        jPanel.add(jButton3);
        JButton jButton4 = new JButton("x2");
        jPanel.add(jButton4);

        JButton jButton5 = new JButton("7");
        jPanel.add(jButton5);
        JButton jButton6 = new JButton("8");
        jPanel.add(jButton6);
        JButton jButton7 = new JButton("9");
        jPanel.add(jButton7);
        JButton jButtonNa = new JButton("/");
        jPanel.add(jButtonNa);
        JButton jButton8 = new JButton("4");
        jPanel.add(jButton8);
        JButton jButton9 = new JButton("5");
        jPanel.add(jButton9);
        JButton jButton10 = new JButton("6");
        jPanel.add(jButton10);
        JButton jButtonMul = new JButton("*");
        jPanel.add(jButtonMul);
        JButton jButton11 = new JButton("1");
        jPanel.add(jButton11);
        JButton jButton12 = new JButton("2");
        jPanel.add(jButton12);
        JButton jButton13 = new JButton("3");
        jPanel.add(jButton13);
        JButton jButtonM = new JButton("-");
        jPanel.add(jButtonM);
        JButton jButton1 = new JButton(".");
        jPanel.add(jButton1);
        JButton jButton0 = new JButton("0");
        jPanel.add(jButton0);
        JButton jButtonRe = new JButton("=");
        jPanel.add(jButtonRe);
        JButton jButtonP = new JButton("+");
        jPanel.add(jButtonP);















        add(jPanel);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator("calculator");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == jButton) {
            jf.setText("<-");
        }

    }
}
