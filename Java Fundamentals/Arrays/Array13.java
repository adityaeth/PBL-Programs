public class Array13 {
    public static void main(String[] args) {
        if (args.length < 9) {
            System.out.println("Please enter 9 digit integer numbers");
            System.exit(0);
        }
        int[][] arr = new int[3][3];
        int k = 0;
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
            }
            System.out.println();
        }
        System.out.println("The reverse of the array is: ");
        for (int i = arr.length - 1; i > -1; i--) {
            for (int j = arr.length - 1; j > -1; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}