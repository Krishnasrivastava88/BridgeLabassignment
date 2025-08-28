import java.util.Scanner;

class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] salary = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name of employee " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter basic salary of " + names[i] + ": ");
            salary[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            double hra = 0.2 * salary[i];   
            double da = 0.1 * salary[i];   
            double netSalary = salary[i] + hra + da;

            if (netSalary > 50000) {
                netSalary -= netSalary * 0.1;
            }

            System.out.println("\n--- Salary Slip for " + names[i] + " ---");
            System.out.println("Basic Salary: " + salary[i]);
            System.out.println("HRA (20%): " + hra);
            System.out.println("DA (10%): " + da);
            System.out.println("Net Salary: " + netSalary);
        }

        sc.close();
    }
}
