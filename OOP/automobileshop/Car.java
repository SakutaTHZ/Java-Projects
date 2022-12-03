package OOP.automobileshop;

public class Car {
    int speed;
    double regularPrice;
    String color;
    double salePrice;

    Car(int speed,double regularPrice,String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        System.out.println("Car speed - "+ speed+"\nRegularPrice - "+regularPrice+"\nColor - "+color);
    };

    
    double getSalePrice(){
        return this.regularPrice;
    };
}
