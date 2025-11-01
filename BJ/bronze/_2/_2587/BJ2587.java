package BJ.bronze._2._2587;

import java.util.Scanner;
import java.util.Arrays;
public class BJ2587 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] list = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++){
            list[i] = sc.nextInt();
            sum += list[i];
        }
        Arrays.sort(list);
        System.out.println(sum / 5);
        System.out.println(list[2]);
        sc.close();
    }
    
}
