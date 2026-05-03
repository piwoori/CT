package PG.level2._12911;

public class PG12911 {
    public int solution(int n) {
        int onecnt = Integer.bitCount(n);
        while(true){
            n++;
            if(Integer.bitCount(n) == onecnt){
                return n;
            }
        }
    }
}
