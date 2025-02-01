package selectionsort;

public class ExamScores {
        public int[] sorting(int[] arr){
            for(int i=0;i<arr.length;i++){
                int lastIndex= arr.length-1-i;
                int maxIndex=getMax(arr,0,lastIndex);
                swap(arr,maxIndex,lastIndex);
            }
            return arr;
        }
        public void swap(int[] arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }

        public int getMax(int[] arr,int start,int end){
            int max=start;

            for(int i=start;i<=end;i++){
                if(arr[max]<arr[i]){
                    max=i;
                }

            }
            return max;

        }
    }


