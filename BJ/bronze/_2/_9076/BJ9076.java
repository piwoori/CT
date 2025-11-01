package BJ.bronze._2._9076;

import java.util.Arrays;
import java.util.Scanner;
public class BJ9076 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] list = new int[5];
        
        for(int i = 0; i < T; i++){
            for(int j = 0; j < 5; j++){
                list[j] = sc.nextInt();   
            }
            Arrays.sort(list);

            if (list[3] - list[1] >= 4){
                System.out.println("KIN");
            }
            else{
                System.out.println(list[1] + list[2] + list[3]);
            }
        }
        sc.close();
    }
}
