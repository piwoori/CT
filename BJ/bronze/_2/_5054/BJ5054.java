package BJ.bronze._2._5054;

import java.util.Scanner;
public class BJ5054 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int max = 0;
            int min = 99;
            for (int j = 0; j < n; j++){
                int xi = sc.nextInt();
                if (xi > max){
                    max = xi;
                }
                if (xi < min){
                    min = xi;
                }
            }
            int route = (max - min) * 2;
            System.out.println(route);
        }
        sc.close();
    }
    
}
