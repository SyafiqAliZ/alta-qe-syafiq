package BasicProgramming;

public class problem5 {
    private static boolean palindrome(String value) {
    //Problem 5 - Palindrome

        StringBuilder rev = new StringBuilder();
        int len = value.length();
        for (int i = len - 1; i >= 0; i--) {
            rev.append(value.charAt(i));
        }
        return value.contentEquals(rev);
    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}
