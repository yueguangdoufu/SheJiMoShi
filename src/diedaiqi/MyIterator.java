package diedaiqi;

public interface MyIterator {
    void setShangping(int a);
    Object currentShangping();
    void next();
    void previous();
    boolean isLast();
    boolean isFirst();

}
