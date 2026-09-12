public class Teacher {

    String myname; // this can be represented as t1.myname

    Teacher(){
        System.out.println("Hello");
    }

    void setname(String myname)
    {
        this.myname = myname; // without this it will take the arugument value only but we need to take the t1.name so the this keyword is used
    }
    
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setname("Mark");
        System.out.println(t1.myname);
        
    }
}
