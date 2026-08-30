package PG.level2._17686;

import java.util.*;

public class PG17686 {
    public String[] solution(String[] files) {
        Arrays.sort(files, (a, b) -> {
            String headA = getHead(a);
            String headB = getHead(b);

            int headCompare = headA.compareToIgnoreCase(headB);

            if(headCompare != 0){
                return headCompare;
            }

            int numberA = getNumber(a);
            int numberB = getNumber(b);

            return numberA - numberB;
        });

        return files;
    }

    private String getHead(String file){
        int i = 0;

        while(i < file.length() && !Character.isDigit(file.charAt(i))){
            i++;
        }

        return file.substring(0, i);
    }

    private int getNumber(String file){
        int i = 0;

        while(i < file.length()
                && Character.isDigit(file.charAt(i))){
            i++;
        }

        int start = i;

        while(i < file.length()
                && Character.isDigit(file.charAt(i))
                && i - start < 5){
            i++;
        }

        return Integer.parseInt(file.substring(start, i));
    }
}
