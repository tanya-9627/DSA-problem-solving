class Solution {
    public int maxProfit(int[] prices) {
        int firstBuy = Integer.MIN_VALUE;
        int firstSell = 0;
        int secondBuy = Integer.MIN_VALUE;
        int secondSell = 0;

        for (int p : prices) {
            // 1. Maximize money after first buy (lower price is better, so -p)
            firstBuy = Math.max(firstBuy, -p);
            // 2. Maximize profit after first sell
            firstSell = Math.max(firstSell, firstBuy + p);
            // 3. Maximize money after second buy (using firstSell profit)
            secondBuy = Math.max(secondBuy, firstSell - p);
            // 4. Maximize total profit after second sell
            secondSell = Math.max(secondSell, secondBuy + p);
        }

        return secondSell;
    }
}