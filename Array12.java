public class Array12 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] arr1 = { 4, 5, 6 };
        int[] newarr = new int[2];
        newarr[0] = arr[1];
        newarr[1] = arr1[1];
        for (int i : newarr) {
            System.out.print(i + " ");
        }
    }
}
