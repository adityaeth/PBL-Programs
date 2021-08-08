public class Array7 {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 65, 6, 5, 46, 75, 85, 45, 45, 25 };
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
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i+1])
                System.out.print(arr[i] + " ");
        }
    }
}
