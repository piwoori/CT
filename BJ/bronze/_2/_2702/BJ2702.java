package BJ.bronze._2._2702;

import java.util.Scanner;
public class BJ2702 {
    // 최대공약수 함수
    static int gcd(int a, int b){
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 최소공배수 함수
    static int lcm(int a, int b, int gcd){
        return a * b / gcd;
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int g = gcd(a, b);
            int l = lcm(a, b, g);

            System.out.println(l + " " + g);
        }
        sc.close();
    }
    
}
