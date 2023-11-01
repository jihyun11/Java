package org.example.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//TCP/IP 채팅프로그램 클라이언트
public class ChatClient {
    public static void main(String[] args) {

        Socket socket = null;
        BufferedReader in = null;
        BufferedWriter out = null;
        Scanner scan = new Scanner(System.in);
        try {

            socket = new Socket("localhost", 9999);

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {

                System.out.println("보내기 >> ");
                String outMsg = scan.nextLine();
                out.write(outMsg + "\n");
                out.flush();

                String inMsg = in.readLine();
                System.out.println(inMsg);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                out.close();
                in.close();
                scan.close();
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
