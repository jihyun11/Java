package multichat;

import chat.ConnectClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    void listen() throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        List<Socket> list = new ArrayList<>();

        while (true) {
            Socket connectClient = serverSocket.accept();
            list.add(connectClient);
            System.out.println("connect ->" + connectClient.toString());

            new ConnectClient(connectClient, list).start();




        }

    }
}
