package BJ.bronze._2._1453;

import java.util.Scanner;
public class BJ1453 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[100];
        int reject = 0;
        for (int i = 0; i < N; i++){
            int x = sc.nextInt();
            if(num[x-1] == 1){
                reject++;
            }
            else{
                num[x-1] = 1;
            }
        }
        System.out.println(reject);
        sc.close();
    }
    
}