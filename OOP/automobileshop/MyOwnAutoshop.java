package OOP.automobileshop;

public class MyOwnAutoshop {
    public static void main(String[] args) {
        Car car = new Car(130, 30000, "red");
        System.out.println("Sale Price - "+car.getSalePrice()+ "\n");

        Sedan sedan = new Sedan(130, 10000, "blue");
        System.out.println("Sale Price - "+sedan.getSalePrice(20)+ "\n");
        
        Ford ford= new Ford(200, 30000, "red");
        System.out.println("Ford Sale Price - " + ford.getSalePrice(10)+ "\n");
        
        Ford ford2= new Ford(240, 50000, "grey");
        System.out.println("Ford Sale Price - " + ford2.getSalePrice(2000)+ "\n");
    }
}
