package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    public Calculator(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
//        setLayout(new FlowLayout());

        JLabel label = new JLabel("0", JLabel.RIGHT);
        JPanel btnView = new JPanel();

//        btnView.setLayout(new GroupLayout(5, 3, 2, 2));

        JButton btn = new JButton("1");
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator("calculator");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
