package state;

public abstract class AbstractState {
    protected GameAccount gcc;
    protected int point = 0;
    protected String stateName;
    public abstract void checkState(int score);

    public GameAccount getGcc() {
        return gcc;
    }

    public void setGcc(GameAccount gcc) {
        this.gcc = gcc;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void play(int score){
        System.out.println("进行游戏");
        this.point += score;
        checkState(score);

    }

    public void doubleScore(int score){
        System.out.println("shuangbei");
        this.point += score;
        checkState(score);
    }

    public void changeCards(int score){
        System.out.println("change");
        this.point += score;
        checkState(score);
    }
    public void peekCards(int score){
        System.out.println("peek");
        this.point += score;
        checkState(score);
    }
}
