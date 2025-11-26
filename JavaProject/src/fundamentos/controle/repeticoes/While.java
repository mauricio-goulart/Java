package fundamentos.controle.repeticoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class While {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("\nDigite nomes ou 'sair'");

        while (true) {

            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("sair")) break;
            if (name.isBlank()) continue;

            names.add(name);

            
        }

        System.out.println("\n--- Lista de nomes ---");

        names.forEach(System.out::println);

    }
    
}
