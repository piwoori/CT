package BJ.silver._5._4673;

public class BJ4673 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];

        for(int i = 1; i < 10001; i++){
            int num = self(i);

            if(num < 10001){
                arr[num] = true;
            }
        }

        for(int i = 1; i < 10001; i++){
            if(arr[i] == false){
                System.out.println(i);
            }
        }
    }

    public static int self(int a){
        int result = a + a % 10 + a % 100 / 10 + a % 1000 / 100 + a % 10000 / 1000;
        return result;
    }
}
