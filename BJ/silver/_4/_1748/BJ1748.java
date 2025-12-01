package BJ.silver._4._1748;

import java.util.Scanner;

public class BJ1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int digit = 1;
        int range = 10;

        for(int i = 1; i <= N; i++){
            if(i % range == 0){
                digit++;
                range *= 10;
            }
            count += digit;
        }

        System.out.println(count);
        sc.close();
    }
}
