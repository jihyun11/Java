package org.example.chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientFrame extends JFrame implements ActionListener {

    private JTextArea ta;
    private JTextField tf;

    private Socket socket = null;
    private BufferedReader in = null;
    private BufferedWriter out = null;
    public ChatClientFrame(String title) {
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
        ChatClientFrame ccf = new ChatClientFrame("ChatClientFrame");
        ccf.setSocket();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();


        if (!tf.getText().equals("")) {
            String outMsg = tf.getText();
            try {
                out.write(outMsg + "\n");
                out.flush();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }



            ta.append("[클라이언트]: " + tf.getText() + "\n");

        }
        tf.setText("");
        tf.requestFocus();
    }

    public void setSocket() {

        try {

            socket = new Socket("localhost", 9999);

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {

                String inMsg = in.readLine(); //#id#roomid#msg#sid
                ta.append("[서버]: " + inMsg + "\n");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                out.close();
                in.close();
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
