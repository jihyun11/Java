package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

    void listen() throws IOException {
        // ServerSocket <- 소켓이 서버에 연결되는지 바라보는애
        // Socket <- 컴퓨터끼리 연결되는것에 대한 클래스
        ServerSocket serverSocket = new ServerSocket(9999);
        List<Socket> list = new ArrayList<>();

        while (true) {
            // 사용자가 참가하는지 계속 기다리고 있어요
            Socket connectClient = serverSocket.accept();
            list.add(connectClient);
            System.out.println("connect -> " + connectClient.toString());

            new ConnectClient(connectClient, list).start();

        }

    }
}

