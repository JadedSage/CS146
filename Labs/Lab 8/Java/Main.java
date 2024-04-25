import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        if(1<=coins.length||coins.length<=12||0<=amount||amount<=1000)
        {
            System.out.println(coinChange(coins,amount));
        }

    }
    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, max);

        dp[0] = 0;

        for (int i = 1; i <= amount ; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
