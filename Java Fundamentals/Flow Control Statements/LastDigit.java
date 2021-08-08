public class LastDigit {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]) % 10;
        int num2 = Integer.parseInt(args[1]) % 10;

        if (num1 == num2)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
