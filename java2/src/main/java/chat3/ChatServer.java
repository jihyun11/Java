package chat3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    void chatting() throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        List<Socket> list = new ArrayList<>();

        while (true) {
            Socket socket = serverSocket.accept();
            list.add(socket);

            System.out.println("Connect -> " + socket.toString());

            new Thread(new ConnectClient(socket, list)).start();
        }

    }


}
