package BJ.bronze._3._5691;

import java.util.Scanner;
public class BJ5691 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean T = true;
        while(T){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a ==0 && b ==0){
                T = false;
            }
            if(!T){
                break;
            }
            int A = Math.min(a, b);
            int B = Math.max(a, b);
            int C = 2 * A - B;
            System.out.println(C);
        }
        sc.close();
    }
}