package BJ.bronze._2._2774;

import java.util.*;
public class BJ2774 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < T; i++){
            String X = sc.nextLine();
            char[] list = new char[X.length()];
            for (int j = 0; j < X.length(); j++){
                list[j] = X.charAt(j);
            }
            Set<Integer> set = new HashSet<>();
            for (int n : list) set.add(n);

            List<Integer> arr = new ArrayList<>(set);
            Collections.sort(arr);
            System.out.println(arr.size());
        }
        sc.close();
    }
    
}
