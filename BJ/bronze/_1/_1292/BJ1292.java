package BJ.bronze._1._1292;

import java.util.ArrayList;
import java.util.Scanner;
public class BJ1292 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < 1001; i++){
            for(int j = 1; j <= i; j++){
                list.add(i);
            }
        }
        for(int i = A - 1; i < B; i++){
            sum += list.get(i);
        }
        System.out.println(sum);
        sc.close();
    }
    
}
