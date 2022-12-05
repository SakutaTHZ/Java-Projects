package OOP.automobileshop;

public class Sedan extends Car {
    //Iflength>20feet,5%discount,Otherwise,10%discount.

    int length;
    double result;

    Sedan(int speed,double regularPrice,String color) {
        super(speed,regularPrice,color);
    }
    
    double getSalePrice(int length){
        System.out.println("calculating result for size "+ length );
        double result = length>20 ? super.regularPrice-super.regularPrice*5/100: super.regularPrice-super.regularPrice*10/100; 
        System.out.println(( length>20 ? length+">20 5% discount ": length+"<20 10% discount ")+result);
        return result;
    }
}
