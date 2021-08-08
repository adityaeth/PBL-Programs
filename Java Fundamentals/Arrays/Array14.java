public class Array14 {
    public static void main(String[] args) {
        if (args.length < 9) {
            System.out.println("Please enter 9 digit integer numbers");
            System.exit(0);
        }
        int[][] arr = new int[3][3];
        int k = 0;
        int max = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }
        System.out.println("The Given array is: ");
        for (int i[] : arr) {
            for (int j : i) {
                System.out.print(j + " ");
                if (j > max) {
                    max = j;
                }
            }
            System.out.println();
        }
        System.out.println("The biggest numeber in the given array is " + max);
    }
}
