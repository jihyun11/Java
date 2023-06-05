package org.example.chat;

import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{

    private Socket socket;
    private ArrayList<ServerThread> tList;

    public ServerThread(Socket socket, ArrayList<ServerThread> tList) {
        this.socket = socket;
        this.tList = tList;
    }
}
