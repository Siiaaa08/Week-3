package quicksort;

public class ProductPrices {
        int[] prices;

        public ProductPrices(int[] prices) {
            this.prices = prices;
        }

        private int partition(int left, int right) {
            int pivot = prices[right];
            int i = left - 1;

            for (int j = left; j < right; j++) {
                if (prices[j] <= pivot) {
                    i++;
                    swap(i, j);
                }
            }
            swap(i + 1, right);
            return i + 1;
        }

        private void quickSort(int left, int right) {
            if (left < right) {
                int pivotIndex = partition(left, right);
                quickSort(left, pivotIndex - 1);
                quickSort(pivotIndex + 1, right);
            }
        }

        public void sort() {
            quickSort(0, prices.length - 1);
        }

        private void swap(int i, int j) {
            int temp = prices[i];
            prices[i] = prices[j];
            prices[j] = temp;
        }

        public void show() {
            for (int price : prices) {
                System.out.println(price);
            }
        }



    }


