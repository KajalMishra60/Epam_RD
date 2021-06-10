public class overloading{
    public static void main(String [] ar){
        addition a=new addition();
        a.add(2,7);
        a.add(2,2.5f);
        a.add("Hello ","People");
    }
}
class addition{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(float a, float b){
        System.out.println(a+b);
    }
    public void add(String a, String b){
        System.out.println(a+b);
    }
}