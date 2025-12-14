package StudentGrading;

public class Main {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92, 88};
        Student student = new Student("Alice", grades);
        GradeCalculator calculator = new GradeCalculator();

        double average = student.getAverageGrade();
        char letter = calculator.calculateLetter(average);

        System.out.println("Student: " + student.getName());
        System.out.println("Average: " + average);
        System.out.println("Grade: " + letter);
    }
}
