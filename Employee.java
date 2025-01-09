public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John Doe", "Manager", "john.doe@example.com", "123-456-7890", 60000, 30);
        employees[1] = new Employee("Jane Smith", "Developer", "jane.smith@example.com", "234-567-8901", 55000, 28);
        employees[2] = new Employee("Alice Johnson", "Designer", "alice.johnson@example.com", "345-678-9012", 50000, 25);
        employees[3] = new Employee("Bob Brown", "Analyst", "bob.brown@example.com", "456-789-0123", 52000, 32);
        employees[4] = new Employee("Charlie White", "Tester", "charlie.white@example.com", "567-890-1234", 48000, 27);

        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
