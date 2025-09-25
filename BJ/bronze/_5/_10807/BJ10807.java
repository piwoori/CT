package BJ.bronze._5._10807;
import java.util.Scanner;

public class BJ10807 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] list = new int[N];
    for(int i = 0; i < N;i++){
        list[i] = sc.nextInt();
    }
    int v = sc.nextInt();
    int sum = 0;
    for(int j = 0;j < N;j++){
        if (list[j] == v){
            sum++;
        }
    }
    System.out.println(sum);
    sc.close();
    }
}
