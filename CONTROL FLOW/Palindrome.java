public class Palindrome {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int temp = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum * 10 + digit;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is a Palindrome");
        } else {
            System.out.println(temp + " is not a Palindrome");
        }
    }
}
