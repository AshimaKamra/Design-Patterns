package design;
import java.util.*;
class Sender{
private List<Subscriber> subs = new ArrayList<>();
private String message;

public void subscribe(Subscriber s)
{
    subs.add(s);
}
public void unsubscribe(Subscriber s)
{
    subs.remove(s);
}
public void sendMessage(){
    for(Subscriber s : subs)
    {
        s.update(this.message);
    }
}
public void publishMessage(String message){
    this.message=message;
    sendMessage();
}
}
class Subscriber{
    private String name;
    private Sender sd;
    Subscriber(String name)
    {
        this.name=name;
    }
    public void subscriberSender(Sender sd)
    {
        this.sd=sd;
    }
    public void update(String message)
    {
        System.out.println(this.name+" : New Message :" + message);
    }
}
public class ObserverDemo {
    public static void main(String... x)
    {
        Sender sd=new Sender();
        //subscriber ko bta rhe h ki sender kon kon h
        Subscriber s1=new Subscriber("A");
        Subscriber s2=new Subscriber("B");
        Subscriber s3=new Subscriber("C");
        Subscriber s4=new Subscriber("D");
        sd.subscribe(s1);
        sd.subscribe(s2);
        sd.subscribe(s3);
        sd.subscribe(s4);


        //sender ko bta rhe h subscriber kon kon h
        s1.subscriberSender(sd);
        s2.subscriberSender(sd);
        s3.subscriberSender(sd);
        s4.subscriberSender(sd);

        sd.publishMessage("Hello Java");
        sd.publishMessage("Hello World");

    }
}
