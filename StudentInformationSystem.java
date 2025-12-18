import java.util.Scanner;

class Student {
    String name;
    int age;
    double marks;

    double calculateAverage() {
        return marks;
    }

    void display() {
        System.out.println("--------------------------------");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
        System.out.println("--------------------------------");
    }
}

public class StudentInformationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        double totalMarks = 0;

        
        for (int i = 0; i < 3; i++) {
            students[i] = new Student();

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            students[i].name = sc.nextLine();

            System.out.print("Age: ");
            students[i].age = sc.nextInt();

            System.out.print("Marks: ");
            students[i].marks = sc.nextDouble();
            sc.nextLine(); 

            totalMarks += students[i].calculateAverage();
        }

        
        System.out.println("\n===== STUDENT INFORMATION =====");
        for (Student s : students) {
            s.display();
        }

    
        double average = totalMarks / 3;
        System.out.println("\nAverage Marks of 3 Students: " + average);

        sc.close();
    }
}
