package org.example.javaswing.app.app2;

import org.example.javaswing.app.FirstForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemoFirstForm extends JFrame implements ActionListener {

    private JButton fbtn1, fbtn2;

    private JTextField memoTextField;

    private FirstForm firstForm;

    private MemoSecondForm memoSecondForm;
    public MemoFirstForm(String title) {
        setTitle(title);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        memoTextField = new JTextField(10);
        fbtn1 = new JButton("확인");
        fbtn1.addActionListener(this);
        fbtn2 = new JButton("변경");
        fbtn2.addActionListener(this);
        add(memoTextField);
        add(fbtn1);
        add(fbtn2);






        setVisible(true);
    }

    public JTextField getMemoTextField() {
        return memoTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == fbtn1) {
            new MemoSecondForm("secondtitle", this);
        }

        else if (obj == fbtn2) {
            if (memoSecondForm != null) {
                String str1 = memoTextField.getText();
                memoSecondForm.setTitle(str1);
            } else {
                JOptionPane.showMessageDialog(this, "객체를 먼저 생성해 주세요");
            }
        }

    }
}
