import java.util.ArrayList;

class Course {
    String name;
    Professor prof;
    ArrayList<Student> students = new ArrayList<>();
    Course(String name) { this.name = name; }
    void assignProfessor(Professor p) { prof = p; }
    void enrollStudent(Student s) { students.add(s); }
    void showInfo() {
        System.out.println("Course: " + name);
        if (prof != null) System.out.println("Professor: " + prof.name);
        System.out.print("Students: ");
        for (Student s : students) System.out.print(s.name + " ");
        System.out.println();
    }
}

class Student {
    String name;
    Student(String name) { this.name = name; }
    void enrollCourse(Course c) { c.enrollStudent(this); }
}

class Professor {
    String name;
    Professor(String name) { this.name = name; }
    void assignCourse(Course c) { c.assignProfessor(this); }
}

public class Problem5 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Professor p1 = new Professor("Dr. Smith");
        Course c1 = new Course("Java Programming");

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        p1.assignCourse(c1);

        c1.showInfo();
    }
}
