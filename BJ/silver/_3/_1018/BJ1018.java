package BJ.silver._3._1018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1018 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] list = new char[N][M];

        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < M; j++) {
                list[i][j] = s.charAt(j);
            }
        }

        int min = 64;

        for(int i = 0; i <= N - 8; i++){
            for(int j = 0; j <= M - 8; j++){
                int cntW = 0;
                int cntB = 0;

                for(int x = i; x < i + 8; x++){
                    for(int y = j; y < j + 8; y++){
                        if((x + y) % 2 == 0){
                            if(list[x][y] != 'W'){
                                cntW++;
                            }
                            if(list[x][y] != 'B'){
                                cntB++;
                            }
                        }
                        else{
                            if(list[x][y] != 'B'){
                                cntW++;
                            }
                            if(list[x][y] != 'W'){
                                cntB++;
                            }
                        }
                    }
                }
                int cnt = Math.min(cntW, cntB);
                min = Math.min(min, cnt);
            }
        }

        System.out.println(min);

    }
}
