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

public class ChatClientFrame extends JFrame implements ActionListener {

    private JTextArea ta;
    private JTextField tf;
    private Socket socket = null;
    private BufferedReader in = null;
    private BufferedWriter out = null;

    boolean isFirstWord = true;

    String nowMsg;
    int incorrectCount = 0;

    private String recieveMsg = "";

//    ChatServerFrame chatServerFrame = new ChatServerFrame();

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
        //panSouth.setBackground(Color.YELLOW);

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
        ChatClientFrame ccf = new ChatClientFrame("ChatClient");
        ccf.setSocket();
    }

    public String getLastCharacter(String inMsg) { // 서버에서 보내온 단어 마지막 글자 추출하는 메소드
        if (inMsg != null) {
            return  String.valueOf(inMsg.charAt(inMsg.length() - 1));
//
        }
        return "";

    }

    public String getFirstCharacter(String outMsg) { // 클라이언트에서 보낸 단어 첫번째 글자 추출하는 메소드
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

            String lastChar = getLastCharacter(nowMsg()); // 서버에서 보내온 단어의 마지막 글자
            String firstChar = getFirstCharacter(tf.getText()); // 클라이언트가 보낸 단어의 첫글자

//            if (lastChar.equals(firstChar) || !isFirstWord) { //  서버에서 보내온 단어의 마지막 글자 ==  클라이언트가 보낸 단어의 첫번째 글자
//
//                if(outMsg.length() >= 2) {
//                    try {
//                        out.write(outMsg + "\n");
//                        out.flush();
//                    } catch (IOException e1) {
//                        e1.printStackTrace();
//                    }
//                    ta.append("[클라이언트]: " + tf.getText() + "\n");
//                } else {
//                    ta.append("두글자 이상 입력해 주세요.\n");
//                }
//
//
//
//
//
//            }  else {
//                incorrectCount++; // 어긋난 단어 횟수 증가
//
//                if (incorrectCount == 1) { // 어긋난 횟수가 1회인 경우
//                    ta.append("다시 입력하세요.(기회: 2번 남음)\n");}
//
//
//                if (incorrectCount == 2) { // 어긋난 횟수가 1회인 경우
//                    ta.append("다시 입력하세요.(기회: 1번 남음)\n");}
//
//                if (incorrectCount >= 3) { // 어긋난 횟수가 3회 이상인 경우
//                    ta.append("당신이 졌습니다.\n"); // 게임 종료 메시지
//                    // 여기에 채팅 끊기 로직 추가하기
//                }
//                else {
////                    ta.append("다시 입력하세요.\n");
//                }
//            }
//
//        }

            if (lastChar.equals(firstChar) || lastChar == "") {
                if (!isFirstWord) {
                    if (outMsg.length() >= 2) {
                        try {
                            out.write(outMsg + "\n");
                            out.flush();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        ta.append("[클라이언트]: " + outMsg + "\n");
                    } else {
                        ta.append("두 글자 이상 입력해 주세요.\n");
                    }
                }
            } else {
                incorrectCount++; // 어긋난 단어 횟수 증가

                if (incorrectCount == 1) {
                    ta.append("다시 입력하세요. (기회: 2번 남음)\n");
                } else if (incorrectCount == 2) {
                    ta.append("다시 입력하세요. (기회: 1번 남음)\n");
                } else if (incorrectCount >= 3) {
                    ta.append("당신이 졌습니다.\n"); // 게임 종료 메시지
                    // 여기에 채팅 끊기 로직 추가하기
                } else {
                    ta.append("다시 입력하세요.\n");
                }
            }

//            tf.setText("");
//            tf.requestFocus();
        }



        tf.setText("");
        tf.requestFocus();
    }

    public void setSocket() {
        try {

            socket = new Socket("localhost", 9000);

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String lastCharacter = ""; // 서버에서 보내온 단어 마지막 글자 담는 변수



            while(true) {
                if (isFirstWord) {
                    String firstWord = "행복";
                    ta.append("[첫단어]: " + firstWord + "\n");
                    // 첫 번째 단어 표시 후에는 false로 변경하여 다음에는 표시되지 않도록 설정
                }
                isFirstWord = false;

                ChatServerFrame chatServerFrame = new ChatServerFrame();

                if (chatServerFrame.ClientWinMsg > 0) {
                    ta.append("당신이 이겼습니다!\n");
                }

                String inMsg = in.readLine();
                ta.append("[서버]: " + inMsg + "\n");
                nowMsg = inMsg; // nowMsg 메소드에 서버가 보내온 단어 담아줌

                // 서버가 보내온 단어 마지막 글자 알려주는 가이드
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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public String nowMsg() { // 서버에서 보내온 단어 가져오는 메소드
        return nowMsg;
    }

}
