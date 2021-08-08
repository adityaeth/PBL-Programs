public class Array9 {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 10 };
        int[] newarr = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                newarr[j] = arr[i];
                j++;
            }
        }
        for (int i : newarr)
            System.out.print(i + " ");
    }
}
