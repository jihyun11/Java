package chat2;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class ConnectClient implements Runnable {

    Socket socket;
    List<Socket> list;

    public ConnectClient(Socket socket, List<Socket> list) {
        this.socket = socket;
        this.list = list;
    }

    @Override
    public void run() {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            while (true) {
                String msg = bufferedReader.readLine();

                for (int i = 0; i < list.size(); i++) {
                    OutputStream outputStream = list.get(i).getOutputStream();
                    PrintWriter printWriter = new PrintWriter(outputStream);

                    printWriter.println(msg);
                    printWriter.flush();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
