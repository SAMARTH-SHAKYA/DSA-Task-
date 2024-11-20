import java.util.*;

public class BuyTwoChoc {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int temp = 0;
        for (int i = 0; i < 2; i++) {
            temp = temp + prices[i];
        }
        if (temp <= money) {
            return money - temp;
        }
        return money;
    }
}