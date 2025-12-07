package BJ.silver._4._1920;

import java.util.Scanner;
import java.util.Arrays;

public class BJ1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();

            if (Arrays.binarySearch(arr, x) >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
