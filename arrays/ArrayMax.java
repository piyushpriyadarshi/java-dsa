import java.util.*;
import java.io.*;
import java.util.stream.*;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = new int[inputArr.length];
        int i = 0;
        for(String str: inputArr){
            arr[i++] = Integer.parseInt(str);
        }
        System.out.println(solve(arr));
        scanner.close();
    }

    static int solve(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int a:arr){
            if(a>max){
                max=a;
            }
        }
        return max;
    }
}