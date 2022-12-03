package OOP.oopvehickle;

public class MyVehicles {
    public static void main(String[] args) {
        Vehicles obj = new cars();
        obj.getType();
        obj.getColor();
        obj.getBrandName();
        obj = new bikes();
        obj.getType();
        obj.getColor();
        obj.getBrandName();
        obj = new motorbikes();
        obj.getType();
        obj.getColor();
        obj.getBrandName();
    }
}
