package state;

public class GameAccount {
    private AbstractState abstractState;
    private String name;

    public AbstractState getAbstractState() {
        return abstractState;
    }

    public void setAbstractState(AbstractState abstractState) {
        this.abstractState = abstractState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameAccount(String name) {
        this.name = name;
        this.abstractState = new Primary(this);
    }

    public void play(int score){
        abstractState.play(score);
    }

    public void doubleScore(int score){
        abstractState.doubleScore(score);
    }

    public void changeCards(int score){
        abstractState.changeCards(score);
    }

    public void peekCards(int score){
        abstractState.peekCards(score);
    }
}
