package BJ.bronze._4._2752;

import java.util.*;
public class BJ2752 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        sc.close();
    }
    
}