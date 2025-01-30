package stockspanproblem;

public class Main {
    public static void main(String[] args) {
        StockSpan obj = new StockSpan();

        int[] prices = {100, 78, 56, 82, 78, 90};
        int[] span = obj.calculateSpan(prices);

        System.out.println("Stock Span");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
