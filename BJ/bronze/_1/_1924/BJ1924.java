package BJ.bronze._1._1924;

import java.util.Scanner;
public class BJ1924 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < X-1; i++){
            sum += month[i];
        }
        sum += Y;
        System.out.println(day[sum % 7]);
        sc.close();
    }
    
}
