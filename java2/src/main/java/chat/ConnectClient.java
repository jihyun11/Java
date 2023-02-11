package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ConnectClient extends Thread{
    Socket socket;
    List<Socket> list;

    public ConnectClient(Socket socket, List<Socket> list) {
        this.socket = socket;
        this.list = list;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String msg = bufferedReader.readLine();
                for (int i = 0; i < list.size(); i++) {
                    Socket socket1 = list.get(i);
                    PrintWriter printWriter = new PrintWriter(socket1.getOutputStream());
                    printWriter.println(msg);
                    printWriter.flush();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
