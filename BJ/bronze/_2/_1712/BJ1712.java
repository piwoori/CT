package BJ.bronze._2._1712;

import java.util.Scanner;
public class BJ1712 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
    
        if(C <= B){
            System.out.println(-1);
        }
        else{
            long N = A / (C - B) + 1;
            System.out.println(N);
        }

        sc.close();
    }
    
}
