package chat3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    void listen() throws IOException {
        ServerSocket serversocket = new ServerSocket(9999); //포트를 지정하고 서버를 엶

        while (true) {
            try {
                Socket socket = serversocket.accept();
                InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                while (true) { //보여주기만 하는 담당
                    String msg = bufferedReader.readLine();
                    System.out.println(msg);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
