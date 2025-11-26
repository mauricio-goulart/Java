package fundamentos.variaveis;

import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Idade: ");

            var age = sc.nextInt(); // Usando o Scanner para entrada de dados.
            var name = "Mauricio";

            String name2 = "Giovana";
            int age2 = 19;  // Atribuindo tipando sem  o "var".

            System.out.printf("Nome 1º = %s\t | Idade 1º = %s\n", name, age);
            System.out.printf("Nome 2º = %s\t | Idade 2º = %s\n", name2, age2);
        }

    }

}
