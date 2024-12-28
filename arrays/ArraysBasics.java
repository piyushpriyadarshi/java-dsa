import java.util.*;
import java.io.*;
import java.util.stream.*;

class ArraysBasics {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        
        String[] strs=str.split("[a-z]");
        for (String string : strs) {
            System.out.println(string);
        }
        Integer sum=Arrays.stream(strs)
        .filter(num->isNumeric(num))
        .map(Integer::parseInt)
        .reduce(0,Integer::sum);
        System.out.println(sum);
        scanner.close();

    }
    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
    
}