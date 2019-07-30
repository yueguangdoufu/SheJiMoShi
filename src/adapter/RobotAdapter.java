package adapter;

public class RobotAdapter extends Bird implements RobotInterface {
    public void cry(){
        System.out.println("robot imitate ");
        super.cry();
    }
    @Override
    public void move() {
        System.out.println("robot imitate ");
        super.fly();
    }
}
