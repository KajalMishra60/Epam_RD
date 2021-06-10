import java.util.*;
class StaticClass{
    private static String str = "Static Class Example";
 
    static class MyNestedClass{
     public void disp() {
 
        System.out.println(str); 
     }
 
    }
    public static void main(String args[])
    {
        StaticClass.MyNestedClass obj = new StaticClass.MyNestedClass();
     obj.disp();
    }
 }