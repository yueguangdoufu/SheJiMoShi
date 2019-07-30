package state;

public class Professional extends AbstractState {

    public Professional(AbstractState state) {
        this.gcc = state.gcc;
        this.point = state.getPoint();
        this.stateName = "professional";
    }

    @Override
    public void checkState(int score) {
        if(point< 100){
            gcc.setAbstractState(new Primary(this));
        }else if (point<1000){
            gcc.setAbstractState(new Secondary(this));
        }else if (point>=5000){
            gcc.setAbstractState(new Final(this));
        }
    }

    public void play(int score){
        this.point += score;
        checkState(score);
        System.out.println("score:"+this.point+" level:"+gcc.getAbstractState().stateName);
    }

    public void doubleScore(int score){
        this.point += score;
        checkState(score);
        System.out.println("score:"+this.point+" level:"+gcc.getAbstractState().stateName);
    }

    public void changeCards(int score){
        this.point += score;
        checkState(score);
        System.out.println("score:"+this.point+" level:"+gcc.getAbstractState().stateName);
    }

}
