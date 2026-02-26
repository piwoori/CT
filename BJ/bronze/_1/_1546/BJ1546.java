package BJ.bronze._1._1546;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1546 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] list = new double[N];

        double sum = 0;
        double max = 0;

        for(int i = 0; i < N; i++) {
            list[i] = Double.parseDouble(st.nextToken());

            if(list[i] > max){
                max = list[i];
            }
        }

        for(int i = 0; i < N; i++) {
            list[i] = (list[i] / max) * 100;
            sum += list[i];
        }

        System.out.println(sum / N);
    }
}
