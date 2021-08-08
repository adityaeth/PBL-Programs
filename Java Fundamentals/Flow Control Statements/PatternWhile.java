public class PatternWhile {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int i = 0;
        while (i < size + 1) {
            int j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
