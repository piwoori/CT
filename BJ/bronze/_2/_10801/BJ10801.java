package BJ.bronze._2._10801;

import java.util.Scanner;
public class BJ10801 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] A = new int[10];
        int [] B = new int[10];
        int Ascore = 0;
        int Bscore = 0;
        int Dscore = 0;
        for(int i = 0; i < 10; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            B[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            if(A[i] > B[i]){
                Ascore++;
            }
            else if(A[i] < B[i]){
                Bscore++;
            }
            else{
                Dscore++;
            }
        }
        if (Ascore > Bscore){
            System.out.println("A");
        }
        else if (Ascore < Bscore){
            System.out.println("B");
        }
        else{
            System.out.println("D");
        }
        sc.close();
    }
    
}
