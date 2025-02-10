package comparingdatastructures;

import java.util.HashSet;
import java.util.TreeSet;

public class ComparingDataStructures {
        public static boolean searchArray(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return true;
                }
            }
            return false;
        }

        public static double[] comparePerformance(int size) {
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = i;
            }
            int target = size - 1;

            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int value : data) {
                hashSet.add(value);
                treeSet.add(value);
            }

            double[] output = new double[3];
            long start = System.nanoTime();
            searchArray(data, target);
            output[0] = (System.nanoTime() - start) / 1000000.0;

            start = System.nanoTime();
            hashSet.contains(target);
            output[1] = (System.nanoTime() - start) / 1000000.0;

            start = System.nanoTime();
            treeSet.contains(target);
            output[2] = (System.nanoTime() - start) / 1000000.0;

            System.out.println("Dataset Size: " + size);
            System.out.println("Array Search Time: " + output[0] + " ms");
            System.out.println("HashSet Search Time: " + output[1] + " ms");
            System.out.println("TreeSet Search Time: " + output[2] + " ms");
            System.out.println("---------------------------------");

            return output;
        }
    }



