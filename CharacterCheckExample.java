public class CharacterCheckExample {
    public static void main(String[] args) {
        String s1 = "Welcome To New Project";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
                         System.out.println();
               System.out.println("Character: " + ch);


            System.out.println("Is Letter? " + Character.isLetter(ch));
            System.out.println("Is Digit? " + Character.isDigit(ch));
        }
    }
}
