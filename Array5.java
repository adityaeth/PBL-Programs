public class Array5 {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 7, 9, 25, 45, 64, 84, 68, 14 };
        int[] max = { 0, 0 };
        int[] min = { Integer.MAX_VALUE, Integer.MAX_VALUE };
        int temp = 0;
        for (int i : arr) {
            if (max[0] < i) {
                max[1] = max[0];
                max[0] = i;
            } else if (max[1] < i && i != max[0]) {
                max[1] = i;
            }
        }
        for (int i : arr) {
            if (min[0] > i) {
                min[0] = max[1];
                min[0] = i;
            } else if (min[1] > i && min[0] != i) {
                min[1] = i;
            }
        }
        System.out.println("Max values: " + max[0] + " " + max[1]);
        System.out.println("Min Values: " + min[0] + " " + min[1]);

    }
}
