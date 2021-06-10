import java.util.*;
class parent{
    protected static int x=10;
    public static void fun1(){
        System.out.println("In Parent static ");
    }
    public  void fun2(){
        System.out.println("In Parent non-static ");
    }
}
class child extends parent{
    static int x=20;
    public static void fun1(){
        System.out.println("In Child static ");
    }
    public  void fun2(){
        System.out.println("In child non-static ");
    }
}
public class hiding{
    public static void main(String [] ar){
        parent p=new parent();
        p.fun1();
        p.fun2();
        System.out.println(p.x);
        child c=new child();
        c.fun1();
        c.fun2();
        System.out.println(c.x);
        p= c; //new child();
        p.fun1();
        p.fun2();
        System.out.println(p.x);
        //c=p; // downcasting not possible
    }
}