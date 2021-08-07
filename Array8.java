public class Array8 {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 6, 1, 2, 7, 9 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6 && i < arr.length) {
                while (arr[i] != 7) {
                    i++;
                }
                if (arr[i] == 7 && i < arr.length) {
                    continue;
                }
            }
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
