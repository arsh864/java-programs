import java.util.*;
//print sub array
public class subarray {
    public static void printSubarrrays(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int start = numbers[i];
            for(int j=1; j<numbers.length; j++){
                int end = numbers[j];
                for(int k=start; k<=end; k++){ //print
                    System.out.print(numbers[k]+ " "); //subarray
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
    }
    
}
