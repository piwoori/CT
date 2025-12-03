package BJ.silver._4._2485;

import java.util.Scanner;

public class BJ2485 {
    static int gcd(int a, int b) {
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] trees = new int[N];
        for(int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
        }

        int gcd = 0;

        for(int i = 1; i < N; i++){
            int diff = trees[i] - trees[i - 1];
            gcd = gcd(gcd, diff);
        }

        int totaltrees = ((trees[N-1] - trees[0]) / gcd) + 1;
        System.out.println(totaltrees - N);
        sc.close();
    }
}
