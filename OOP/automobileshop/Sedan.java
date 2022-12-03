package OOP.automobileshop;

public class Sedan extends Car {

    int length;
    double result;

    Sedan(int speed,double regularPrice,String color) {
        super(speed,regularPrice,color);
    }
    
    double getSalePrice(int length){
        System.out.println("calculating result for size "+ length );
        double result = length>20 ? super.regularPrice-super.regularPrice*5/100: super.regularPrice-super.regularPrice*10/100; 
        //Iflength>20feet,5%discount,Otherwise,10%discount.
        System.out.println(result);
        return result;
    }
}
