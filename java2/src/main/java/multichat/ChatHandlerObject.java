package multichat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class ChatHandlerObject extends Thread{
    private ObjectInputStream reader;
    private ObjectOutputStream writer;
    private Socket socket;
    //private InfoDTO dto;
    ///private Info command;
    private List<ChatHandlerObject> list;

    public ChatHandlerObject(Socket socket, List<ChatHandlerObject> list) throws IOException {
        this.socket = socket;
        this.list = list;
        writer = new ObjectOutputStream(socket.getOutputStream());
        reader = new ObjectInputStream(socket.getInputStream());
    }
    public void run() {
        InfoDTO dto = null;
        String nickName;
        try {
            while(true) {
                dto = (InfoDTO) reader.readObject();
                nickName = dto.getNickName();

                if (dto.getCommand() == Info.EXIT) {
                    InfoDTO sendDto = new InfoDTO();
                    sendDto.setCommand(Info.EXIT);
                    writer.writeObject(sendDto);
                    writer.flush();

                    reader.close();
                    writer.close();
                    socket.close();

                    list.remove(this);

                    sendDto.setCommand(Info.SEND);
                    sendDto.setMessage(nickName+"님 퇴장하였습니다");
                    broadcast(sendDto);
                    break;
                }
                else if(dto.getCommand()==Info.JOIN){
                    //모든 사용자에게 메세지 보내기
                    //nickName = dto.getNickName();
                    //모든 클라이언트에게 입장 메세지를 보내야 함
                    InfoDTO sendDto = new InfoDTO();
                    sendDto.setCommand(Info.SEND);
                    sendDto.setMessage(nickName+"님 입장하였습니다");
                    broadcast(sendDto);
                } else if(dto.getCommand()==Info.SEND){
                    InfoDTO sendDto = new InfoDTO();
                    sendDto.setCommand(Info.SEND);
                    sendDto.setMessage("["+nickName+"]"+ dto.getMessage());
                    broadcast(sendDto);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void broadcast(InfoDTO sendDto) throws IOException {
        for (ChatHandlerObject handler : list) {
            handler.writer.writeObject(sendDto);
            handler.writer.flush();
        }
    }
}


