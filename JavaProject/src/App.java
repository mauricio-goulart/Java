
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //- Tipo de dados 
        var scanner = new Scanner(System.in);

        System.out.println("Hello, World!\nQual o seu nome: ");
        var name = scanner.next();
        System.out.println("Olá " + name);

        System.out.println("Qual sua idade");
        int age = scanner.nextInt();

        System.out.printf("Name: %s\nAge: %s\n", name,age);

        //- Operadores logicos
        
        System.out.println("Voce é maior de idade, digite a sua idade: ");
        var result = scanner.nextInt();
        var isRight = (result != 0 && result > 18);  // > < =! >= <=

        System.out.println(isRight);

        //- Operadores aritmeticos

        var n1 = 2;
        var n2 = 4;
        System.out.println(Math.pow(n1, n2));

        //- Condicional if else

        System.out.println("Qual seu nome: ");
        var name1 = scanner.next();

        if (name1.equals("mauricio")) {

            System.out.println("Great nome");

        }else {

            System.out.println("Fail nome");
        }

        //- Condicional Switch case

        var caso = scanner.nextInt();

        switch (caso) {
            case 1:
                System.out.println("Numero 1");
                break;

            case 2:
                System.out.println("Numero 2");
                break;

            default:
                System.out.println("Error");
        }

        //- Estrutura de repetição for

        for (var i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //- Estrutura de repetição while; do while

        var name2 = "";
        while (!name.equalsIgnoreCase("exit")) {

            System.out.println("Digite EXIT: ");
            name2 = scanner.next();

        }



    }
}
