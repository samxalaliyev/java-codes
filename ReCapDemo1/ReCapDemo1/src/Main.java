public class Main {
    public static void main(String[] args) {
        int sayi1=850;
        int sayi2=25;
        int sayi3=160;
        int max = sayi1;

        if (max<sayi3){
            max=sayi3;
        }
        if (max<sayi2){
            max= sayi2;
        }
        System.out.println("en boyuk sayi : " + max);


    }
}