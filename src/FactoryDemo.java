abstract class Pizza
{
    public abstract void prepare();
    public void bake(){
        System.out.println("baked");
    }
    public void pack(){System.out.println("Pizza ready");}
}
class VegPizza extends Pizza{
    public void prepare()
    {
        System.out.println("adding cheese");
    }
}
class ChickenPizza extends Pizza{
    public void prepare()
    {
        System.out.println("adding chicken ,cheese");
    }
}
class PizzaFactory{
    public Pizza getPizza(String name)
    {
        Pizza p=null;
        if(name.equals("veg"))
        {
            p=new VegPizza();
        }
        if(name.equals("chicken"))
        {
            p=new ChickenPizza();
        }
        return p;
    }
}


public class FactoryDemo {
    public static void main(String... x)
    {
        PizzaFactory pf= new PizzaFactory();
        Pizza p = pf.getPizza("veg");
        p.prepare();
        p.bake();
        p.pack();
    }
}
