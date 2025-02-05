package binarysearch.findrotationpoint;

public class FindRotationPoint {
        public static int search(int[] arr){
            int ans=-1;
            int right=0;
            int left= arr.length-1;
            while(right<=left){
                int mid=right+(left-right)/2;
                if(arr[left]>=arr[right]){
                    ans=arr[right];
                    break;
                }
                if ( arr[mid] > arr[right]) {
                    right = mid + 1;

                }
                else {
                    ans = arr[mid];
                    left = mid - 1;
                }
            }
            return ans;
        }
    }


