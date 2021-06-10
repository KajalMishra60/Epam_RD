import java.util.*;
class Person{
    private String name;
    private String id;
    private String branch;
    int age=10;
    public Person() {
        this("Prashant");
    }

    public Person(String name) {
        this(name,"1234");
    }

    public Person(String name, String id) {
        this(name,id,"CS");
    }

    public Person(String name, String id, String branch) {
       
        this.name = name;
        this.id = id;
        this.branch = branch;
    }
    public void getname(){
        System.out.println(name);
    }
}
class Employee extends Person{
    float salary;
    public Employee(String s){
        super(s);
    }
    public Employee(float salary){
        this.salary=salary;
    }
    public void getname(){
        super.getname();        
    }
}
public class SuperVsThis{
    public static void main(String [] ar){
        Person p=new Person("Kajal");
        p.getname();
        Employee emp=new Employee(84.9f);
        emp.getname();        
        System.out.println(emp.salary);
        emp=new Employee("Kajal Mishra");
        emp.getname();
        System.out.println(p.age);
    }
}