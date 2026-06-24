package mainapp;
import java.util.*;
import school.Student;

public class MainApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name of Student: ");
        String name = sc.nextLine();

        System.out.print("\nEnter his/her First Grade: ");
        int g1 = sc.nextInt();

        System.out.print("\nEnter his/her Second Grade: ");
        int g2 = sc.nextInt();

        System.out.print("\nEnter his/her Third Grade: ");
        int g3 = sc.nextInt();

        System.out.println("=== STUDENT INFO ===");

        Student s = new Student(name, g1, g2, g3);
        System.out.println("NAME OF STUDENT: "+ name);
        System.out.println(s.getAverage());
        System.out.println(s.getRemarks());
        System.out.println();
        sc.close();
    }
}
