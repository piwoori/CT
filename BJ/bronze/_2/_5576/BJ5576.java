package BJ.bronze._2._5576;

import java.util.Scanner;
import java.util.Arrays;
public class BJ5576 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] Wlist = new int[10];
        int[] Klist = new int[10];
        for (int i = 0; i < 10; i++){
            Wlist[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            Klist[i] = sc.nextInt();
        }
        Arrays.sort(Wlist);
        Arrays.sort(Klist);
        System.out.print(Wlist[7] + Wlist[8] + Wlist[9] + " ");
        System.out.println(Klist[7] + Klist[8] + Klist[9]);
        sc.close();
    }
    
}
