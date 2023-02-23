package chat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    void listen() throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        try {
            while (true) {
                Socket socket = serverSocket.accept();
                InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                while (true) {
                    String msg = bufferedReader.readLine();

                    System.out.println(msg);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
