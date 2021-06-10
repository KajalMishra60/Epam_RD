import java.util.*;
class Demo{
    public void fun(float a, int ...b){
      System.out.println("first: "+a+" varargs length: "+b.length);
 }
}
public class VarArgs extends Demo{   
    public void fun(float a, int ...b){
        for(int i=0;i<b.length;i++)
        a+=b[i];
        System.out.println("sum of passed args: "+a);
   } 
public static void main(String[] ar){
Demo d=new Demo();
VarArgs va=new VarArgs();
d.fun(3.6f,6,8,9,2);
va.fun(9.8f, 1,3,4,5,6);
d=va;
d.fun(3.6f,6,8,9,2);
}
}