package opel;

public class Opel_Car extends Opel{
    int Speed=0;
    byte Capacity=0;
    String Steer_Position="";
    String Type="";
    int Price=0;
    //default Constructor
    public Opel_Car()
    {}
    public Opel_Car(int Speed,byte Capacity,String Steer_Position,String Type,int Price)
    {
        this.Speed=Speed;
        this.Capacity=Capacity;
        this.Steer_Position=Steer_Position;
        }
    
}
