//  basic pattern 
import java.io.*;
import java.util.*;

public class RightAngledNumberedPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value:");
        int n = sc.nextInt();
        printpattern(n);
    }
    public static void printpattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }   
    }
}