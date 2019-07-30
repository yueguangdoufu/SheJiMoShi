package zhongjie;

public class DiamonMember extends Member {
    public DiamonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("Diamon member:");
        chatroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("Diamon member:");
        chatroom.sendImage(name,to,image);
    }
}
