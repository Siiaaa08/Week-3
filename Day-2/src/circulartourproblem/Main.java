package circulartourproblem;

public class Main {
        public static void main(String[] args) {
            CircularTour c=new CircularTour();
            int[][] pumps = {
                    {4, 6},
                    {6, 5},
                    {7, 3},
                    {4, 5}
            };

            int result = c.result(pumps);
            if (result == -1) {
                System.out.println("Circular tour is not possible.");
            } else {
                System.out.println("Start at Petrol Pump: " + result);
            }

        }
    }


