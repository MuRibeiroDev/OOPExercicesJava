public class Employee {

    public static void main(String[] args) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String name;
    private String last_name;
    private double salary;


    public Employee(String name, String last_name, double salary) {
        this.name = name;
        this.last_name = last_name;
        this.salary = salary;
    }

    public double giveRaise() {
        setSalary(salary + salary * 0.1);
        return getSalary();
    }


}
