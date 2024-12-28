import java.util.*;
public class Function2 { 
    //Function with Parameters           
    public static void Calculatesum(int a,int b ){  //parameters are a & b
        int sum = a+b;
        System.out.println("Sum is : " + sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculatesum(a, b);  //arguements or actual parameters
    }
    
}
