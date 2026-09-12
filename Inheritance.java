public class Dad{
    int money = 20000;
}

public class Son extends Dad{
    
}

class Main {
    public static void main(String[] args) {
        Son s1=new Son();
        System.out.println(s1.money);
    }
}
