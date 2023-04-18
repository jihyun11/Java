package org.example.javaswing.component;

import javax.swing.*;
import java.awt.*;

public class ImageLabelEx extends JFrame {

    public ImageLabelEx(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 500);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel lbl = new JLabel("자바 프로그래밍 응용");
        add(lbl);

        ImageIcon image = new ImageIcon("images/gosling.jpg");
        JLabel imgLabel = new JLabel(image);
        add(imgLabel);

//		ImageIcon icon = new ImageIcon("images/icon.gif");
//		JButton btn = new JButton("전화줘~", icon);
//		add(btn);

        ButtonGroup g = new ButtonGroup();

        JRadioButton rb1 = new JRadioButton("남자", true);
        add(rb1);

        JRadioButton rb2 = new JRadioButton("여자");
        add(rb2);

        g.add(rb1);
        g.add(rb2);


        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageLabelEx("ImageLabelEx");

    }
}
