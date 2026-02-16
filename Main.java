class Employee {
    int id;
    String role;

    public Employee(int Empid, String Design) {
        this.id = Empid;
        this.role = Design;
    }

    void display() {
        System.out.println(id + " " + role);
    }
}

class Driver extends Employee {
    public Driver() {
        super(123, "Driver");
    }

    void work() {
        System.out.println("Drive");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Driver();
        emp.display();
    }
}
