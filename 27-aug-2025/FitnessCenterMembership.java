import java.util.Scanner;

class FitnessCenterMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean centerOpen = true;

        while (centerOpen) {
            System.out.println("\n--- Fitness Center Membership Registration ---");

            do {
                System.out.print("Enter number of members to register: ");
                int n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    System.out.println("\nRegistering Member " + i);

                    System.out.println("Select Membership Type:");
                    System.out.println("1. Monthly (₹1000)");
                    System.out.println("2. Quarterly (₹2500)");
                    System.out.println("3. Yearly (₹9000)");
                    System.out.print("Enter choice (1/2/3): ");
                    int choice = sc.nextInt();

                    int fee = 0;
                    switch (choice) {
                        case 1:
                            fee = 1000;
                            break;
                        case 2:
                            fee = 2500;
                            break;
                        case 3:
                            fee = 9000;
