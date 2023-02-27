package chat2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        Scanner scanner = new Scanner(System.in);

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                    while (true) {
                        String msg = bufferedReader.readLine();

                        System.out.println(msg);
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        while (true) {
            String message = scanner.nextLine();

            printWriter.println(message);
            printWriter.flush();
        }
    }
}
