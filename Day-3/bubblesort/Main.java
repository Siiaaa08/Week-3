package bubblesort;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        StudentMarks obj = new StudentMarks();
        int arr[] = {45, 23, 90, 46, 12, 61};
        int res[] = obj.bubbleSort(arr);
        System.out.println(Arrays.toString(res));
    }
}
