package zhizelian;

public class BanZhang extends Leader {
    public BanZhang(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Mission mission) {
        if(mission.getEnemyNum()<10){
            System.out.println("班长"+name+" 任务名"+mission.getMissionName()+" 敌人数"+mission.getEnemyNum());
        }else {
            if(this.successor != null){
                this.successor.handleRequest(mission);
            }
        }
    }
}
