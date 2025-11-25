/* 
            ✔️// User Input - User Input need a scanner 
            - Ask user the user for two numbers 

            // Operators - List??
            Need Addition 
            Need Suntration 
            Need Multiplication
            Need Division 

            // Add dialog 
            // confirm the equation that was seletction
            // Make sure the math is mathing (making sure it complies correctly) 

            // Print the results
        */ 
        

import java.util.*; 
public class SimpleCalculatorStarterCode{ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Welcome " + name );

       while (true){
        // The numbers being inputing
        System.out.print(" Enter the First number to your equation, *only numbers 0-10*:");
        double number1 = Double.parseDouble(input.nextLine());
        System.out.print(" Enter the Second number to your equation, *only numbers 0-10*:");
        double number2 = Double.parseDouble(input.nextLine());

        // input.nextLine();

        System.out.print("How would you like to solve these two numbers equation, (ex: +, -, *, /, sqrt )?");
       
        String operation = input.nextLine();

        double results;

        if (operation.equals("+")) {
            results = number1 + number2;
            System.out.println(results);  // So placing just "results" to the System.out.println will let the user only see what is the answer to their two numbers 

        } else if (operation.equals("-")) {
            results = number1 - number2;
            System.out.println(results);

        } else if (operation.equals("*")) {
            results = number1 * number2;
            System.out.println(results);

        }else if (operation.equals("/")) {
            if(number2 !=0){
                results = number1 / number2;
                System.out.println(results);
            } else{
                System.out.println("Division Equation Error, Please Try Again");
            } 
        } else if (operation.equals("sqrt")){ ///fix this
                if (number1 >= 0) {
                    results = Math.sqrt(number1);
                    System.out.println(results);
                } else {
                    System.out.println(" Equation Error, Please Try Again");
                } 

            } else {
                    System.out.println("Invalid operator");
                }
            
            System.out.println("Do you want to continue Calculating?(Yes/No)");
            String answer = input.nextLine().toUpperCase();
            if(!answer.equals("Yes")){
                System.out.println("Okay then, lets continue :D ");
                break;
            }
        }
        input.close();
            } 
       }
    

    
    
 
 