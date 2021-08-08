public class ColorCode {
    public static void main(String[] args) {
        char code = args[0].charAt(0);
        switch(code){
            case 'R':
            System.out.println("Red");
            break;
            case 'B':
            System.out.println("Blue");
            break;
            default:
            System.out.println("Wrong input");
        }
    }
}
