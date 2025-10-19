package BJ.bronze._3._5523;

import java.util.Scanner;
public class BJ5523 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = 0, B = 0;
        for (int i = 0; i < N; i++){
            int AS = sc.nextInt();
            int BS = sc.nextInt();
            if(AS > BS){
                A += 1;
            }
            if(AS < BS){
                B += 1;
            }
            else{
                continue;
            }
        }
        System.out.println(A + " " + B);
    }
    
}
