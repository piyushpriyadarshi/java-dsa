package array;
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class MiddleFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = new int[inputArr.length];
        int i = 0;
        for(String str: inputArr){
            arr[i++] = Integer.parseInt(str);
        }
        System.out.println(middle(arr));
        scanner.close();
    }

    public static int[] middle(int[] array) {
        // TODO
        return Arrays.copyOfRange(array, 1, array.length-1)
    }
}
