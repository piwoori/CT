package BJ.bronze._1._2693;

import java.util.Arrays;
import java.util.Scanner;
public class BJ2693 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int[] list = new int[10];
            for(int j = 0; j < 10; j++){
                list[j] = sc.nextInt();
            }
            Arrays.sort(list);
            System.out.println(list[7]);
        }
        sc.close();
    }
    
}
