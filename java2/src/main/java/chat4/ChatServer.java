package chat4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

    void listen() throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        List<Socket> list = new ArrayList<>();

        try {
            Socket socket = serverSocket.accept();
            list.add(socket);

            System.out.println("connect ->" + socket.toString());

            new Thread(new Runnable() {
                @Override
                public void run() {

                }
            }).start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
