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

