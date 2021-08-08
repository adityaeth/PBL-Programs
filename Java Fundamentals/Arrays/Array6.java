public class Array6 {
    public static void main(String[] args) {
        int[] arr = { 5, 65, 14, 87, 2, 4, 7, 54, 889, 45, 74 };
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr)
            System.out.print(i + " ");
    }
}
