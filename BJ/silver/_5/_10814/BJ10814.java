package BJ.silver._5._10814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ10814 {
    static class Person{
        int age;
        String name;

        Person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Person[] arr = new Person[N];

        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            arr[i] = new Person(age, name);
        }

        Arrays.sort(arr, (a, b) -> a.age - b.age);

        StringBuilder sb = new StringBuilder();
        for(Person p : arr) {
            sb.append(p.age).append(" ").append(p.name).append("\n");
        }

        System.out.println(sb);
    }
}
