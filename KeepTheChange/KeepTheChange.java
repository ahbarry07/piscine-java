import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        // Convert the set to a sorted list
        List<Integer> coinList = new ArrayList<>(coins);
        Collections.sort(coinList);
        
        // Initialize arrays for dynamic programming
        int[] minCoins = new int[amount + 1];
        int[] lastCoin = new int[amount + 1];
        
        // Fill the arrays with initial values
        for (int i = 1; i <= amount; i++) {
            minCoins[i] = Integer.MAX_VALUE;
        }
        
        minCoins[0] = 0; // Base case: 0 amount requires 0 coins
        
        // Compute the minimum number of coins for each amount
        for (int i = 1; i <= amount; i++) {
            for (int coin : coinList) {
                if (i >= coin && minCoins[i - coin] != Integer.MAX_VALUE) {
                    if (minCoins[i] > minCoins[i - coin] + 1) {
                        minCoins[i] = minCoins[i - coin] + 1;
                        lastCoin[i] = coin;
                    }
                }
            }
        }
        
        // Reconstruct the solution
        List<Integer> result = new ArrayList<>();
        int currentAmount = amount;
        while (currentAmount > 0) {
            result.add(lastCoin[currentAmount]);
            currentAmount -= lastCoin[currentAmount];
        }
        
        Collections.reverse(result); // To match the expected order in the result
        
        return result;
    }
}
