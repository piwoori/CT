package BJ.bronze._2._2920;

import java.util.Arrays;
import java.util.Scanner;
public class BJ2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] list = new int[8];
        int[] ascending = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = new int[] {8, 7, 6, 5, 4, 3, 2, 1};
    
        for(int i = 0; i < 8; i++){
            list[i] = sc.nextInt();
        }

        if (Arrays.equals(ascending, list)){
            System.out.println("ascending");
        }
        else if (Arrays.equals(descending, list)){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }

        sc.close();
    }
    
}
