package mergesort;

public class BookPrices {
    public int[] mergesort(int[] arr){
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
        public int[] merge(int[] first,int[] second) {
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
    }


