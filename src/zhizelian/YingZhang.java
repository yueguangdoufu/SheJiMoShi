package zhizelian;

public class YingZhang extends Leader {
    public YingZhang(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Mission mission) {
        if(mission.getEnemyNum()>=50&&mission.getEnemyNum()<200){
            System.out.println("营长"+name+" 任务名"+mission.getMissionName()+" 敌人数"+mission.getEnemyNum());
        }else {
            System.out.println("任务"+mission.getMissionName()+" 超过"+mission.getEnemyNum()+"人");
        }
    }
}
