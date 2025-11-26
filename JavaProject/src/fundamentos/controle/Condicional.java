package fundamentos.controle;

import java.util.Scanner;

public class Condicional {

    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)){

            String name = sc.next();
            int age = sc.nextInt();

            if (name.equalsIgnoreCase("G") && age == 19){

                System.out.println("Congrats");
            }else {

                System.out.println("Sorry, you are too old");
            }

        }

    }

}
