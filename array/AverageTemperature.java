package array;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int length;
        System.out.println("How many days Tempreature");
        length=Integer.parseInt(sc.nextLine());
        int[] temperatures= new int[length];
        int index=length;
        int sum=0;
        while(index>0){
            System.out.println("Enter "+(length-index+1)+" 's days Tempreature: ");
            int num=Integer.parseInt(sc.nextLine());
            temperatures[length-index]=num;
            sum+=num;
            index--;
        }
        
        int avg=sum/length;

        index=length;
        int count=0;
        while(index>0){
            if(temperatures[length-index]>avg){
                count++;
            }
            index--;
        }

        System.out.println("Average is :"+avg);
        System.out.println(count+" day(s) Teampreature is Greater than Average ");

    }
}
