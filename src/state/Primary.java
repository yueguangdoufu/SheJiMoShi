package state;

public class Primary extends AbstractState {

    public Primary(AbstractState state) {
        this.gcc = state.gcc;
        this.point = state.getPoint();
        this.stateName = "primary";
    }

    public Primary(GameAccount gcc) {
        this.gcc = gcc;
        this.point = 0;
        this.stateName = "primary";
    }

    public void play(int score){
        this.point += score;
        checkState(score);
        System.out.println("score:"+this.point+" level:"+gcc.getAbstractState().stateName);
    }

    @Override
    public void checkState(int score) {
        if(point>= 5000){
            gcc.setAbstractState(new Final(this));
        }else if (point>=1000){
            gcc.setAbstractState(new Professional(this));
        }else if (point>=100){
            gcc.setAbstractState(new Secondary(this));
        }
    }
}
