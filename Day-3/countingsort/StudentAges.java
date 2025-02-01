package countingsort;

public class StudentAges {

        public static void countingSort(int[] ages,int min,int max) {
            int minAge = min;
            int maxAge = max;
            int range = maxAge - minAge + 1;

            int[] count = new int[range];
            for (int age : ages) {
                count[age - minAge]++;
            }

            for (int i = 1; i < range; i++) {
                count[i] += count[i - 1];
            }

            int[] sortedAges = new int[ages.length];
            for (int i = ages.length - 1; i >= 0; i--) {
                int age = ages[i];
                sortedAges[count[age - minAge] - 1] = age;
                count[age - minAge]--;
            }

            for (int i = 0; i < ages.length; i++) {
                ages[i] = sortedAges[i];
            }
        }
    }


