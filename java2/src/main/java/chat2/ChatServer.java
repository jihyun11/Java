package chat2;

import java.io.*;
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

                OutputStream outputStream = socket.getOutputStream();
                PrintWriter printWriter = new PrintWriter(outputStream);

                while (true) {
                    String msg = bufferedReader.readLine();

                    System.out.println(msg);
                    printWriter.println(msg);
                    printWriter.flush();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
