package BJ.bronze._3._14215;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ14215 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[3];

        list[0] = Integer.parseInt(st.nextToken());
        list[1] = Integer.parseInt(st.nextToken());
        list[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(list);

        if(list[0] + list[1] > list[2]) {
            System.out.println(list[0] + list[1] + list[2]);
        }
        else {
            System.out.println(2 * (list[0] + list[1]) - 1);
        }

    }
}
