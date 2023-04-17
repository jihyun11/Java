package org.example.javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondForm extends JFrame implements ActionListener{
    private JButton btn;
    private JTextField textField;

    private FirstForm firstForm;
    public SecondForm(String title, FirstForm firstForm) {
        this.firstForm = firstForm;
        setTitle(title);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(200, 200);
        setLayout(new FlowLayout());

        textField = new JTextField(15);
        btn = new JButton("변경");
        btn.addActionListener( this);
        add(textField);
        add(btn);




        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == textField ||  obj == btn) {
            String str = textField.getText();
            firstForm.getTextField().setText(str);
        }


    }
}
