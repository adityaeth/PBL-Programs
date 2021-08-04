public class Reverse {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int last = 0;
        int rev = 0;
        while (num > 0) {
            last = num % 10;
            rev = (rev * 10) + last;
            num /= 10;
        }
        System.out.println(rev);
    }
}
