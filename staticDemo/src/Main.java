public class Main {
    public static void main(String[] args) {
        ProductManager manager=new ProductManager();
        Product product=new Product();
        product.price=10;
        product.name="";
        manager.add(product);

        //static classlari bu formada cagira bilerik
        // ama bu formada kod yazmaq tovsiye olunmur
        // inner classlar cox istifadesi tovsiyesi olmur. her is ucun ayri class yaratmaq meslehetdi
        DatabaseHelper.Crud.Delete();
    }
}