public class Product {

    //Constructor budur
    public Product(int id, String name, String description, double price,int stockAmount){
        System.out.println("Yapici blok calisti");
        //asagidaki kod yazilisini bur formada da yazmaq mumkundur
        this.id=id;
        this.name=name;
        this.price=price;
        this.stockAmount=stockAmount;
        this.description=description;
    }


    public Product(){

    }
    // bunlara atribute veya field deyilir
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;

    //getter
    public int getId() {
        return id;
    }
    //setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod(){
        return this.name.substring(0,1) + id;
    }
}
