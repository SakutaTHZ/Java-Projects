package OOP.oopvehicle;

public class bikes extends Vehicles {

    void getType() {
        System.out.println("Type is Bike");
        
    }

    void getColor() {
        System.out.println("Bike Color red");
    }

    void getBrandName() {
        System.out.println("Bike Brandname BMW");
    }
    
    public static void main(String[] args) {
        bikes bike = new bikes();
        bike.getType();
        bike.getColor();
        bike.getBrandName();
    }
}
