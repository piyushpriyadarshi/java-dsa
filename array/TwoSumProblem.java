package array;

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class TwoSumProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = new int[inputArr.length];
        int i = 0;
        for (String str : inputArr) {
            arr[i++] = Integer.parseInt(str);
        }
        int sum = Integer.parseInt(scanner.nextLine());
        System.out.println(better(arr, sum));
        scanner.close();
    }

    static boolean better(int[] arr, int sum) {
        Map<Integer, Integer> summap = new HashMap<Integer, Integer>();
        int index = 0;

        for (int num : arr) {
            if (summap.containsKey(sum - num)) {
                System.out.println(summap.get(sum - num) + "\t" + index);
                return true;
            } else {
                summap.put(num, index);
            }
            index++;
        }

        return false;
    }

    static boolean bruteForce(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] == arr[j]) {
                    System.out.println(i + " " + j);
                    return true;
                    // System.out.println("Found sum");
                }
            }
        }
        return false;
    }
}