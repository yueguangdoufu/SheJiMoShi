package zhongjie;

public abstract class Member {
    protected AbstractChatroom chatroom;
    protected String name;

    public AbstractChatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(AbstractChatroom chatroom) {
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member(String name){
        this.name = name;
    }

    public abstract void sendText(String to,String message);
    public abstract void sendImage(String to,String image);

    public void receiveText(String from,String message){
        System.out.println(from+" seng to "+this.name+",content "+message);
    }

    public void receiveImage(String from,String image){
        System.out.println(from+" seng to "+this.name+",content "+image);
    }

}
