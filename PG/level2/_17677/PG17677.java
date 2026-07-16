package PG.level2._17677;

import java.util.ArrayList;

public class PG17677 {
    public int solution(String str1, String str2) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i = 0; i < str1.length() - 1; i++) {
            String s = str1.substring(i, i + 2);

            if(s.matches("[a-z]{2}")){
                list1.add(s);
            }
        }

        for(int i = 0; i < str2.length() - 1; i++) {
            String s = str2.substring(i, i + 2);

            if(s.matches("[a-z]{2}")){
                list2.add(s);
            }
        }

        int inter = 0;

        for(String s : list1){
            if(list2.contains(s)){
                inter++;
                list2.remove(s);
            }
        }

        int union = list1.size() + list2.size();

        if(union == 0){
            return 65536;
        }

        return (int) ((double) inter / union * 65536);
    }
}
