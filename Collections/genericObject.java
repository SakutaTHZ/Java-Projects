package Collections;

class generic<T>{
    T obj;
    
    public generic(T obj){
        this.obj = obj;
    }

    public void print(){
        System.out.println("Before - "+obj+" |"+obj.getClass().getSimpleName());
        obj = (T) obj.toString();
        System.out.println("After - "+obj+" |"+obj.getClass().getSimpleName());
    }
}

public class genericObject {
    public static void main(String[] args) {
        generic<Integer> g = new generic(10);
        g.print();
    }
}
