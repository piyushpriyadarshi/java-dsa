import java.util.Scanner;

public class SecondLargest {
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] inputArr=scanner.nextLine().split(" ");
        int[] arr= new int[inputArr.length];
        int i=0;
        for(String str:inputArr){
            arr[i++]=Integer.parseInt(str);
        }
        System.out.println(secondLargest(arr));
        scanner.close();
    }
    static int secondLargest(int[] arr){
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}
