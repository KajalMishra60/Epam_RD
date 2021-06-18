class Bird {
    void eat(){
        System.out.println("Bird can eat");
    }
}

class FlyingBird extends Bird{
    void Fly(){
        System.out.println("Bird can fly");
    }
}

class Duck extends FlyingBird {
    public void Fly()
    {
        System.out.println("Duck can fly");
    }
}

class Ostrich extends Bird {
    public void eat()
    {
        System.out.println("Ostrich can eat");
    }
}

public class LiskovEx {
    public static void main(String args[])
    {
        Bird ostrich = new Ostrich();
        ostrich.eat();

        FlyingBird duck = new FlyingBird();
        duck.Fly();
    }
}