package poo.objeto;

public class Person {

    private String name;
    private int age;
    
    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getters and Setters
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    //Comportaments

    public void sayHello(){
        System.out.printf("Hello, my name is %s and I am %s years old.\n", this.name, this.age);
    }

}
