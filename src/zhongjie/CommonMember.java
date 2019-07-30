package zhongjie;

public class CommonMember extends Member {
    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("Nomarl member:");
        chatroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("Normarl member:");
        chatroom.sendImage(name,to,image);
    }
}
