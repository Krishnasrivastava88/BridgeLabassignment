class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String project;

    Manager(int employeeID, String department, double salary, String project) {
        super(employeeID, department, salary);
        this.project = project;
    }

    void display() {
        System.out.println("ID: " + employeeID + ", Dept: " + department +
                           ", Salary: " + getSalary() + ", Project: " + project);
    }
}
