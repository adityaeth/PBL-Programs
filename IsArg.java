public class IsArg {
    public static void main(String[] args) {
        if (args.length == 0)
            System.out.println("No Values");
        else {
            for (String values : args) {
                System.out.print(values+", ");
            }
        }
    }
}
