
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
        
        System.out.printf("Voce é maior de idade, digite a sua idade: ");
        var result = scanner.nextInt();
        var isRight = (result != 0 && result > 18);  // > < =! >= <=

        System.out.println(isRight);

        //- Operadores aritmeticos

        var n1 = 2;
        var n2 = 4;
        System.out.println(Math.pow(n1, n2));
    }
}
