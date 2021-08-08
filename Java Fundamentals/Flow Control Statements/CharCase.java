public class CharCase {
    public static void main(String[] args) {
        char alpha = 'A';
        if (Character.isLowerCase(alpha)) {
            System.out.println(Character.toUpperCase(alpha));
        } else {
            System.out.println(Character.toLowerCase(alpha));
        }
    }
}
