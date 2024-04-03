public class EmployeeTest {

    public static void main(String[] args) {
        Employee murillo = new Employee("Murillo", "Ribeiro", 2800.0);
        Employee rodinei = new Employee("Rodinei", "Silva", 1800.0);

        System.out.println("Employee: " + murillo.getName());
        System.out.println("Employee: " + rodinei.getName());

        System.out.println("");

        System.out.println(murillo.getName() + " " + murillo.getSalary());
        System.out.println(rodinei.getName() + " " + rodinei.getSalary());

        murillo.giveRaise();
        rodinei.giveRaise();

        System.out.println(murillo.getName() + " " + murillo.getSalary());
        System.out.println(rodinei.getName() + " " + rodinei.getSalary());

    }


}
