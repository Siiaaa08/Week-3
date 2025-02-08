package sortinglargedata;

public class SortAlgorithms {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;
    }

    public static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }
        left = mergesort(left);
        right = mergesort(right);

        return merge(left,right);

    }
    public static int[] merge(int[] first,int[] second) {
        int[] mix=new int[first.length+second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<first.length&&j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];

                i++;
            }else{
                mix[k]=second[j];
                j++;

            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            k++;
            i++;

        }
        while(j<second.length){
            mix[k]=second[j];
            k++;
            j++;

        }
        return mix;
    }

    public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high);
                quickSort(arr, low, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, high);
            }
        }

        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, high);
            return i + 1;
        }

        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static double[] compare(int size){
        int[] data = new int[size];
        double[] output = new double[3];
        for(int i=0;i<size;i++){
            data[i] = i;
        }

        //Bubble Sort
        long startTime = System.nanoTime();
        bubbleSort(data);
        long endTime = System.nanoTime();
        long bubbleSortTime = (endTime - startTime)/1000000;

        //Merge Sort
        startTime = System.nanoTime();
        mergesort(data);
        endTime = System.nanoTime();
        long mergeSortTime = (endTime - startTime)/1000000;

        startTime = System.nanoTime();
        quickSort(data,0,data.length-1);
        endTime = System.nanoTime();
        long quickSortTime = (endTime - startTime)/1000000;

        output[0] = bubbleSortTime;
        output[1] = mergeSortTime;
        output[2] = quickSortTime;

            System.out.println("DataSet Size:" +size);
            System.out.println("Bubble Sort Time:"+output[0]+"ms");
            System.out.println("Merge Sort Time:"+output[1]+"ms");
            System.out.println("Quick Sort Time"+output[2]+"ms");
            System.out.println("................................");

            return output;
        }

    }


