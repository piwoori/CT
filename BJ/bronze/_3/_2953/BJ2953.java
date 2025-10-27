package BJ.bronze._3._2953;

import java.util.Scanner;
public class BJ2953 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] list = new int[5];
        int max = 0;
        int num = 0;
        for (int i = 0; i < 5; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int sum = a + b + c + d;
            list[i] = sum;
            if (sum > max){
                max = sum;
                num = i + 1;
            }
        }
        System.out.println(num + " " + max);
        sc.close();
    }
}
