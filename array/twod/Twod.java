package array.twod;

public class Twod {
    public static void main(String[] args) {
        int[][] array= new int[5][3];
        System.out.println(array.length);
    
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i==j){
                    System.out.println(i+"\t"+j);
                }
            }
        }
    }
    
}
