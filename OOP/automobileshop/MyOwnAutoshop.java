package OOP.automobileshop;

import java.util.Random;

public class MyOwnAutoshop {
    public static void main(String[] args) {
        Random random = new Random();
        int speed = random.nextInt(300);
        double regularPrice = random.nextInt(100000);
        int length = random.nextInt(50);
        int manufaacturerDiscount1 = random.nextInt(30000);
        int manufaacturerDiscount2 = random.nextInt(30000);
        int colorCode = random.nextInt(5)+1;
        String color = colorCode==1 ? "red": colorCode==2 ? "black":colorCode==3 ? "blue": colorCode==4 ? "yellow":"white";

        System.out.println("Normal Car\n__________");
        Car car = new Car(speed, regularPrice, color);
        System.out.println("Sale Price - "+car.getSalePrice()+ "\n");

        System.out.println("Sedan\n__________");
        Sedan sedan = new Sedan(speed, regularPrice, color);
        System.out.println("Sale Price - "+sedan.getSalePrice(length)+ "\n");
        
        System.out.println("Ford\n__________");
        Ford ford= new Ford(speed, regularPrice, color);
        System.out.println("Ford Sale Price - " + ford.getSalePrice(manufaacturerDiscount1)+ "\n");
        
        System.out.println("ford\n__________");
        Ford ford2= new Ford(speed, regularPrice, color);
        System.out.println("Ford Sale Price - " + ford2.getSalePrice(manufaacturerDiscount2)+ "\n");
    }
}
