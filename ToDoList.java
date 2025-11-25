import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListProject6 {
 
  static final String ToDoList = "tasks.txt";
  static ArrayList<String> tasks = new ArrayList<>();
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) throws IOException {

    loadTask();
    
    System.out.println("Welcome, Here You Will Be Able To Create Your Personal To-Do List📋✔️ ");
    System.out.print("What Type of \"To-Do List\" would you like to create (Work, Chores, or Task)?");
    String UsersTaskName = input.nextLine();

    int choice;
    boolean running = true; 

    while(running){
       System.out.println("------------To Do List Menu------------");
      System.out.println("1) Add Tasks " );
      System.out.println("2) Remove Task");
      System.out.println("3) Mark Tasks as done ✅");
      System.out.println("4) Undo Task ❌");
      System.out.println("5) View Tasks");
      System.out.println("6) Exit");
      System.out.print(" Enter: ");

       choice = input.nextInt();
    
      
      switch(choice){

        case 1 -> addTask(); // Done working on this
        case 2 -> removeTask(); // Done working on this
        case 3 -> markTaskAsDone();// Done working on this
        case 4 -> undoTask(); // Done working on this
        case 5 -> displayTasks(); // fix to show
        case 6 -> running = false; // This stops your code
        default -> System.out.println("Invalid choice. Try again.");  
      }
        
    } // end of while 
    System.out.println("Goodbye!");
    saveTaskToFile();
    input.close();
    
  }// main end


    // -------------- addTask();  --------------------
    static void addTask() {
      input.nextLine();
      System.out.print("Enter Task Description:");
     String desc = input.nextLine();

      System.out.print("\nEnter Priority(High/Medium/Low):");
      String priority = input.nextLine().trim();

      while (!priority.equalsIgnoreCase("High") && !priority.equalsIgnoreCase("Medium")
          && !priority.equalsIgnoreCase("Low")) {
        System.out.println("Invalid priority. Enter High, Medium, or Low:");
        priority = input.nextLine().trim();
      }
        String task = desc + "[Priority:" + priority + "]";
      tasks.add(task);
      System.out.println("Task added ✅");
  }

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

// ----------------- displayTasks(); ----------------------
static void displayTasks(){
  if(tasks.isEmpty()){
System.out.println("No tasks to display");
    return;
  }
  System.out.println("\n ----------Task---------");
  for(int i = 0; i < tasks.size(); i++){
    System.out.println((i + 1) + ")" + tasks.get(i));
  }
  System.out.println("-----------------------------\n");
}

// ------------------- MARK TASK AS DONE----------------------------------------
static void markTaskAsDone(){
  if(tasks.isEmpty()){
    System.out.println("No Task to Mark ");
    return;
  }
  displayTasks();
  System.out.println("Enter task number to mark as done:");
  int index = getIntInput() - 1;
  
  if(index >=0 && index < tasks.size()){

    String task = tasks.get(index); 
    
    task = task.replace("❌", "✅");
    
   if(!task.endsWith("✅")) task += "✅";
    
    tasks.set(index, task);
    
    System.out.println("Task marked as done 👍");
  } else {
    System.out.println("Invalid task number");
  }
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
