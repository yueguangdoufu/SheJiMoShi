package zhongjie;

public class Client {
    public static void main(String[] args) {
        AbstractChatroom chatroom = new ChatGroup();

        Member member1,member2,member3,member4;
        member1 = new DiamonMember("tjy");
        member2 = new DiamonMember("txy");
        member3 = new CommonMember("zs");
        member4 = new CommonMember("hjj");

        chatroom.register(member1);
        chatroom.register(member2);
        chatroom.register(member3);
        chatroom.register(member4);

        member1.sendText("txy","mua");
        member2.sendText("tjy","momo");
        member3.sendImage("hjj","adjfhkgj");
        member3.sendImage("zs","kjakgjh");
    }
}
