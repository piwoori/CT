package BJ.bronze._4._2439;
import java.util.Scanner;

public class BJ2439 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        char[] result = new char[N];
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < N - i; j++){
                result[j] = ' ';
            }
            for(int k = N - i; k < N; k++){
                result[k] = '*';
            }
            System.out.println(result);
            
        }
        sc.close();
    }
}