import java.util.Scanner;

public class MainPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creates the scanner

        System.out.println("Enter your name:"); //Asks users to input their name
        String name = scanner.nextLine(); //Allows users to input their name on the following line

        System.out.println("Enter your age:"); //Asks users to input their age
        int age = scanner.nextInt(); //Declares age variable, allows users to input their age

        System.out.println("Enter your Grade Point Average (GPA):"); // Tells users to input GPA
        double gpa = scanner.nextDouble(); //Declares gpa variable, allows user input for GPA


        System.out.println("Montgomery County Public Schools - Student Progress Report");
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("GPA: " + gpa);

        







    }
}
