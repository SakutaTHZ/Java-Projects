package OOP.oopvehicle;

public class motorbikes extends Vehicles {

    void getType() {
        System.out.println("Type is motorbike");
        
    }

    void getColor() {
        System.out.println("Motorbike Color Blue");
    }

    void getBrandName() {
        System.out.println("Motorbike Brandname Honda");
    }
    
    public static void main(String[] args) {
        motorbikes motorbike = new motorbikes();
        motorbike.getType();
        motorbike.getColor();
        motorbike.getBrandName();
    }
}
