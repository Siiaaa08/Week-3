package hashmap.twosumproblem;

public class Main {
        public static void main(String[] args) {
            int arr[]={2,1,3,3,4,3};
            int given=6;
            TwoSum par=new TwoSum();
            par.pair(arr,given);
            par.display();

        }
    }


