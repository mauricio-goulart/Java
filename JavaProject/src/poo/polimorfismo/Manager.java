package poo.polimorfismo;

public class Manager extends Employee {

    private String login;
    private double comission;

    public Manager(String code, String name, String addreString, double salary, String login, double comission) {
        super(code, name, addreString, salary);
        this.login = login;
        this.comission = comission;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    @Override
    public void work(){
        System.out.println(getLogin());
    }
}
