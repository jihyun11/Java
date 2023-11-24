package org.example.tcpip;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ChatServerFrame extends JFrame implements ActionListener {

    private JTextArea ta;
    private JTextField tf;
    private ServerSocket listener = null;
    private Socket socket = null;
    private BufferedReader in = null;
    private BufferedWriter out = null;
    String nowMsg;
    int incorrectCount = 0;

    int ClientWinMsg = 0;
    private String  lastChar = "";
    private String firstChar = "";

    public ChatServerFrame() {

    }

    public ChatServerFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 350);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        setPanCenter();
        setPanSouth();
        tf.setFocusable(true);

        setVisible(true);

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

        JButton sendBtn = new JButton("보내기");
        sendBtn.setPreferredSize(new Dimension(100, 25));
        sendBtn.addActionListener(this);
        panSouth.add(sendBtn);

        add(panSouth, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        ChatServerFrame csf = new ChatServerFrame("ChatServer");
        csf.setServer();
    }

    public String getLastCharacter(String inMsg) { // 클라이언트에서 보내온 단어 마지막 글자 추출하는 메소드
        return String.valueOf(inMsg.charAt(inMsg.length() - 1));
    }

    public String getFirstCharacter(String outMsg) { // 서버에서 보낸 단어 첫번째 글자 추출하는 메소드
        return String.valueOf(outMsg.charAt(0));

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (!tf.getText().equals("")) {
            String outMsg = tf.getText();
//            try {
//                out.write(outMsg + "\n");
//                out.flush();
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            }


            String lastChar = getLastCharacter(nowMsg()); // 클라이언트 단어의 마지막 글자
            String firstChar = getFirstCharacter(tf.getText()); // 서버가 보낸 단어의 첫글자

            if (lastChar.equals(firstChar)) { // 클라이언트에서 받은 단어의 마지막 글자 == 서버에서 보낼 단어의 첫번째 글자

                if(outMsg.length() >= 2) {
                    try {
                        out.write(outMsg + "\n");
                        out.flush();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    ta.append("[서버]: " + outMsg + "\n");


                } else {
                    ta.append("두글자 이상 입력해 주세요.\n");
                }




            }  else {
                incorrectCount++; // 어긋난 단어 횟수 증가

                if (incorrectCount == 1) { // 어긋난 횟수가 1회인 경우
                    ta.append("다시 입력하세요.(기회: 2번 남음)\n");}


                if (incorrectCount == 2) { // 어긋난 횟수가 1회인 경우
                    ta.append("다시 입력하세요.(기회: 1번 남음)\n");}

                if (incorrectCount >= 3) { // 어긋난 횟수가 3회 이상인 경우
                    ClientWinMsg++;
                    ta.append("당신이 졌습니다.\n"); // 게임 종료 메시지


                } else {
//                    ta.append("다시 입력하세요.\n");
                }
            }
        }
        tf.setText("");
        tf.requestFocus();
    }


    public void setServer() {


        try {
            listener = new ServerSocket(9000);
            ta.append("상대를 기다리는 중......\n");
            socket = listener.accept();
            ta.append("끝말잇기를 시작합니다!\n");

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String lastCharacter = ""; // 클라이언트에서 보내온 단어 마지막 글자 담는 변수




            while(true) {
                String inMsg = in.readLine();
                ta.append("[클라이언트]: " + inMsg + "\n"); // 클라이언트에서 보내온 단어 채팅창에 표시하는 부분
                nowMsg = inMsg; // nowMsg 메소드에 클라이언트가 보내온 단어 담아줌

                // 클라이언트가 보내온 단어 마지막 글자 알려주는 가이드
                lastCharacter = getLastCharacter(String.valueOf(inMsg));
                String nextWordPrompt = "다음 단어를 입력하세요 (끝말: " + lastCharacter.toString() + ")" + "\n";
                ta.append(nextWordPrompt);


            }




        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
                socket.close();
                listener.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String nowMsg() { // 클라이언트에서 보내온 단어 가져오는 메소드
        return nowMsg;
    }

    public int ClientWinMsg() {
        return ClientWinMsg;
    }





}