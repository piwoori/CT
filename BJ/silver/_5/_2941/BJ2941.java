package BJ.silver._5._2941;

import java.io.*;

public class BJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] c_alph = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();
        br.close();

        for (int i = 0; i < c_alph.length; i++) {
            if(str.contains(c_alph[i])) {
                str = str.replace(c_alph[i], "#");
            }
        }
        bw.write(Integer.toString(str.length()));
        bw.flush();
        bw.close();
    }
}
