package Collections;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Map.Entry;

class product{
    String pdCode;
    String pdName;
    Double pdPrice;
    product(String pdCode,String pdName,double pdPrice){
        setPdCode(pdCode);
        setPdName(pdName);
        setPdPrice(pdPrice);
    }
    public String getPdCode() {
        return pdCode;
    }

    public void setPdCode(String pdCode) {
        this.pdCode = pdCode;
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    public Double getPdPrice() {
        return pdPrice;
    }

    public void setPdPrice(Double pdPrice) {
        this.pdPrice = pdPrice;
    }
}

public class Products {
    public static void main(String[] args) {
        HashMap<String,product> map = new HashMap<String,product>();
        generateStudents(map);
        showHashmap(map);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nSearch Item - ");
            String search = scanner.nextLine();
            if(map.get(search)==null){
                System.out.println("No data found");
            }else{
                System.out.println("Search result | Name - "+ map.get(search).pdName + " | Price - " + Math.round(map.get(search).pdPrice));
            }
        }
    }

    private static void showHashmap(HashMap<String,product> map) {
        for (Entry<String, product> e : map.entrySet()){
            System.out.println("Key: "+ e.getKey() + "| Code : " + e.getValue().pdCode + "| Name : " + e.getValue().pdName + "| Price : " + Math.round(e.getValue().pdPrice)) ;
        }
    }

    private static void generateStudents(HashMap<String,product> map) {
        Random r = new Random();
        for (int j = 0; j < 10; j++) {
            product p = new product("p"+j, "Product "+j, r.nextDouble(1000));
            map.put(p.pdCode+"", p);
        }
    }
}
