//pwd: Java/package_one/Teacher.java
package package_one;

public class Teacher{
    int salary = 10000;

    void display(){
        System.out.println(salary);
    }
}

//pwd: Java/package_one/Student.java
package package_one;

public class Student {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.display();
    }
    
}


/*
while running the javac cmd we should run in the pwd: Java/package_one

and while running the program we should run the cmd java packagename.mainclassname
i.e 
java package_one.Student.java


public can be accessed in any packages ie it can be accessed in different packages

But the default ie without mentioning anything cannot be accessed in different packages but default can be accessed anywhere in the same package

to access the class in the different package we must import the class from that package using the import packagename.class name



*/


package package_two;

public class Teacher {
    public int salary = 10000;
}

import package_two.Teacher;


package package_one;

public class Student {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.display();
    }
    
}


/*
If we use protected we cannot use it directly by creating a object but we can we the variable of by extending the class with the current class and then use it
*/

package package_two;

public class Teacher {
    protected  int salary = 10000;
}

package package_one;
import package_two.Teacher;
public class Student extends Teacher {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.salary);
    }
    
}



/*

Public: Can be accessed anywhere

Private: Can be accessed only inside the class

Default:
(Package-Private):
Class: A class with no access modifier (package-private) is accessible only within the same package

Protected:
Accessible anywhere within the same package
It is accessible from other package only through a subclass by importing the package and extending the class in the subclass

*/


