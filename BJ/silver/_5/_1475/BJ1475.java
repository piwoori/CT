package BJ.silver._5._1475;

import java.util.Scanner;
import java.util.Arrays;

public class BJ1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[10];
        for(int i = 0; i < str.length(); i++) {
            int x = str.charAt(i) - '0';
            if(x == 6){
                arr[9]++;
            }
            else {
                arr[x]++;
            }
        }
        arr[9] = arr[9] / 2 + arr[9] % 2;
        Arrays.sort(arr);
        System.out.println(arr[9]);
        sc.close();
    }
}
