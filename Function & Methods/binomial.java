public class binomial {
    public static int binomialcoeff(int n , int r){
       int fact_n  = factorial(n);
       int fact_r = factorial(r);
       int fact_nmr = (n-r);

        int binomialcoeff = fact_n / (fact_r * fact_nmr);
        return binomialcoeff;
    }
    public static void main(String[] args) {
        System.out.println(binomialcoeff(5, 2));
        
    }
}

