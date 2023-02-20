package chat3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ChatServer chatServer = new ChatServer();
        chatServer.listen();
    }
}
