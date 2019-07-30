package zhizelian;

public class Client {
    public static void main(String[] args) {
        Leader paizhang,yingzhang,banzhang;

        banzhang = new BanZhang("hjj");
        paizhang = new PaiZhang("zs");
        yingzhang = new YingZhang("tjy");

        banzhang.setSuccessor(paizhang);
        paizhang.setSuccessor(yingzhang);

        Mission mission = new Mission("运势",120);
        banzhang.handleRequest(mission);

        Mission mission1 = new Mission("ji",6);
        banzhang.handleRequest(mission1);

        Mission mission2 = new Mission("sk",45);
        banzhang.handleRequest(mission2);

        Mission mission3 = new Mission("iw",300);
        banzhang.handleRequest(mission3);
    }
}
