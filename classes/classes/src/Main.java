public class Main {
    public static void main(String[] args) {
    CustomerManager customerManager= new CustomerManager();
    customerManager.Add();
    customerManager.Remove();
    customerManager.Update();

    //value type
        int sayi1= 10;
        int sayi2=30;
        sayi2=sayi1;
        sayi1=20;
        System.out.println(sayi2);

    // referance type

        int[] sayilar1= new int[] {1,2,3};
        int[] sayilar2=new  int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=20;
        System.out.println(sayilar2[0]);
    }
}

