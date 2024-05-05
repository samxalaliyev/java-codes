public class ProductValidator {
    //static metod olan zaman da başda nəsə yazmaq istəsək static consturctorlar işlədilir
    static {
        System.out.println("Statik yapici blok calisti");
    }

    //eger biz satatic bir metod yaratsaq asagidaki construktor ise dusmeyecek
    public ProductValidator(){
        System.out.println("Yapici blok calisti");
    }
    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public void bisey(){

    }

    //biz ana classi static edebilmerik
    //ama istesek inner class yaradaraq onu static ede bilerik

    public static class InnerClass{
        public static void Sil(){

        }
    }

}
