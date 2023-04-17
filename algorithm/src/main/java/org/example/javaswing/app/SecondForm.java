package org.example.javaswing.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondForm extends JFrame implements ActionListener {

    private JTextField textField;

    private JButton btn1, btn3;

    private FirstForm firstForm;

    public SecondForm(String title, FirstForm firstForm) {
        this.firstForm = firstForm;
        setTitle(title);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(200, 200);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        btn3 = new JButton("변경");
        btn3.addActionListener(this);
        add(textField);
        add(btn3);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == btn3) {
            String str = textField.getText();
            firstForm.getTextField().setText(str);
        }
    }
}
