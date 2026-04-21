package BJ.silver._5._1181;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(in.readLine()); //중복 제거
        }

        List<String> list = new ArrayList<>(set);

        list.sort((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b); // 사전순
            }
            return a.length() - b.length(); // 길이순
        });

        for(String s : list) {
            System.out.println(s);
        }
    }
}
