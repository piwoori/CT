package BJ.bronze._3._5086;

import java.util.Scanner;
public class BJ5086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean T = true;
        while(T){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A == 0 && B == 0){
                break;
            }
            if (B % A == 0){
                System.out.println("factor");
            }
            else if (A % B == 0){
                System.out.println("multiple");
            }
            else{
                System.out.println("neither");
            }
        }
        sc.close();

    }
    
}
