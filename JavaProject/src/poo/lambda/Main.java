package poo.lambda;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();


        /*
            - Usando Lambda
        printCat(
                () -> {
                    System.out.println("Meow");
                }

        )
       */

        printCat(() -> System.out.println("Meow"));

        printCat(cat); //Usando sem Lambda



    }

    static void printCat(Printable thing) {
        thing.print();
    }

}
