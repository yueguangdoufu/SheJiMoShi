package diedaiqi;

public class DrinkShangPing implements ShangPing {

    private  Object[] objects = {"kele","xuebi","gewasi","chenzhi","jitang","baikaishui"};

    @Override
    public MyIterator creatIterator() {
        return null;
    }

    private class DrinkIterator implements MyIterator{

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
            if (currentIndex<objects.length){
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
