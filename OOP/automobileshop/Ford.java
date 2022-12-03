package OOP.automobileshop;

public class Ford extends Car{

    /* 
    } ◦int year;
    } ◦int manufacturerDiscount;
    } ◦Ford(speed,regularPrice,color,year,manufaacturerDiscount); //call super class constructor
    } ◦double getSalePrice(); //From the sale price computed from Carcclass, subtract the
    manufacturer Discount.
    */

    int year;
    int manufacturerDiscount;
    Ford(int speed,double regularPrice,String color){
        super(speed,regularPrice,color);
    }

    double getSalePrice(int manufaacturerDiscount){
        return (int) regularPrice - manufacturerDiscount;
    }
    
}
