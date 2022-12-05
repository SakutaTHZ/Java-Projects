package OOP.oopvehicle;

public class MyVehicles {
    public static void main(String[] args) {
        Vehicles obj = new cars();
        System.out.println("Car\n__________");
        obj.getType();
        obj.getColor();
        obj.getBrandName();
        obj = new bikes();
        System.out.println("\nBike\n__________");
        obj.getType();
        obj.getColor();
        obj.getBrandName();
        obj = new motorbikes();
        System.out.println("\nMotor Bike\n__________");
        obj.getType();
        obj.getColor();
        obj.getBrandName();
    }
}
