public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Notebook","Gaming notebook",3000,23);
//        Product product1= new Product();
//        product.setId(1);
//        product.setName("Laptop");
//        product.setDescription("Gaming laptop");
//        product.setStockAmount(15);
//        product.setPrice(1500);


        ProductManager productManager= new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}