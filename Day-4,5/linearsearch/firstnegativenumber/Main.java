package linearsearch.firstnegativenumber;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,0,-1,3,-9,5,-2};
        FirstNegative obj = new FirstNegative();
        int index = obj.findFirstNegative(arr);
        System.out.println("The index of the first negative element: "+index);

    }
}
