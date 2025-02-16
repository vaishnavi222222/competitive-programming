 
import java.io.*;
import java.util.*;

public class Reverse_Number_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value:");
        int n = sc.nextInt();
        printpattern(n);
    }
    public static void printpattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                 System.out.print("* ");
            }
            for(int j=0;j<n-i-1;j++){
              System.out.print(" ");

            }
            System.out.println();
        }
    }
}