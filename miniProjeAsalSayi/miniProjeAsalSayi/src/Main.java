public class Main {
    public static void main(String[] args) {
        int number = 23;
//        int remainder = number % 2;
//        System.out.println(remainder);

        if (number >= 2) {

            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count += 1;
                }
            }
            if (count > 2) {
                System.out.println("Bu sayi asal sayi deyil");
                System.out.println("Ededin bolunenlerinin sayi : " + count);
            } else {
                System.out.println("Bu sayi asal sayidir");
            }
        } else if (number==1) {
            System.out.println("Bu sayi asal sayi deyil");
        } else {
            System.out.println("Gecersiz sayi");
        }

    }
}