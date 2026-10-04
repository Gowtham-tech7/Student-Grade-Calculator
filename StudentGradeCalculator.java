import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter mark for Subject 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter mark for Subject 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter mark for Subject 3: ");
        int mark3 = scanner.nextInt();

        System.out.print("Enter mark for Subject 4: ");
        int mark4 = scanner.nextInt();

        System.out.print("Enter mark for Subject 5: ");
        int mark5 = scanner.nextInt();

        System.out.print("Enter mark for Subject 6: ");
        int mark6 = scanner.nextInt();

        if (mark1 < 0 || mark1 > 100 ||
    mark2 < 0 || mark2 > 100 ||
    mark3 < 0 || mark3 > 100 ||
    mark4 < 0 || mark4 > 100 ||
    mark5 < 0 || mark5 > 100 ||
    mark6 < 0 || mark6 > 100) {

    System.out.println("Invalid marks. Marks must be between 0 and 100.");
    scanner.close();
    return;
}

        int total = mark1 + mark2 + mark3 + mark4 + mark5 + mark6;
        double average = total / 6.0;
        String grade;

if (average >= 90) {
    grade = "A";
} else if (average >= 80) {
    grade = "B";
} else if (average >= 70) {
    grade = "C";
} else if (average >= 60) {
    grade = "D";
} else {
    grade = "F";
}

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        if (average >= 50) {
    System.out.println("Result: PASS");
} else {
    System.out.println("Result: FAIL");
}

        scanner.close();
    }
}