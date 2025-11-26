package fundamentos.controle.repeticoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("\nDigite nomes ou 'sair'");

        String name; 

        do {
            name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("sair")) break;
            if (name.isBlank()) continue;

            names.add(name);

        } while (true);

        System.out.println("\n--- Lista de nomes ---");
        names.forEach(System.out::println);
    }
}
