package poo.polimorfismo;

public abstract class Employee {

    private String code;
    private String name;
    private String addreString;
    private double salary;

    public Employee (String code, String name, String addreString, double salary){
        this.code = code;
        this.name = name;
        this.addreString = addreString;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddreString() {
        return addreString;
    }

    public void setAddreString(String addreString) {
        this.addreString = addreString;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
    
}
