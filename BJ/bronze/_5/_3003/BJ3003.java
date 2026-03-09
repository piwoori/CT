package BJ.bronze._5._3003;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ3003 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int rook = Integer.parseInt(st.nextToken());
        int bishop = Integer.parseInt(st.nextToken());
        int knight = Integer.parseInt(st.nextToken());
        int pawn = Integer.parseInt(st.nextToken());

        sb.append(1 - king).append(" ");
        sb.append(1 - queen).append(" ");
        sb.append(2 - rook).append(" ");
        sb.append(2 - bishop).append(" ");
        sb.append(2 - knight).append(" ");
        sb.append(8 - pawn);

        System.out.println(sb);
    }
}
