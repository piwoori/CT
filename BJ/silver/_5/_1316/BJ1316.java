package BJ.silver._5._1316;

import java.util.Scanner;

public class BJ1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= N; i++) {
            String s = sc.next();
            boolean[] arr = new boolean[26];
            boolean check = true;

            for(int j = 0; j < s.length(); j++) {
                int ch = s.charAt(j) - 'a';
                if(arr[ch]) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        check = false;
                        break;
                    }
                } else {
                    arr[ch] = true;
                }
            }

            if(check) {
                count++;
            }
        }
        System.out.println(count);
    }
}
