package BJ.silver._5._13241;

import java.util.Scanner;

public class BJ13241 {
    public static long GCD(long a, long b) {
        if(a > b){
            while (b != 0) {
                long temp = a % b;
                a = b;
                b = temp;
            }
            return a;
        }
        else{
            while (a != 0) {
                long temp = b % a;
                b = a;
                a = temp;
            }
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long gcd = GCD(A, B);
        System.out.println((A * B) / gcd);
        sc.close();
    }
}
