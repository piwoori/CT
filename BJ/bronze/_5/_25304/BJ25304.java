package BJ.bronze._5._25304;
import java.util.Scanner;

public class BJ25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <  N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;
        }
        if (sum == X){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        sc.close();
    }
    
}