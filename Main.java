import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam", 1000, 1, "01.01.2021", "Pracownik");
        Worker worker2 = new Worker("Bartek", 2000, 1, "02.02.2021", "Pracownik");
        Worker worker3 = new Worker("Czarek", 3000, 3, "03.03.2021", "Pracownik");
        Worker worker4 = new Worker("Damian", 4000, 4, "04.04.2021", "Pracownik");

        Worker worker5 = new Worker("Filip", 5000, 5, "05.05.2021", "Pracownik");
        Worker worker6 = new Worker("Grzegorz", 6000, 6, "05.05.2021", "Pracownik");
        Worker worker7 = new Worker("Halina", 7000, 7, "06.06.2021", "Pracownik");

        Worker worker8 = new Worker("Jan", 8000, 8, "07.07.2021", "Pracownik");

        Manager manager = new Manager("Eryk", 10000, 1, "05.05.2021", "Kierownik");
        Manager manager2 = new Manager("Igor", 11000, 10, "08.08.2021", "Kierownik");

        Manager manager3 = new Manager("Kamil", 12000, 1, "09.09.2021", "Kierownik");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(worker7);
        employees.add(worker8);

        employees.add(manager);
        employees.add(manager2);
        employees.add(manager3);

        // Suma pensji wszystkich pracowników + kierowników //
        double totalSalaryAllEmployees = employees.stream()
        .mapToDouble(Employee::getSalary)
        .sum();

        // Suma pensji wszystkich kierowników //
        double totalSalaryManagers = employees.stream()
                .filter(employee -> employee instanceof Manager)
                .mapToDouble(Employee::getSalary)
                .sum();

        // Suma pensji wszystkich pracowników //
        double totalSalaryWorkers = employees.stream()
                .filter(employee -> employee instanceof Worker)
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println("Suma pensji wszystkich pracowników + kierowników: " + totalSalaryAllEmployees + " PLN");
        System.out.println(" ");
        System.out.println("Suma pensji wszystkich kierowników: " + totalSalaryManagers + " PLN");
        System.out.println(" ");
        System.out.println("Suma pensji wszystkich pracowników: " + totalSalaryWorkers + " PLN");
        System.out.println(" ");

        // Wyszukiwanie pracowników o tym samym ID //
        for (Employee employee : employees) {
            long matchingIdCount = employees.stream()
                    .filter(e -> e.hashCode() == employee.hashCode())
                    .count();

            if (matchingIdCount > 1) {
                System.out.println(employee.getName() + " posiada ID który się powtarza z inną zatrudnioną osobą.");
                System.out.println(" ");
            }
        }
    }
}
