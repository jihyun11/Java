package org.example.javaswing.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatClientForm extends JFrame implements ActionListener {

    private JTextArea ta;
    private JTextField tf;
    public ChatClientForm(String title) {
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

    private void setPanSouth() {
        JPanel panSouth = new JPanel();

        tf = new JTextField(14);
        tf.addActionListener(this);
        panSouth.add(tf);

        JButton sendBtn = new JButton("전송");
        sendBtn.addActionListener(this);
        sendBtn.setPreferredSize(new Dimension(100, 25));
        panSouth.add(sendBtn);

        add(panSouth, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new ChatClientForm("ChatClientForm");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        ta.append("[메시지]: " + tf.getText() + "\n");

        if (obj == tf) {
            tf.setText("");
            tf.requestFocus();

        }
    }
}
