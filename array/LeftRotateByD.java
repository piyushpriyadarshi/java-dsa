package array;

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class LeftRotateByD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = new int[inputArr.length];
        int i = 0;
        for (String str : inputArr) {
            arr[i++] = Integer.parseInt(str);
        }
        int d = Integer.parseInt(scanner.nextLine());
        System.out.println(rotateLeftByDBruteForce(arr, d));
        scanner.close();
    }

    static int rotateLeftByDBruteForce(int[] arr, int d) {
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        System.out.println(temp.toString());
        // shifting elements
        return 0;
    }
}
