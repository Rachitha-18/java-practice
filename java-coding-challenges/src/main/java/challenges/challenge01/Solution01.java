package challenges.challenge01;

public class Solution01 {
    public static void main(String[] args) {
        String str = "Java";
        String reversed = new StringBuilder(str)
                .reverse().toString();
        System.out.println(reversed);
    }
}
