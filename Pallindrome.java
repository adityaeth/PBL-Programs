public class Pallindrome {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int numo = num;
        int last = 0;
        int rev = 0;
        while (num > 0) {
            last = num % 10;
            rev = (rev * 10) + last;
            num /= 10;
        }
        if (rev == numo)
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
    }
}
