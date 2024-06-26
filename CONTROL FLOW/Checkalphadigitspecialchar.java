public class Checkalphadigitspecialchar {
    public static void main(String[] args) {
        char n = '9';

        if (Character.isDigit(n)) {
            System.out.println("Digit");
        } else if (Character.isAlphabetic(n)) {
            System.out.println("alphabet");
        } else {
            System.out.println("special character");
        }
    }
}
