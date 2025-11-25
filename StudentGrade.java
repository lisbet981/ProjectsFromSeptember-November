
import java.util.ArrayList;
import java.util.Scanner;

class student {
  private String name;
  private double grade;

  public student(String name, double grade){
    this.name = name;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public double getGrade() {
    return grade;
  }

  public String getLetterGrade() {
    if (grade >= 92)
      return "A";
    else if(grade >=79)
      return "B";
    else if (grade >= 74)
      return "C";
    else if (grade >= 65)
      return "D";
    else
      return "F";
  }

  public String toString() {
    return name + "-" + grade + "% (" + getLetterGrade() + ")";
  }
}

public class StudentGrade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome, here you will be able to see your grade and what's your average letter Grade;");
    System.out.print("What's your First and Last name?");
    String Student1name = input.nextLine();

    System.out.print("how old are you?");
    String Student1age = input.nextLine();

    System.out.print("what is your current grade in math? ");
    double Student1MathGrade = Double.parseDouble(input.nextLine());

    System.out.print("What is your current grade in Science?");
    double Student1ScienceGrade = Double.parseDouble(input.nextLine());

    System.out.print("What is your current grade in history?");
    double Student1HistoryGrade = Double.parseDouble(input.nextLine());

    System.out.println("Good job " + Student1name + " would you like to see your overall Grade?");
    String ViewGrade = input.nextLine();

    if (!ViewGrade.equals("yes")) {
      System.out.println("Okay Good bye, and great job");
    } else {
      double overall = (Student1MathGrade + Student1ScienceGrade + Student1HistoryGrade)/3;
      student s = new student(Student1name, overall);

      System.out.println("--------------- Grade Tracker ---------------");
      System.out.println("First & Last name: " + Student1name);
      System.out.println("Age: " + Student1age);
      System.out.println("Math: " + Student1MathGrade);
      System.out.println("Science: " + Student1ScienceGrade);
      System.out.println("History: " + Student1HistoryGrade);
      System.out.println("Overall Grade: " + overall + "% (" + s.getLetterGrade() + ")");
    }
    input.close();
  }
}
