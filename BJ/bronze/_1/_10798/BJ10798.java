package BJ.bronze._1._10798;

import java.io.*;

public class BJ10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] list = new char[5][15];
        for(int i = 0; i < 5; i++){
            String s = br.readLine();
            for(int j = 0; j < 15; j++){
                if(j < s.length()){
                    list[i][j] = s.charAt(j);
                }
                else{
                    list[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(list[j][i] == 0){
                    continue;
                }
                bw.write(list[j][i]);
            }
        }
        bw.flush();
    }
}
