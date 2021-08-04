public class CharValue {
    public static void main(String[] args) {
        char in = '%';
        if(Character.isDigit(in))
        System.out.println("Digit");
        else if(Character.isAlphabetic(in))
        System.out.println("Alphabet");
        else
        System.out.println("Special Character");
    }
}
