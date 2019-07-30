package observer;

public class GuShi extends MySubject {
    @Override
    public void price() {
        System.out.println("股票低落5%");

        for (Object object:observers){
            ((MyObserver)object).response();
        }
    }
}
