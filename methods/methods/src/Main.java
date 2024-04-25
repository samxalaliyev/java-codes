public class Main {
    public static void main(String[] args) {
    sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 4;
        boolean var = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                var = true;
                break;
            }
        }
        if (var) {
            mesajVer("Bu sayi var: " + aranacak);
        } else {
            mesajVer("Malesef aranan sayi bulunmadi");
        }

    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }
}