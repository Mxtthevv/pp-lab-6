import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam", 1000, 1);
        Worker worker2 = new Worker("Bartek", 2000, 2);
        Worker worker3 = new Worker("Czarek", 3000, 3);
        Worker worker4 = new Worker("Damian", 4000, 4);

        Manager manager = new Manager("Eryk", 5000, 5);

        System.out.println("Pensja pracownika (nr1): " + worker1.getSalary());
        worker1.work();
        System.out.println(" ");

        System.out.println("Pensja pracownika (nr2): " + worker2.getSalary());
        worker2.work();
        System.out.println(" ");

        System.out.println("Pensja pracownika (nr3): " + worker3.getSalary());
        worker3.work();
        System.out.println(" ");

        System.out.println("Pensja pracownika (nr4): " + worker4.getSalary());
        worker4.work();
        System.out.println(" ");

        System.out.println("Pensja kierownika: " + manager.getSalary());
        manager.work();
        System.out.println(" ");
    }
}
