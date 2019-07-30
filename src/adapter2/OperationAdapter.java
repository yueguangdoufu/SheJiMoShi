package adapter2;

public class OperationAdapter implements DataOperation {

    private QuickSort quickSort;
    private BinarySearch binarySearch;

    OperationAdapter(QuickSort quickSort,BinarySearch binarySearch){
        this.quickSort = quickSort;
        this.binarySearch = binarySearch;
    }

    @Override
    public int sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int a) {
        return binarySearch.binarySearch(array,a);
    }
}
