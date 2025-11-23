package BJ.silver._5._5800;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
public class BJ5800 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        for(int i = 0; i < K; i++){
            int N = sc.nextInt();
            Integer[] list = new Integer[N];

            for(int j = 0; j < N; j++){
                list[j] = sc.nextInt();
            }

            Arrays.sort(list, Comparator.reverseOrder());

            int gap = 0;

            for(int j = 0; j < N-1; j++){
                if(list[j] - list[j+1] > gap){
                    gap = list[j] - list[j+1];
                }
            }

            System.out.println("Class " +  (i + 1));
            System.out.println("Max " + list[0] +", " + "Min " + list[N-1] + ", " + "Largest gap " + gap);
        }
        sc.close();
    }
}
