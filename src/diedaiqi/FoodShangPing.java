package diedaiqi;

public class FoodShangPing implements ShangPing{

    private Object[] objects = {"薯片","latiao","jizhua","binggan","doufugan","jichi"};

    @Override
    public MyIterator creatIterator() {
        return new FoodIterator();
    }

    private class FoodIterator implements MyIterator{

        private int currentIndex = 0;

        @Override
        public void setShangping(int a) {
            currentIndex = a;
        }

        @Override
        public Object currentShangping() {
            return objects[currentIndex];
        }

        @Override
        public void next() {
            if(currentIndex<objects.length){
                currentIndex++;
            }
        }

        @Override
        public void previous() {
            if (currentIndex>0){
                currentIndex--;
            }
        }

        @Override
        public boolean isLast() {
            return currentIndex == objects.length;
        }

        @Override
        public boolean isFirst() {
            return currentIndex == 0;
        }
    }
}
