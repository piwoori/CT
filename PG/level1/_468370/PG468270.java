package PG.level1._468370;

import java.util.*;

public class PG468270 {
    static class Word{
        String text;
        int start;
        int end;
        int remain;
        boolean spoiler;

        Word(String text, int start, int end) {
            this.text = text;
            this.start = start;
            this.end = end;
        }
    }

    public int solution(String message, int[][] spoiler_ranges){
        List<Word> words = new ArrayList<>();

        int[] wordIndex = new int[message.length()];
        Arrays.fill(wordIndex, -1);

        int start = 0;

        while(start < message.length()){

            int end = start;

            while(end < message.length() && message.charAt(end) != ' '){
                end++;
            }

            String text = message.substring(start, end);
            Word word = new Word(text, start, end - 1);

            int idx = words.size();
            words.add(word);

            for(int i = start; i < end; i++){
                wordIndex[i] = idx;
            }

            start = end + 1;
        }

        List<List<Integer>> rangeWords = new ArrayList<>();

        for(int i = 0; i < spoiler_ranges.length; i++){
            rangeWords.add(new ArrayList<>());
        }

        for(int r = 0; r < spoiler_ranges.length; r++){
            int s = spoiler_ranges[r][0];
            int e = spoiler_ranges[r][1];

            int prev = -1;

            for(int i = s; i <= e; i++){
                if(wordIndex[i] == -1){
                    continue;
                }

                int idx = wordIndex[i];

                if(idx != prev){
                    rangeWords.get(r).add(idx);

                    Word word = words.get(idx);
                    word.spoiler = true;
                    word.remain++;

                    prev = idx;
                }
            }
        }

        Set<String> normalWords = new HashSet<>();

        for(Word word : words){
            if(!word.spoiler){
                normalWords.add(word.text);
            }
        }

        Set<String> revealed = new HashSet<>();

        int answer = 0;

        for(int r = 0; r <spoiler_ranges.length; r++){
            List<Integer> opened = new ArrayList<>();

            for(int idx : rangeWords.get(r)){
                Word word = words.get(idx);

                word.remain--;

                if(word.remain == 0){
                    opened.add(idx);
                }
            }

            Collections.sort(opened);

            for(int idx : opened){
                String text = words.get(idx).text;

                if(!normalWords.contains(text) && !revealed.contains(text)){
                    answer++;
                }

                revealed.add(text);
            }
        }

        return answer;
    }
}
