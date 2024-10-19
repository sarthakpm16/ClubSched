import java.util.Scanner;

public class MainPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creates the scanner

        System.out.println("Enter your name:"); //Asks users to input their name
        String name = scanner.nextLine(); //Allows users to input their name on the following line

        System.out.println("Enter your MCPS ID Number (#):");
        String idnum = scanner.nextLine(); //allows users to input their MCPS ID

        System.out.println("Enter your age:"); //Asks users to input their age
        int age = scanner.nextInt(); //Declares age variable, allows users to input their age

        System.out.println("Enter your Letter Grades:"); // Tells users to input their letter grades one by one

        scanner.nextLine(); //will help move to the next line after scanning for integer

        System.out.println("Enter Period 1 Letter Grade:");
        String pd1 = scanner.nextLine(); 
        
        System.out.println("Enter Period 2 Letter Grade:");
        String pd2 = scanner.nextLine(); 
        
        System.out.println("Enter Period 3 Letter Grade:");
        String pd3 = scanner.nextLine(); 
        
        
        System.out.println("Enter Period 4 Letter Grade:");
        String pd4 = scanner.nextLine(); 
        
        System.out.println("Enter Period 5 Letter Grade:");
        String pd5 = scanner.nextLine(); 
        
        System.out.println("Enter Period 6 Letter Grade:");
        String pd6 = scanner.nextLine(); 
        
        System.out.println("Enter Period 7 Letter Grade:");
        String pd7 = scanner.nextLine();


        // the part below calls the letterNumberConversion method and turns the strings "pd_" into a number represented by a "num_"
        double num1 = letterNumberConversion(pd1); 
        double num2 = letterNumberConversion(pd2);         
        double num3 = letterNumberConversion(pd3);
        double num4 = letterNumberConversion(pd4);
        double num5 = letterNumberConversion(pd5);
        double num6 = letterNumberConversion(pd6);
        double num7 = letterNumberConversion(pd7);

        double gpa = (num1 + num2 + num3 + num4 + num5 + num6 + num7) / 7; // calculates gpa by taking average grade of all 7 classes


        System.out.println("Montgomery County Public Schools - Student Progress Report");
        System.out.println("MCPS ID # " + idnum);
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("GPA: " + gpa);
       
        scanner.close();
    }


    public static double letterNumberConversion(String grade) {

        if(grade.equals("A")) { //converts the letter grade into its respective number
            return 4.0;
           } else if(grade.equals("B")) {
               return 3.0;
           } else if(grade.equals("C")) {
               return 2.0;
           } else if(grade.equals("D")) {
                return 1.0;
           } else if(grade.equals("E") || grade.equals("F")) {
                return 0.0;    
           } else {
                System.out.println("Welp! It looks like you didn't enter a valid letter grade; We'll assume your grade was a 0.0 then :( ");   
                return 0.0; // if user doesn't input a letter A-F 

    }
        
    }

}
