package p5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

class StudentData{
    String id;
    String name;
    int age;

    StudentData(String id,String name, int age){
        setId(id);
        setAge(age);
        setName(name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Student {
    public static void main(String[] args) {  
        
        ArrayList<StudentData> arraylist = new ArrayList(); 
        LinkedList<StudentData> linklist = new LinkedList();
        generateStudents(arraylist,linklist);
        showArrayList(arraylist);
        showLinkedList(linklist);
    }

    private static void showLinkedList(LinkedList<StudentData> linklist) {
        System.out.println("\n_____\nArrayList");
        for (StudentData al : linklist) {
            if(al.getAge()>20){
                System.out.println(al.getName() + " is "+ al.getAge() +" years old" );
            }
        }
    }

    private static void showArrayList( ArrayList<StudentData> arraylist) {
        // for specific data
        System.out.println("\n_____\nLinkedList");
        for (StudentData al : arraylist) {
            if(al.getAge()<20){
                System.out.println(al.getName() + " is "+ al.getAge() +" years old" );
            }
        }
    }

    private static void generateStudents(ArrayList<StudentData> arraylist, LinkedList<StudentData> linklist) {
        Random r = new Random();
        for (int j = 0; j < 10; j++) {
            StudentData s = new StudentData(""+j, "Mr " +j, r.nextInt(40));
            linklist.add(s);
            arraylist.add(s);
        }
        showGeneratedResults(arraylist);
    }

    private static void showGeneratedResults(ArrayList<StudentData> arraylist) {
        for (StudentData studentData : arraylist) {
            System.out.println("Id - "+ studentData.getId() + " | Name - "+studentData.getName()+" | Age - "+ studentData.getAge());
        }
    }
}
