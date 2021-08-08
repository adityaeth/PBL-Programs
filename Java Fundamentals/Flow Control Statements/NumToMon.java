public class NumToMon {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("April");
                break;
            default:
                System.out.println("Error");
        }
    }
}
