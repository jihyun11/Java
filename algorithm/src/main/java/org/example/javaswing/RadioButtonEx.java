package org.example.javaswing;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {

    public RadioButtonEx(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container contentPane = new Container();
        setSize(400, 300);

        ButtonGroup bg = new ButtonGroup();

        JRadioButton apple = new JRadioButton("사과", true);
        JRadioButton pear = new JRadioButton("배");
        JRadioButton cherry = new JRadioButton("체리");

        JTextField jTextField = new JTextField(17);
        add(jTextField);

        bg.add(apple);
        bg.add(pear);
        bg.add(cherry);

        contentPane.add(apple); contentPane.add(pear); contentPane.add(cherry); //무쓸모??
        add(apple);
        add(pear);
        add(cherry);

        setVisible(true);

    }

    public static void main(String[] args) {
        new RadioButtonEx("라디오 버튼");
    }
}
