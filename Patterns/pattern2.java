public class pattern2 {
    public static void main(String[] args) {
        //outer loop
        for(int line = 1; line<=4;line++){
            //inner loop
            for(int number = 1; number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
    
}
