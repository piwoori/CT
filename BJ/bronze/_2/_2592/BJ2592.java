package BJ.bronze._2._2592;

import java.util.Scanner;
public class BJ2592 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] list = new int[10];
        int[] count = new int[10];
        int sum = 0;

        // 자연수 10개 입력 받기 + 총합 구하기
        for (int i = 0; i < 10; i++){
            list[i] = sc.nextInt();
            sum += list[i];
        }

        // 각 자연수가 몇 번 나왔는지 세기
        for (int i = 0; i < 10; i++){
            int cnt = 0;
            for (int j = 0; j < 10; j++){
                if (list[i] == list[j]){
                    cnt += 1;
                }
            }
            count[i] = cnt;
        }

        // 평균 출력
        System.out.println(sum / 10);

        // 최빈값 출력
        int mode = list[0];
        int maxcount = count[0];

        for (int i = 0; i < 10; i++){
            if (count[i] > maxcount){
                maxcount = count[i];
                mode = list[i];
            }
        }
        
        System.out.println(mode);
        sc.close();
    }
}
