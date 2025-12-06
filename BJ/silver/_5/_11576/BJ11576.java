package BJ.silver._5._11576;

import java.util.Scanner;
import java.util.Stack;

public class BJ11576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int m = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        int sum = 0;

        for(int i = m - 1; i >= 0; i--) {
            int x = sc.nextInt();
            sum += (int) (x * Math.pow(A, i));
        }

        while(sum != 0){
            stack.push(sum % B);
            sum /= B;
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        sc.close();
    }
}
