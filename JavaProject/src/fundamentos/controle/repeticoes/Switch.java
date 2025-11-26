package fundamentos.controle.repeticoes;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)){

            int i = 0;

            i = sc.nextInt();
   
            switch (i) {
                case 1 -> System.out.println("Number 1");

                case 2 -> System.out.println("Number 2");

                default -> throw new AssertionError();
            }
        
            /* - Forma mais tradicional.

            switch (i) {
                case 1:
                    
                    System.out.println("Number 1");
                    break;

                case 2:
                    System.out.println("Number 2");
                    break;

                default:
                    throw new AssertionError();
            }

            */

        }
        
    }

}
