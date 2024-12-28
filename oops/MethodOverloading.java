import java.util.*;
import java.io.*;
import java.util.stream.*;

public class MethodOverloading {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String[] inputArr = scanner.nextLine().split(" ");
        // int[] arr = new int[inputArr.length];
        // int i = 0;
        // for(String str: inputArr){
        //     arr[i++] = Integer.parseInt(str);
        // }
        // System.out.println(solve(arr));
        // scanner.close();
        // MethodOverloading methodOverloading=new MethodOverloading();
        // methodOverloading.m1(10.5);

        new MethodOverloading();

    }

    static int solve(int[] arr){
        return 0;
    }
    public void m1(int i){
        System.out.println(i);
    }
    public void m1(float f){
        System.out.println(f);
    }

}