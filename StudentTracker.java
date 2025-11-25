
 import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    else if (grade >= 80)
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

public class StudentTracker {
    static final String ToDoList = "tasks.txt";
  static ArrayList<String> tasks = new ArrayList<>();
  static Scanner input = new Scanner(System.in);
public static void main(String[] args) throws IOException {
    loadTask();

        System.out.println("Welcome, here you will be able to see your grade and what's your average letter Grade,");
        System.out.println("In the part below you answer the following question and once you filed it out you will be able to view your grade when you enter number \"9\"; \n");
    int choice;
    boolean running = true; 

    while(running){
      System.out.println("1) Add your First and Last Name");
      System.out.println("2) Add your age");
      System.out.println("3) Add your school Year");
      System.out.println("4) Add your Current Grade in AP Geography");
      System.out.println("5) Add your Current Grade in AP History");
      System.out.println("6) Add your Current Grade in Home Economics");
      System.out.println("7) Add your Current Grade in Gym");
      System.out.println("8) Undo Something ❌");
      System.out.println("9) View Your Grade");
      System.out.println("10) Exit");
      System.out.print(" Enter: ");

       choice = input.nextInt();
    
      

      switch(choice){
        case 1 -> addName(); // Done working on this
        case 2 -> addage(); // Done working on this
        case 3 -> addSchoolYear();// Done working on this
        case 4 -> addAPGeography(); // Done working on this
        case 5 -> addAPHistory();// Done working on this
        case 6 -> addEconomics(); // Done working on this
        case 7 -> addGym(); // Done working on this
        case 8 -> undoTask(); // Done working on this
        case 9 -> displayTasks(); // fix to show
        case 10 -> running = false; // This stops your code
        default -> System.out.println("Invalid choice. Try again.");  
      }
        
    } // end of while 
    System.out.println("Goodbye!");
    saveTaskToFile();
    input.close();
    
  }// main end


    // -------------- addTask();  --------------------
    static void addName() {
        input.nextLine();
        System.out.print("Enter First and Last Name:");
        String name = input.nextLine();
        System.out.println(" added ✅");
    }

    static void addage() {
        input.nextLine();
        System.out.print("Enter your Age: ");
        String age = input.nextLine();
        System.out.println(" added ✅");

    }

    static void addSchoolYear() {
        input.nextLine();
        System.out.print("Enter the School Year your are in:");
        String name = input.nextLine();
        System.out.println(" added ✅");
    }

    static void addAPGeography() {
        input.nextLine();
        System.out.print("Enter your Current Grade in AP Geography:");
        int GeographyGrade = input.nextInt();
        System.out.println(" added ✅");
    }

    static void addAPHistory() {
        input.nextLine();
        System.out.print("Enter your Current Grade in AP History: ");
        int HistoryGrade = input.nextInt();
        System.out.println(" added ✅");

    }

    static void addGym() {
        input.nextLine();
        System.out.print("Enter your Current Grade in Home Economics:");
        int EconomicsGrade = input.nextInt();
        System.out.println(" added ✅");
    }

    static void addEconomics() {
        input.nextLine();
        System.out.print("your Current Grade in Gym:");
        int GymGrade = input.nextInt();
        System.out.println(" added ✅");
    }


    String overallGrade;
    char letterGrade;

// ---------- removeTask(); --------------------
static void removeTask() {
  if (tasks.isEmpty()) {
    System.out.println("No tasks to remove");
    return;
  }
  displayTasks();

  System.out.println("Enter task number to remove: ");

  int index = getIntInput() - 1;

  if (index >= 0 && index < tasks.size()) {
    tasks.remove(index);
    System.out.println("TASK REMOVED 💨");
  } else {
    System.out.println("Invalid task Numbers sorry");
  }
}


// }
// ----------------- displayTasks(); ----------------------
static void displayTasks(){
  if(tasks.isEmpty()){
System.out.println("No tasks to display");
    return;
  }
  System.out.println("\n ----------Grade Tracker---------");
  for(int i = 0; i < tasks.size(); i++){
    System.out.println((i + 1) + ")" + tasks.get(i));
  }
  System.out.println("-----------------------------\n");
}

// -------------------- Undo Task -----------------------------------
  static void undoTask(){
    if(tasks.isEmpty()){
      System.out.println("No tasks to undo");
      return;
    }
    displayTasks();
    System.out.println("Enter task number to undo 🔄️");
    int index = getIntInput() - 1;
  
    if(index >= 0 && index < tasks.size()){
       String task = tasks.get(index); 
 
     task = task.replace("✅", "❌");

     if(!task.endsWith("❌")) task += "❌";
     tasks.set(index, task);
      System.out.println("Task marked as pending again");
    } 
    else {
      System.out.println("Invalid task number");
    }
  }

// ------------- loadTask () -----------------------------=
public static void loadTask() throws IOException{
  File file = new File(ToDoList);
  if(!file.exists())
  return;
    Scanner fileReader = new Scanner(file);
    while (fileReader.hasNextLine()) {
      tasks.add(fileReader.nextLine());
    }
    fileReader.close();
}

// -------------------------- saveTask () -----------------------------------
private static void saveTaskToFile() throws IOException{
    BufferedWriter writer = new BufferedWriter(new FileWriter(ToDoList));
    
    for (String task : tasks){
      writer.write(task ); 
      writer.newLine();  
    }
   System.out.println("Task saved ");
   writer.close();
}

// --------------------------- getIntInput ----------------------------------
static int getIntInput() {
    while (!input.hasNextInt()) {
      System.out.println("Please enter a number: ");
      input.next();
    }
    int num = input.nextInt();
    input.nextLine(); // This clears the new Line
    return num;
}

// ------------------capitalize-----------------------
static String capitalize(String str){
  if(str.isEmpty()) return str;
  return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
}

}// class end


