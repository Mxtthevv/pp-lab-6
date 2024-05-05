import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam", 1000, 1, "01.01.2021", "Pracownik");
        Worker worker2 = new Worker("Bartek", 2000, 2, "02.02.2021", "Pracownik");
        Worker worker3 = new Worker("Czarek", 3000, 3, "03.03.2021", "Pracownik");
        Worker worker4 = new Worker("Damian", 4000, 4, "04.04.2021", "Pracownik");

        Manager manager = new Manager("Eryk", 5000, 5, "05.05.2021", "Kierownik");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + 
                                " (ID: " + employee.hashCode() +
                                ", Position: " + employee.getPosition() +
                                ", Hire date: " + employee.getHireDate() +
                                ", Salary: " + employee.getSalary() + ")");
            System.out.println(" ");
        }
    }
}
