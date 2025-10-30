package BJ.bronze._2._5218;

import java.util.Scanner;
public class BJ5218 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        char [] list1 = new char[20];
        char [] list2 = new char[20];
        for (int i = 0; i < T; i++){
            String a = sc.next();
            String b = sc.next();
            System.out.print("Distances: ");
            for ( int j = 0; j < a.length(); j++){
                list1[j] = a.charAt(j);
                list2[j] = b.charAt(j);
                if (list2[j] >= list1[j]){
                    System.out.print(list2[j] - list1[j]+ " ");
                }
                else{
                    System.out.print((list2[j] + 26) - list1[j]+ " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}