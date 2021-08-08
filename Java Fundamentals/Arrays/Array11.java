public class Array11 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 4, 4, 6 };
        int flag = 0;
        for (int i : arr) {
            if (i != 1 && i != 4) {
                flag++;
            }
        }
        if (flag > 0)
            System.out.println("False");
        else
            System.out.println("True");
    }
}
