public class Array3 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 5, 8, 7, 6, 3, 4 };
        int search = 5;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                index = i;
            }
        }
        if (index >= 0)
            System.out.println(index);
        else
            System.out.println("-1");
    }
}
