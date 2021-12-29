package application;

import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Student> studentSetA = new HashSet<>();
        Set<Student> studentSetB = new HashSet<>();
        Set<Student> studentSetC = new HashSet<>();

        System.out.print("How many students for course 'A'? ");
        int quantityA = scanner.nextInt();
        for (int i = 0; i < quantityA; i++) {
            studentSetA.add(new Student(scanner.nextInt()));
        }

        System.out.print("How many students for course 'B'? ");
        int quantityB = scanner.nextInt();
        for (int i = 0; i < quantityB; i++) {
            studentSetB.add(new Student(scanner.nextInt()));
        }

        System.out.print("How many students for course 'C'? ");
        int quantityC = scanner.nextInt();
        for (int i = 0; i < quantityC; i++) {
            studentSetC.add(new Student(scanner.nextInt()));
        }

        Set<Student> totalStudents = new HashSet<>(studentSetA);

        totalStudents.addAll(studentSetB);
        totalStudents.addAll(studentSetC);

        System.out.println("Total Students: " + totalStudents.size());

        scanner.close();
    }
}
