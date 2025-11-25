package fundamentos.basico.operadores;

public class Logicos {
    
    public static void main(String[] args) {

        int age = 18;
        String car = "Parati";
        
        if (age == 18 && car.equals("Parati")) {System.out.println("ChadMaster");} // Operadores Logicos como && (and) || (or) != (diferente).

        boolean isRight = (age >= 18 || car.equals("Parati")); // Operador booleano ja sai verdadeiro.

        System.out.print(isRight);

    }
}
