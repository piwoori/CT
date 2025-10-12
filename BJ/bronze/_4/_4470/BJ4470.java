package BJ.bronze._4._4470;

import java.util.Scanner;
public class BJ4470 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 버퍼에 남은 '\n' 제거

        for(int i = 1; i <= N; i++){
            String string = sc.nextLine();
            System.out.println(i+ ". " + string);
        }
        sc.close();
    }
}