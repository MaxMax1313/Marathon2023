package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count(717771237));

    }

    public static int count(int n) {
        if(n%10==0){
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count(n / 10);
        } else {
            return count(n/10);
        }



    }
}
