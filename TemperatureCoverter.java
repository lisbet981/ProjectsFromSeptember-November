// ● NAME: Lisbet Bautista 
// ● DATE: Sep 28, 11:59 PM
// ● VERSION: v1
// ● SOURCES USED: // google and chagpt * because It told me that I have to place a lowercase in my results if else statment 
//and the error that I had was placing a lowercase instead of an uppercase 😒
// ● COMMENTS / NOTES: for what I'm using my Celsius, Fahrenheit, and Kelvin and brackests to not get confused 

import java.util.Scanner;

public class TemperatureCoverter {
    public static void main (String[] args){

      int CelsiusNumber1 = 32; // this is what we will be subtracting to the UsersNumber for *this is for Celsius
      double CelsiusSecondNumber = 5.0/9; //This is the number that we will be dividing after the UserNumber and the CelsiusNumber1 finished subtraction *this is for Celsius 
      double FahrenheitNumber1 = 1.8; //this is what we will be multiplying to the UsersNumber if the choose Fahrenheit
      int FahrenheitSecondNumber = 32; // this will be the number that you will be adding to after the (UserNumber and FahrenheitNumber1) + FahrenheitSecondNumber
      double KelvinLastNumber = 273.15; //After solving fahrenheit to Celsius, then I will add KelvinLastNumber to the results of those two and then I will get my kelvin

     Scanner input = new Scanner(System.in);

     System.out.print("Hey there, today you will be able to type in a number and convert it into ONE of these formulas of your choice Ex; Celsius(°C), Fahrenheit(°F), and Kelvin(K), okay now lets get started  \n ");
   
     while (true) {
      
  
     System.out.println("Enter The Number that You Would Like to Convert; ");
     String UserNumber = input.nextLine(); //this is for the out.println
     double userNumber = Double.parseDouble(UserNumber); // this is for the equation
     
     System.out.println("In what formula would you want to convert " + UserNumber +" into (Celsius, Fahrenheit, and Kelvin,);");
     String formula = input.nextLine();

      double results;
      double Solution;

     if (formula.equals("Celsius")){                         
        results = (userNumber - CelsiusNumber1) * CelsiusSecondNumber; //number to celsius //
        System.out.println(results + " °C");

     }  else if( formula.equals("Fahrenheit")){
      if(userNumber> 0){
        results = (userNumber * FahrenheitNumber1) + FahrenheitSecondNumber;      //number to Fahrenheit //
      System.out.println(results + " °F");
      }else{
        System.out.println("You Can NOT Go below 0 in FAHRENHEIT!!!!!! Please try again;");
          break;
      }
    } else if( formula.equals("Kelvin")){
      results = (userNumber - FahrenheitSecondNumber ) * CelsiusSecondNumber;    // it has to subtract (number -32) * 5/9 to = A Celsius Number then + 273.15 -> to become a Kelvin Number
     Solution = results + KelvinLastNumber;
      System.out.println("Your Current Weather " + Solution + " K");
    }
   
   
      }
        input.close();
   
   //both of these are for the "public class" and "public static"
    }
}
