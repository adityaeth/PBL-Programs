public class Array3 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 5, 8, 7, 6, 3, 4 };
        int search = 3;
        int matches = 0;
        for (int i : arr) {
            if (search == i)
                matches += 1;
        }
        if (matches > 0)
            System.out.println(matches + " Matches Found!");
    }
}
