//  basic pattern 
import java.io.*;
import java.util.*;

public class RectangularStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value:");
        int n = sc.nextInt();
        printpattern(n);
    }
    public static void printpattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
