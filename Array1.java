public class Array1 {
    public static void main(String[] args) {
        int[] num = { 5, 9, 8, 3, 4, 1 };
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i : num) {
            sum += i;
        }
        for (int i : num) {
            if (max < i) {
                max = i;
            }
        }
        for (int i : num) {
            if (min > i) {
                min = i;
            }
        }
        int avg = sum / num.length;

        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);
    }
}
