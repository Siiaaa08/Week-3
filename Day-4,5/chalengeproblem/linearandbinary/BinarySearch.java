package chalengeproblem.linearandbinary;

import java.util.Arrays;

public class BinarySearch {
        public static int binarySearch(int[] arr,int target){
            int start=0;
            int end=arr.length-1;
            int ans=-1;
            Arrays.sort(arr);
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target){
                    ans=mid;
                    System.out.println("The Index of target is "+ans);

                    return ans;
                } else if (arr[mid]>target) {
                    end=mid-1;

                }else{
                    start=mid+1;
                }
            }
            return ans;
        }
    }

