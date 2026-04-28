package PG.level2._12939;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PG12939 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] slist = br.readLine().split(" ");
        int[] ilist = new int[slist.length];
        for (int i = 0; i < slist.length; i++) {
            ilist[i] = Integer.parseInt(slist[i]);
        }
        Arrays.sort(ilist);

        System.out.println(ilist[0] + " " + ilist[slist.length - 1]);

    }
}
