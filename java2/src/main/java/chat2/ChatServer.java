package chat2;

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
            Socket socket = serverSocket.accept();
            list.add(socket);

            System.out.println("connect -> " + socket.toString());

            new Thread(new ConnectClient(socket, list)).start();
        }
    }
}
