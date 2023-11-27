package org.example.tcpip;

import java.io.*;
import java.net.*;

public class WordChainServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    private String firstWord = "행복"; // 첫 단어 설정

    public WordChainServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            System.err.println("Could not listen on port " + port);
            System.exit(-1);
        }
    }

    public void startServer() {
        try {
            System.out.println("Waiting for a client...");
            clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket);

            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // 클라이언트에게 첫 단어를 전송합니다.
            out.println(firstWord);

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                // 클라이언트로부터 단어를 받은 후 여기서 처리할 작업을 추가할 수 있습니다.
                // 이 부분에서 끝말잇기 규칙에 따라 단어를 체크하고 클라이언트에게 응답을 보낼 수 있습니다.
                // 이 예제에서는 클라이언트로부터 단어를 받은 후 아무런 작업을 수행하지 않고 종료합니다.
                break;
            }

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WordChainServer server = new WordChainServer(9000); // 포트 번호를 지정합니다.
        server.startServer();
    }
}
