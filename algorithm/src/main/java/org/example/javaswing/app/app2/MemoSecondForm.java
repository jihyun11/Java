package org.example.javaswing.app.app2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemoSecondForm extends JFrame implements ActionListener {
    private JTextField textField;

    private JButton mbtn3;

    private MemoFirstForm memoFirstForm;


    public MemoSecondForm(String title, MemoFirstForm memoFirstForm) {
        this.memoFirstForm = memoFirstForm;
        setTitle(title);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocation(200, 200);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        mbtn3 = new JButton("변경");
        mbtn3.addActionListener(this);
        add(textField);
        add(mbtn3);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == mbtn3) {
            String str = textField.getText();
            memoFirstForm.getMemoTextField().setText(str);
        }

    }
}
