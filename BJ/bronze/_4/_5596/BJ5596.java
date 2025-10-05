package BJ.bronze._4._5596;

import java.util.Scanner;
public class BJ5596 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int minkook1 = sc.nextInt();
        int minkook2 = sc.nextInt();
        int minkook3 = sc.nextInt();
        int minkook4 = sc.nextInt();
        int manse1 = sc.nextInt();
        int manse2 = sc.nextInt();
        int manse3 = sc.nextInt();
        int manse4 = sc.nextInt();

        int minkook = minkook1 + minkook2 + minkook3 + minkook4;
        int manse = manse1 + manse2 + manse3 + manse4;
        if (minkook > manse){
            System.out.println(minkook);
        }
        else if (minkook < manse){
             System.out.println(manse);
        }
        else{
            System.out.println(minkook);
        }
        sc.close();
    }
}