import java.util.*;
public class updatearray {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        //marks input
        marks [0] = sc.nextInt();
        marks [1] = sc.nextInt();
        marks [2] = sc.nextInt();
        marks [3] = sc.nextInt();
        marks [4] = sc.nextInt();

        System.out.println("Physics : " +marks[0]);
        System.out.println("Chemistry : " +marks[1]);
        System.out.println("Math : " +marks[2]);
        System.out.println("Hindi : " +marks[3]);
        System.out.println("English : " +marks[4]);

        marks[1] = marks[1] + 8;
        marks[3] = marks [3] + 2;
        System.out.println("Chemistry : " +marks[1]);
        System.out.println("Hindi : " +marks[3]);

    }
    
}
