public class Main {
    public static void main(String[] args) {
        //6 --> 1,2,3
        int number = 60;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += + i;
            }
        }

        if (total == number){
            System.out.println("Bu sayi mukemmel bir sayidir");
        }else {
            System.out.println("Bu sayi mukemmel bir sayi degil");
        }

    }
}