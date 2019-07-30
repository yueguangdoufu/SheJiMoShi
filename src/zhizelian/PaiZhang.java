package zhizelian;

public class PaiZhang extends Leader {
    public PaiZhang(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Mission mission) {
        if(mission.getEnemyNum()>=10&&mission.getEnemyNum()<50){
            System.out.println("排长"+name+" 任务名"+mission.getMissionName()+" 敌人数"+mission.getEnemyNum());
        }else {
            if(this.successor != null){
                this.successor.handleRequest(mission);
            }
        }
    }
}
