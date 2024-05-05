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
        Worker worker4 = new Worker("Damian", 4000, 5, "04.04.2021", "Pracownik");

        Worker worker5 = new Worker("Filip", 5000, 5, "05.05.2021", "Pracownik");
        Worker worker6 = new Worker("Grzegorz", 6000, 5, "05.05.2021", "Pracownik");
        Worker worker7 = new Worker("Halina", 7000, 6, "06.06.2021", "Pracownik");

        Manager manager = new Manager("Eryk", 10000, 7, "05.05.2021", "Kierownik");
        Manager manager2 = new Manager("Igor", 11000, 8, "08.08.2021", "Kierownik");

        System.out.println(worker5.getName() + " has code: " + worker5.hashCode());
        System.out.println(worker6.getName() + " has code: " + worker6.hashCode());
        System.out.println(worker7.getName() + " has code: " + worker7.hashCode());
        System.out.println(manager2.getName() + " has code: " + manager2.hashCode());

        System.out.println(worker6.getName() + " równa się z pracownikiem nr 5: " + worker6.equals(worker5));
        System.out.println(worker6.getName() + " równa się z pracownikiem nr 6: " + worker6.equals(worker6));
        System.out.println(worker6.getName() + " równa się z kierownikiem nr 2: " + worker6.equals(manager2));
    }
}
