public class PatternFor {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        for (int i = 0; i < size + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
