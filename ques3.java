import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser =  sc.nextFloat();
        float total = pen+pencil+eraser;
        System.out.println("BIll is :" +total);
        //add float with 18%gst
        float newTotal=total+(0.18f*total);
        System.out.println("WITH GST THE BILL IS : " +newTotal);


        
    }
        
    }
    
