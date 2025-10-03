package BJ.bronze._4._2480;
import java.util.Scanner;

public class BJ2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c && c == a){
            int result1 = 10000 + (a * 1000);
            System.out.println(result1);
        }
        if ( (a == b && b != c) || (b == c && b != a) || (c == a && c != b)) {
            int same = 0;
            if ( a == b){
                same = a;
            }
            if ( b == c){
                same = b;
            }
            if (c == a){
                same = c;
            }
            int result3 = 1000 + (same * 100);
            System.out.println(result3);
        }
        if (a != b && b != c && c != a ){
            int max = 0;
            if (a > max){
                max = a;
            }
            if (b > max){
                max = b;
            }
            if (c > max){
                max = c;
            }
            int result2 = max * 100;
            System.out.println(result2);
        }
    }
}