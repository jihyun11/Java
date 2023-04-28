package org.example.javaswing.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstForm extends JFrame implements ActionListener {

    private JButton btn1, btn2;

    private JTextField textField;


    private SecondForm secondForm;

    public JTextField getTextField() {
        return textField;
    }

    public FirstForm(String title) {
        setTitle(title);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        btn1 = new JButton("확인");
        btn1.addActionListener(this);
        btn2 = new JButton("변경");
        btn2.addActionListener(this);
        add(textField);
        add(btn1);
        add(btn2);






        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == btn1) {

            secondForm = new SecondForm("second", this);
        }

        else if (obj == btn2) {

            if (secondForm != null) {
                String str = textField.getText();
                secondForm.setTitle(str);
            } else {
                JOptionPane.showMessageDialog(this, "객체를 먼저 생성해 주세요");
            }
        }

    }
}
