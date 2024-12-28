public class product {
    public static int multiply(int a, int b){
         int multiply=(a*b);
        return multiply;
    }
    public static void main(String[] args) {
       int a = 4;
       int b = 6;
       int mul = multiply (a,b);
       System.out.println(" a * b = " +mul);
       mul = multiply(10,20);
       System.out.println(" a * b = " +mul);
    }
    
}
