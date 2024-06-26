public class Reversecase {
    public static void main(String[] args) {
        char c = 'a';
        if (c >= 'a' && c <= 'z') {
            c = (char) (c - 32);
            System.out.println(c);
        } else if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
            System.out.println(c);
        }
    }
}
