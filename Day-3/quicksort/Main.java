package quicksort;

public class Main {
        public static void main(String[] args) {
            int[] productPrices = {234,56,74,78,64532};
            ProductPrices product = new ProductPrices(productPrices);

            System.out.println("Before Sorting:");
            product.show();

            product.sort();

            System.out.println("After Sorting:");
            product.show();
        }
    }


