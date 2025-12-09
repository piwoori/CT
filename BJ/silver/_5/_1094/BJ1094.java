package BJ.silver._5._1094;

import java.util.Scanner;

public class BJ1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int count = 0;
        int shortest = 64;
        int temp = 0;
        int goal = X;

        while (true){
            if(X == 64){
                count++;
                break;
            }

            shortest /= 2;

            if(shortest <= X){
                temp += shortest;
                count++;
                if(goal == temp){
                    break;
                }
                X -= shortest;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
