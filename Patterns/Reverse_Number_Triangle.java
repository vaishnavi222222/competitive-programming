 
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
            for(int j=n;j>i;j--){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
}