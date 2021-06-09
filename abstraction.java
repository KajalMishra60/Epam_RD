import java.util.*;
public class abstraction{
    public static void main(String[] ar){
        male m=new male("Ram");
        //m.setName("Ram");
        m.setWife("Seeta");
        m.setSex(true);
        System.out.println(m.getName());
        System.out.println(m.getWife());
        System.out.println(m.getSex());
        System.out.println("-----------------------")  ;

        female fe=new female("Seeta");
        fe.setHusband("Ram");
        fe.setSex(false);
        System.out.println(fe.getName());
        System.out.println(fe.getHusband());
        System.out.println(fe.getSex());
        System.out.println("-----------------------");
    
        father obj=new father("Ram");
        obj.setWife("Seeta");
        obj.setSex(true);
        obj.setChild(2);
        System.out.println(obj.getName());
        System.out.println(obj.getWife());
        System.out.println(obj.getSex());
        System.out.println(obj.getChildren());
    }
}
interface human{
    public String getName();
}
abstract class person implements human{
    protected String name;
    protected boolean sex;
    public person(){
        System.out.println("A person is created");
    }
    public String getName(){
        return name;
    }
    public void setSex(boolean sex){      
        this.sex=sex;
    }
    public abstract String getSex();
}
class male extends person{
    private String wife;  
    male(String name){
        this.name=name;
    }  
    
     public void setWife(String wife){
         this.wife=wife;
     }
     public String getWife(){
        return wife;
    }
     public String getSex(){
        return sex==false?"Female":"Male";
     }
 }
 class female extends person{
    private String husband;
    female(String name){
        this.name=name;
    }  
    
     public void setHusband(String h){
         this.husband=h;
     }
     public String getHusband(){
        return husband;
    }
     public String getSex(){
        return sex==false?"Female":"Male";
     }
 }
class father extends male{
private int children;
father(String na){
    super(na);
}  
public void setChild(int child){
    this.children=child;
}
public int getChildren(){
   return children;
}
}
