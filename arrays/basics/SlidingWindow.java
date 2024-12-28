import java.util.*;
import java.io.*;
import java.util.stream.*;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int k= Integer.parseInt(scanner.nextLine());
        int[] arr = new int[inputArr.length];
        int i = 0;
        for(String str: inputArr){
            arr[i++] = Integer.parseInt(str);
        }
        System.out.println(slidingWindow(arr,k));
        scanner.close();
    }

    static int slidingWindow(int[] arr,int k){
        int max=0;
        int currentWindowSum=0;

        for (int i = 0; i < k; i++) {
            currentWindowSum+=arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            currentWindowSum=currentWindowSum-arr[i-k]+arr[i];
            if(currentWindowSum>max){
                max=currentWindowSum;
            }
        }
        return max;
    }
    
}