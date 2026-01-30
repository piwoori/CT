package BJ.silver._4._1358;

import java.io.*;
import java.util.*;

public class BJ1358 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int R = H / 2;
        int cy = Y + R;          // 두 원의 중심 y
        int leftCx = X;          // 왼쪽 원 중심 x
        int rightCx = X + W;     // 오른쪽 원 중심 x
        int r2 = R * R;

        int count = 0;

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            boolean inside = false;

            // 1) 직사각형
            if (X <= x && x <= X + W && Y <= y && y <= Y + H) {
                inside = true;
            }
            // 2) 왼쪽 반원 (x가 왼쪽에 있을 때만 검사)
            else if (x < X) {
                int dx = x - leftCx;
                int dy = y - cy;
                if (dx * dx + dy * dy <= r2) inside = true;
            }
            // 3) 오른쪽 반원 (x가 오른쪽에 있을 때만 검사)
            else if (x > X + W) {
                int dx = x - rightCx;
                int dy = y - cy;
                if (dx * dx + dy * dy <= r2) inside = true;
            }

            if (inside) count++;
        }

        System.out.println(count);
    }
}
