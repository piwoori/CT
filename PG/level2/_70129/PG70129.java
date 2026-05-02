package PG.level2._70129;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PG70129 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int cnt = 0;
        int zerocnt = 0;

        while(!s.equals("1")){
            int onecnt = 0;

            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '1'){
                    onecnt++;
                }
                else{
                    zerocnt++;
                }
            }

            s = Integer.toBinaryString(onecnt);
            cnt++;
        }

        System.out.println(cnt + " " + zerocnt);
    }
}
