package src;

public class Animal {
    String name;
    int age;
    String color;

    void sound(){
        if (name == "dog"){
            System.out.println("au-au-au");
        } else {
            System.out.println("Non Identified");
        }        
    };

}