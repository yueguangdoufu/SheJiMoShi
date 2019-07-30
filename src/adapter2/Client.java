package adapter2;

public class Client {
    public static void main(String[] args) {
        OperationAdapter operationAdapter;
        QuickSort quickSort = new QuickSort();
        BinarySearch binarySearch = new BinarySearch();
        operationAdapter = new OperationAdapter(quickSort,binarySearch);
        int[] a = {1,2,3};
        operationAdapter.sort(a);
        operationAdapter.search(new int[]{1,2,3},2);
    }
}
