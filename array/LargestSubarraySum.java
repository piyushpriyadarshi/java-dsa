package array;

import java.util.*;
import java.io.*;
import java.util.stream.*;

/*
 * 
    * Example 1:
    Input Format: N = 3, k = 5, array[] = {2,3,5}
    Result: 2
    Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

    Example 2:
    Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
    Result: 3
    Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
 */

public class LargestSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = new int[inputArr.length];
        int i = 0;
        for (String str : inputArr) {
            arr[i++] = Integer.parseInt(str);
        }
        int k = Integer.parseInt(scanner.nextLine());
        System.out.println(bruteForce(arr, k));
        scanner.close();
    }

    static int optimized(int[] arr, int k) {
        //using prefix sum
        

        //using 

        return 0;
    }



    static int bruteForce(int[] arr, int k) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    int length = j - i + 1;
                    if (length > maxLen) {
                        maxLen = length;
                    }
                }
            }

        }
        return maxLen;
    }
}
