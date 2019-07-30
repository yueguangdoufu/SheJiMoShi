package zhizelian;

public class Mission {
    private String missionName;
    private int enemyNum;

    public Mission(String missionName, int enemyNum) {
        this.missionName = missionName;
        this.enemyNum = enemyNum;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public int getEnemyNum() {
        return enemyNum;
    }

    public void setEnemyNum(int enemyNum) {
        this.enemyNum = enemyNum;
    }
}
