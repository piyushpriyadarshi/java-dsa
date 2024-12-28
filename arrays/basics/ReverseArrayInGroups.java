package arrays.basics;
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] arr = new int[inputArr.length];
        int i = 0;
        for(String str: inputArr){
            arr[i++] = Integer.parseInt(str);
        }
        int k=Integer.parseInt(scanner.nextLine());
        System.out.println(Arrays.toString(solve(arr,k)));
        scanner.close();
    }

    static int[] solve(int[] arr,int k){
        for (int i = 0; i < arr.length; i=i+k) {
            reverse(arr, i, Integer.min(i+k-1, arr.length-1));
        }
        return arr;
    }

    static void reverse(int[] arr,int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}