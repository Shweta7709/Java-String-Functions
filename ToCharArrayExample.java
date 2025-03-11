public class ToCharArrayExample {
    public static void main(String[] args) {
        String s1 = "Welcome To New Project";
        char[] c = s1.toCharArray();

        System.out.println("Character array:");
        for (char ch : c) {
            System.out.println(ch);
        }
    }
}
