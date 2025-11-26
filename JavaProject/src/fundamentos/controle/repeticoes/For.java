package fundamentos.controle.repeticoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class For {
    
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>(List.of("Mauricio"));

        for (int i = 0; i < 3; i++){

            System.out.print("Digite um nome: ");
            String name = sc.nextLine();
            names.add(name);
        }  
        
        System.out.println("---- Lista de Nomes ----");

        for (String n : names ){

            System.out.println(n);
        }

        sc.close();

    }

}

    




