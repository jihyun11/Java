package chat3;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999); //열린 서버에 연결하는 부분
        Scanner scanner = new Scanner(System.in); //키보드를 통해 입력받는 객체

        OutputStream outputStream = socket.getOutputStream(); //스트림을 이용해 문자열을 가공
        PrintWriter printWriter = new PrintWriter(outputStream);
        //객체는 1번씩만 만들어도 되기에 while문 바깥에 둔 것

        while (true) {
            String message = scanner.nextLine(); //스캐너로 입력받은 객체를 변수에 저장, 쓴 메시지를 보내주기만 하는 담당

            printWriter.println(message);
            printWriter.flush();
        }
    }
}
