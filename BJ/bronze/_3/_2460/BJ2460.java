package BJ.bronze._3._2460;

import java.util.Scanner;
public class BJ2460 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in = 0, out = 0, max = 0, sum = 0;
        for(int i = 0; i < 10; i++){
            out = sc.nextInt();
            in = sc.nextInt();
            sum += - out + in;
            if (sum > max){
                max = sum;
            }
        }
        System.out.println(max);
        sc.close();
    }
    
}
