public class CustomerManager {
    private ICustomerDal customerDal;
    //ICustomerDal customerDal
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }
    public void add(){
        //bura iş kodları yazılır
        customerDal.Add();

    }
}
