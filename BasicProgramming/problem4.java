package BasicProgramming;

public class problem4 {
    private static boolean PrimeNumber(int num) {
    //Problem 4 - Prime Number

        int count = 0;
        for (int i = 1; i <= num; i++) {
if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
           return true;
        } else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(PrimeNumber(11));
        System.out.println(PrimeNumber(13));
        System.out.println(PrimeNumber(17));
        System.out.println(PrimeNumber(20));
        System.out.println(PrimeNumber(35));
    }
}
