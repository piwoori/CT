package BJ.silver._4._1764;

import java.io.*;
import java.util.*;

public class BJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            set.add(s);
        }

        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < M; i++){
            String view = br.readLine();
            if(set.contains(view)){
                result.add(view);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for(String s : result){
            System.out.println(s);
        }
    }
}
