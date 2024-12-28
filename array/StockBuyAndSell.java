package array;

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = new int[inputArr.length];
        int i = 0;
        for (String str : inputArr) {
            arr[i++] = Integer.parseInt(str);
        }
        System.out.println(maxProfit(arr));
        scanner.close();
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            maxProfit = Math.max(maxProfit, (prices[i] - min));
        }
        return maxProfit;
    }
}
