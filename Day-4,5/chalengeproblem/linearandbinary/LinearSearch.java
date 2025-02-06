package chalengeproblem.linearandbinary;

import java.util.Arrays;

public class LinearSearch {
        public static int linearSearch(int arr[]){
            int ans=-1;
            Arrays.sort(arr);
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]+1!=arr[i+1]){
                    ans=arr[i]+1;
                }
            }
            System.out.println("The missing Value is "+ans);
            return ans;
        }
    }


