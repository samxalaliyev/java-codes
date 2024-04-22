public class Main {
    public static void main(String[] args) {
        String mesaj = "Bu gun hava cok guzel.";
        System.out.println(mesaj);

    /*    System.out.println("Eleman sayisi : " + mesaj.length());
        System.out.println("5ci eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasin"));
        System.out.println(mesaj);*/

        //Mesaji yeniden yazsaq evvelki deyerini yazacaq. Cunki concat metodu yeni String yaradir.
        //eger yeniden istifade etmek istiyirikse onu yeni bir deyisene menimsetmek lazimdi

       /* System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] karakter= new char[6];
        mesaj.getChars(0,6,karakter,0);
        System.out.println(karakter);
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("a"));*/

        System.out.println(mesaj.replace(" ","-"));
        System.out.println(mesaj.substring(4,12));

        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());


    }
}