package BJ.bronze._3._3058;

import java.util.Scanner;
public class BJ3058 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] list = new int[7];

        for(int i = 0;i < N; i++){
            int min = 100;
            int sum = 0;

            for(int j = 0; j < 7; j++){
                list[j] = sc.nextInt();
                if (list[j] % 2 == 0){
                    sum += list[j];
                    if (list[j] < min){
                        min = list[j];
                    }
                }
            }
            System.out.println(sum + " " + min);
        }

        sc.close();
    }
    
}
