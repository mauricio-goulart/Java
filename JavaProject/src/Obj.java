import java.util.Scanner;

public class Obj {
    

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        var male = new Person();
        male.setName("Mauricio");
        male.setAge(20);

        var female = new Person();
        female.setName("Giovana");
        female.setAge(19);

        System.out.printf("Female name: %s\n", female.getName());

        


    }
}
