public class A
{
  static
  {
    System.out.println("I am first static block");
  }
  {
    System.out.println("I am first instance block");
  }
  A()
  {
    System.out.println("I am A class constructor");
  }
  public static void main(String[] args)
  {
    A a1 = new A();
    System.out.println("I am main method");
  }
  {
    System.out.println("I am second instance block");
  }
  static
  {
    System.out.println("I am second static block");
  }
}

