package org.example.javaswing;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class normalIcon extends JFrame {



    public normalIcon(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        Container contentPane = new Container();

        ImageIcon normal = new ImageIcon("/Users/mozzi/Desktop/java/algorithm/src/main/java/org/example/javaswing/normalIcon.gif");
        ImageIcon roll = new ImageIcon("/Users/mozzi/Desktop/java/algorithm/src/main/java/org/example/javaswing/pressedIcon.gif");
        ImageIcon press = new ImageIcon("/Users/mozzi/Desktop/java/algorithm/src/main/java/org/example/javaswing/rolloverIcon.gif");

        JButton btn = new JButton("call~~", normal);
        btn.setPressedIcon(press);
        btn.setRolloverIcon(roll);
        contentPane.add(btn);
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new normalIcon("이미지 버튼");
    }

}
