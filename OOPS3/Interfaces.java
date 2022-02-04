package OOPS3;

interface VehicleInteface{
    public void print(); 
    public int vehicleWheel();
}

interface CarInterface extends VehicleInteface{

    public final static int wheel = 4; //this data member which is final and static can be declared in the interface

    public void isElectric();

}

class vehicle implements VehicleInteface{

    @Override
    public void print() {
         System.out.println("This is the vehicle class!!");        
    }

    @Override
    public int vehicleWheel() {
        System.out.println("Wheels between 2 to 12");
        return 6;
    }

    
}


class Car extends vehicle implements CarInterface{

    @Override
    public void isElectric() {
System.out.println("Yes");        
    }
    
}

public class Interfaces {
    public static void main(String[] args) {
        Car c = new Car();
        c.isElectric();
        vehicle v = new vehicle();
       int find = v.vehicleWheel();
       System.out.println(find);
    }
}
