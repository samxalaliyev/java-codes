public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranack = 9;
        boolean var = false;

//    for(int i=1; i<sayilar.length;i++){
//        if (sayilar[i] == aranack){
//            var=true;
//            break;
//        }
//    }

        //asagidaki kimi de yazmaq olar

        for (int sayi : sayilar) {
            if (sayi== aranack){
                var=true;
                break;
            }
        }
        if (var) {
            System.out.println("Bu sayi var");
        } else {
            System.out.println("Malesef aranan sayi bulunmadi");
        }

    }
}