public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
//        customerManager.customerDal=new OracleCUstomerDal();

        customerManager.add();
    }
}