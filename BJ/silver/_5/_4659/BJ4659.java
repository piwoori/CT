package BJ.silver._5._4659;

import java.util.Scanner;

public class BJ4659 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;

        while(true) {
            s = sc.nextLine();

            if (s.equals("end")) {
                break;
            }

            int vcount = 0;
            int ccount = 0;

            boolean vflag = false;
            boolean vcflag = true;
            boolean flag = true;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ) {
                    vflag = true;
                    vcount++;
                    ccount = 0;
                    if(vcount >= 3){
                        vcflag = false;
                        break;
                    }
                }
                else{
                    ccount++;
                    vcount = 0;
                    if(ccount >= 3){
                        vcflag = false;
                        break;
                    }
                }
                if( i >= 1){
                    if(s.charAt(i) != 'e' && s.charAt(i) != 'o') {
                        if (s.charAt(i) == s.charAt(i - 1)) {
                            flag = false;
                        }
                    }
                }
            }

            if(flag && vflag && vcflag){
                System.out.println("<" + s + "> is acceptable.");
            }
            else{
                System.out.println("<" + s + "> is not acceptable.");
            }
        // sc.close();
        }
    }
}
