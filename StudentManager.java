import java.util.*;

public class StudentManager {
    private Map<Integer, Student> students = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // flush
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Student s = new Student(id, name, age, dept);
        students.put(id, s);
        System.out.println("Student added successfully.\n");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        for (Student s : students.values()) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (!students.containsKey(id)) {
            System.out.println("Student not found.\n");
            return;
        }

        Student s = students.get(id);
        System.out.print("Enter new Name: ");
        s.setName(sc.nextLine());
        System.out.print("Enter new Age: ");
        s.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter new Department: ");
        s.setDepartment(sc.nextLine());

        System.out.println("Student updated.\n");
    }

    public void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (students.remove(id) != null) {
            System.out.println("Student deleted.\n");
        } else {
            System.out.println("Student not found.\n");
        }
    }
}
