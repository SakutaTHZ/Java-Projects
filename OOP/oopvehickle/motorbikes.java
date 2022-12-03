package OOP.oopvehickle;

public class motorbikes extends Vehicles {

    void getType() {
        System.out.println("Type is motorbike");
        
    }

    void getColor() {
        System.out.println("Motorbike Color Unknown");
    }

    void getBrandName() {
        System.out.println("Motorbike Brandname Unknown");
    }
    
    public static void main(String[] args) {
        motorbikes motorbike = new motorbikes();
        motorbike.getType();
        motorbike.getColor();
        motorbike.getBrandName();
    }
}
