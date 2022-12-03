package OOP.automobileshop;

public class Truck extends Car{
    
    int weight;

    Truck(int speed, double regularPrice, String color,int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    double getSalePrice(int weight) {
        //Ifweight>2000,10%discount.Otherwise,20%discount.
        return weight>2000?regularPrice-(regularPrice*(10/100)): regularPrice-(regularPrice*(20/100));
    }
}
