package PG.level1._155652;

public class PG155652 {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            int count = 0;

            while(count < index){
                c++;

                if(c > 'z'){
                    c = 'a';
                }

                if(skip.indexOf(c) == -1){
                    count++;
                }
            }

            sb.append(c);
        }

        return sb.toString();
    }
}
