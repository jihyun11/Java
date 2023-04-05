package org.example.javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatClientFrom extends JFrame implements ActionListener {

    private JTextArea ta;
    private JTextField tf;

    public ChatClientFrom(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 350);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        setPanCenter();
        setPanSouth();


        setVisible(true);

        tf.setFocusable(true);
        tf.requestFocus();
    }

    private void setPanSouth() {


        JPanel panSouth = new JPanel();
        panSouth.setBackground(Color.YELLOW);

        tf = new JTextField(17);
        tf.addActionListener(this);
        panSouth.add(tf);

        JButton sendbtn = new JButton("보내기");
        sendbtn.addActionListener(this);
        panSouth.add(sendbtn);

        add(panSouth, BorderLayout.SOUTH);
    }

    private void setPanCenter() {
        JPanel panCenter = new JPanel();
        panCenter.setLayout(new BorderLayout());
        panCenter.setBackground(Color.BLUE);


        ta = new JTextArea(8, 15);
        ta.setLineWrap(true);
        ta.setEditable(false);
        JScrollPane sp = new JScrollPane(ta,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panCenter.add(sp);

        add(panCenter, BorderLayout.CENTER);
    }

    public static void main(String[] args) {

        new ChatClientFrom("ChatClientForm");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ta.append("[메시지] : " + tf.getText() + "\n");
        tf.setText("");
        tf.requestFocus();

    }

}
