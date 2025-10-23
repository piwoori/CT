package BJ.bronze._3._11966;

import java.util.Scanner;
public class BJ11966 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N % 2 ==0){
            N /= 2;
        }
        if (N == 1){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        sc.close();
    }
    
}