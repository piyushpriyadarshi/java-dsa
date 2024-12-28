package array;

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class ClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = new int[inputArr.length];
        int i = 0;
        for(String str: inputArr){
            arr[i++] = Integer.parseInt(str);
        }
        for(int s:arr){
            System.out.println(s);
        }
        System.out.println(solve(arr));
        scanner.close();
    }

    static int solve(int[] arr){
        return 0;
    }
}
