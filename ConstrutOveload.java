import java.util.*;
class Test{
    public Test(){
        System.out.println("You didn't pass me anything");
    }
    public Test(int a){
        System.out.println("I have a integer");
    }
    public Test(int a, String k){
        System.out.println("I have a integer and a String as well");
    }
    public static void fun1(){
        System.out.println("In Test static ");
    }
    public  void fun2(){
        System.out.println("In Test non-static ");
    }
}

public class ConstrutOveload{
    public static void main(String [] ar){
        Test p=new Test();
        p.fun1();
        p=new Test(1);
        p.fun2();
        p=new Test(5,"Kajal");
    }
}