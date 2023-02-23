package chat2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        Scanner scanner = new Scanner(System.in);

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        while (true) {
            String message = scanner.nextLine();

            printWriter.println(message);
            printWriter.flush();
        }

    }
}
