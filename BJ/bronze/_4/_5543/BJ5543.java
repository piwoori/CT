package BJ.bronze._4._5543;
import java.util.Scanner;

public class BJ5543 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int burger1 = sc.nextInt();
        int burger2 = sc.nextInt();
        int burger3 = sc.nextInt();
        int coke = sc.nextInt();
        int sprite = sc.nextInt();
        int burger = burger1;
        int drink = coke;

        if ( burger2 < burger){
            burger = burger2;
        }
        if ( burger3 < burger){
            burger = burger3;
        }
        if ( sprite < coke){
            drink = sprite;
        }
        System.out.println(burger + drink - 50);
        sc.close();
    }
}