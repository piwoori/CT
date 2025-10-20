package BJ.bronze._3._2857;

import java.util.Scanner;
public class BJ2857 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++){
            String name = sc.nextLine();
            if (name.contains("FBI")){
                count += 1;
                System.out.print((i + 1) + " ");
            }
        }
        if (count == 0){
                System.out.println("HE GOT AWAY!");
            }
        sc.close();
    }
    
}