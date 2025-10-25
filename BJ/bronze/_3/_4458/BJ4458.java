package BJ.bronze._3._4458;

import java.util.Scanner;
public class BJ4458 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < N; i++){
            String word = sc.nextLine();
            char[] array = word.toCharArray();
            array[0] = Character.toUpperCase(array[0]);
            System.out.println(array);
        }
        sc.close();
    }
    
}
