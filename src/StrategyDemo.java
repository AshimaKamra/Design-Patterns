interface Swimbehaviour{
    void swim();
}
class CanSwim implements Swimbehaviour{
    public void swim()
    {
        System.out.println("Can swim");
    }
}
class CannotSwim implements Swimbehaviour{
    public void swim()
    {
        System.out.println("Cannot swim");
    }
}
abstract class Animal
{
    private Swimbehaviour b;
    public void setSwimBehaviour(Swimbehaviour b)
    {
        this.b=b;
    }
    public void performSwim(){
        this.b.swim();
    }
    public void eat()
    {
        System.out.println("Eating..........");
    }
    public void drink(){
        System.out.println("Drinking.......");
    }
    abstract public void show();
}
class Dog extends Animal{
    public void show()
    {
        System.out.println("DOG");
    }
}
class Cat extends Animal{
    public void show()
    {
        System.out.println("CAT");
    }
    String name;
    if(name=="abc")
    {

    }
}

public class StrategyDemo {
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.setSwimBehaviour(new CanSwim());
        d.show();
        d.performSwim();

        Cat c = new Cat();
        d.setSwimBehaviour(new CannotSwim());
        d.show();
        d.performSwim();
    }
}
