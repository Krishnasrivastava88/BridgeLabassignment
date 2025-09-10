class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);  // Calls parameterized constructor
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Circle Radius: " + radius);
    }
}
