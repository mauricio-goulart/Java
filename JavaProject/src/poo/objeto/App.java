package poo.objeto;

public class App {

    public static void main(String[] args){

        Person person1 = new Person("Giovana", 19);

        person1.setName("Mauricio");

        person1.sayHello();

        Work work1 = new Work("Google", 5000); // Usando Record

        work1.showInfo();

    }
    
}
