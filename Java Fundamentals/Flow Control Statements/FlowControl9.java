class FlowControl9 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 10; i < 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--)
                if (i % num == 0)
                    counter += 1;
            if (counter == 2)
                primeNumbers += i + " ";
        }

        System.out.println("Prime numbers from 10 to 99 are :");
        System.out.println(primeNumbers);
    }
}