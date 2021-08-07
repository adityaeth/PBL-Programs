public class Array10 {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 2 };
        int[] newarr = new int[arr.length];
        int indexE = 0;
        int indexO = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newarr[indexE++] = arr[i];
            } else {
                newarr[indexO--] = arr[i];
            }
        }
        for (int i : newarr) {
            System.out.print(i + " ");
        }
    }
}