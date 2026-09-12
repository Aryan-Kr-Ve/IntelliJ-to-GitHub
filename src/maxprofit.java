public class maxprofit
{
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length < 2) {
                return 0;
            }

            int minPrice = prices[0];
            int maxProfit = 0;

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                }
                else if (prices[i] - minPrice > maxProfit) {
                    maxProfit = prices[i] - minPrice;
                }
            }
            return maxProfit;
        }
        public static void main(String[] args) {
            maxprofit obj = new maxprofit();
            int[] prices1 = {7, 1, 5, 3, 6, 4};
            System.out.println("Max Profit: " + obj.maxProfit(prices1)); // Output: 5
            int[] prices2 = {7, 6, 4, 3, 1};
            System.out.println("Max Profit: " + obj.maxProfit(prices2)); // Output: 0
        }
    }