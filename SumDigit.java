public class SumDigit {
    public static void main(String[] args) {
        int sum = 0;
        int last = 0;
        int num = Integer.parseInt(args[0]);
        for (int i = num; i > 0; i /= 10) {
            last = i % 10;
            sum += last;
        }
        System.out.println(sum);
    }
}
