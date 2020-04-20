package design;

interface HDMI{
    void display();
}
class HDMICable implements HDMI{
    public void display(){
        System.out.println("Display data");
    }
}
class HDMITwoCable implements HDMI{
    public void display(){
        System.out.println("Display third data");

    }
}
class HDMIThreeCable implements HDMI{
    public void display(){
        System.out.println("Display second data");

    }
}

interface VGA{
    void show();
}
class VGACable implements VGA{
    public void show(){
        System.out.println("Show Data");
    }
}

class HDMIAdapter implements HDMI{
    private VGACable cable=new VGACable();
    public void display(){
        this.cable.show();
    }
}
class Displaydata{
    private HDMI cable;
    public void setCable(HDMI cable)
    {
        this.cable=cable;
    }
    public void project(){
        this.cable.display();
    }
}

public class AdapterDemo {
    public static void main(String...x)
    {
        Displaydata d=new Displaydata();
//        HDMICable cable= new HDMICable();
//        VGACable cable=new VGACable();
        HDMIAdapter cable=new HDMIAdapter();
        d.setCable(cable);
        d.project();
    }
}
