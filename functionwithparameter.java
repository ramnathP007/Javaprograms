public class Store {

    void getsoap(int money){
        System.out.println(money);
        System.out.println("Soap Purchased");
    }

    void chocolate(int money){
        System.out.println(money);
        System.out.println("chocolate Purchased");
    }

    void powder(int money){
        System.out.println(money);
        System.out.println("powder Purchased");
    }

    public static void main (String[] args)
    {
        Store obj1=new Store();
        obj1.getsoap(20);
        obj1.chocolate(30);
        obj1.powder(40);
    }

    
}
