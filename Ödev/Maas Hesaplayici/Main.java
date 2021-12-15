/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Ahmet", 2000, 45, 1985);
        Employee e2 = new Employee("Mehmet", 4900, 30, 2000);
        e1.printInfo();
        e2.printInfo();
    }
}