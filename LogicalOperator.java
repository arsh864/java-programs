public class LogicalOperator {
    public static void main(String[] args) {
        // In Logical && (AND) all Statements will True
        int a = 5;
        int b = 6;
        System.out.println((a<b) && (b>a) && (a!=b));
        System.out.println((a>b) && (b<a) && (a==b));
        // In Logical ||(OR)minimum one statement will true 
        int c = 7;
        int d = 7;
        System.out.println((c<=d) || (c!=d) || (c==d));
        System.out.println((c<d) || (c!=d) || (c>d));
        //In Logical !(NOT) we can convert false values in true or true values in false
        int e = 6;
        int f = 8;
        System.out.println(!(e>f));
        System.out.println(!(f>e));

    }
    
}
