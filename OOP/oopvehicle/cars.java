package OOP.oopvehicle;

public class cars extends Vehicles {

    void getType() {
        System.out.println("Type is Car");
        
    }

    void getColor() {
        System.out.println("Car Color White");
    }

    void getBrandName() {
        System.out.println("Car Brandname Toyota");
    }
    
    public static void main(String[] args) {
        cars car = new cars();
        car.getType();
        car.getColor();
        car.getBrandName();
    }
}
