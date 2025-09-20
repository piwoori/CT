package BJ.bronze._5._5597;
import java.util.Scanner;

public class BJ5597 {
    public static void main(String[] args){
    boolean[] arr = new boolean[31];
    Scanner sc = new Scanner(System.in);

    // 입력 받은 번호의 상태를 true로 변경
    for(int i = 0; i <28; i++){
        int number = sc.nextInt();
        arr[number] = true;
    }

    // false인 번호 출력
    for(int j = 1; j < 31; j++){
        if (arr[j] == false) {
            System.out.println(j);
        }
    }
    sc.close();
    }
}
