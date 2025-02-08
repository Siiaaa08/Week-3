package searchtarget;

public class Main {
    public static void main(String[] args) {
        int[] dataSizes = {1000,10000,100000};
        for(int size : dataSizes) {
            int[] data = DataGenerator.createSortedArray(size);
            int target = data[size - 1];

            System.out.println("DataSet Size:" +size);

            //Linear Search
            long startTime = System.nanoTime();
            int linearIndex = SearchAlgorithms.linearSearch(data,target);
            long endTime = System.nanoTime();
            long linearDuration = endTime - startTime;
            System.out.println("Duration of linear search:" +linearDuration);

            //Binary Search
            startTime = System.nanoTime();
            int binarySearch = SearchAlgorithms.binarySearch(data,target);
            endTime = System.nanoTime();
            long binaryDuration = endTime - startTime;
            System.out.println("Duration of binary Search:" +binarySearch);

            System.out.println("...........................");
        }
    }
}
