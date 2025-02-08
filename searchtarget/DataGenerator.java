package searchtarget;

public class DataGenerator {
    public static int[] createSortedArray(int size){
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = i;
        }
        return arr;
    }
}
