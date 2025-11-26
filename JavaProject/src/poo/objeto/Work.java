package poo.objeto;

public record Work(String company, int salary) {

    public void showInfo(){
        System.out.println("Company: " + company);
        System.out.println("Salary: " + salary);
    }

}
