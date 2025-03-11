public class GetCharsExample {
    public static void main(String[] args) {
        String s1 = "Welcome To New Project";
        char[] c1 = new char[5];

        s1.getChars(1, 6, c1, 0); // Copy characters from index 1 to 5

        System.out.println("Extracted characters:");
        System.out.println(c1);
    }
}
