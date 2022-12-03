package OOP.oopvehickle;

public class bikes extends Vehicles {

    void getType() {
        System.out.println("Type is Bike");
        
    }

    void getColor() {
        System.out.println("Bike Color Unknown");
    }

    void getBrandName() {
        System.out.println("Bike Brandname Unknown");
    }
    
    public static void main(String[] args) {
        bikes bike = new bikes();
        bike.getType();
        bike.getColor();
        bike.getBrandName();
    }
}
