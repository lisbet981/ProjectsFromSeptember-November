import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    //my generators 
static final String UPPERCASE_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
static final String LOWECASE_ALPHABET = "abcdefghijklmnopqrstuvwxz";
static final String NUMBERS = "0123456789";
static final String SPECIALCHARACTERS = "!@#$%^&*()";


public static void main(String[] args){
Scanner input = new Scanner(System.in);
SecureRandom random = new SecureRandom();

System.out.println("You have come to the right place to Create a 👩‍💻Password!\n");

while(true){ //my loop//
System.out.print("How long would you like your Password to be?");
int Userslength = Integer.parseInt(input.nextLine());

System.out.print("How many Uppercase's would you want?");
int numUppercase = Integer.parseInt(input.nextLine());

System.out.print("How many lowercase's would you want?");
int numLowercase = Integer.parseInt(input.nextLine());

System.out.print("How many Numbers would you want?");
int numbers =Integer.parseInt(input.nextLine());

System.out.print("How many special characters whould you want?");
int specialCharacters = Integer.parseInt(input.nextLine());

int totalSelection = numUppercase + numLowercase + numbers + specialCharacters;

//this is just to tell the user that if something does not match this will appear to them 
if(totalSelection != Userslength){
    System.out.println("\n I'm sorry there seems to be an error your selection of Characters " + totalSelection + " does not match");
 
    //Would the user like to continue//
    System.out.println("Would you like to try again? (yes/no)");
     String tryAgain = input.nextLine().trim().toLowerCase();

     if(!tryAgain.equals("yes")){
        System.out.println("okay then, Thanks for coming to the one and only best Password Maker 😁! GOODBYE!!!!!!");
      break;
    } 
    System.out.println();
    continue;
}
    
//this is what's setting up the base on the users input 
StringBuilder password = new StringBuilder();

for (int i = 0; i < numUppercase; i++){
password.append(UPPERCASE_ALPHABET.charAt(random.nextInt(UPPERCASE_ALPHABET.length())));
}
for (int i = 0; i < numLowercase; i++){
password.append(LOWECASE_ALPHABET.charAt(random.nextInt(LOWECASE_ALPHABET.length())));
}
for(int i = 0; i < numbers; i++){
    password.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
}
for (int i=0; i < specialCharacters; i++){
    password.append(SPECIALCHARACTERS.charAt(random.nextInt(SPECIALCHARACTERS.length())));
}
    String CompleteChars = password.toString();
    StringBuilder finalpassword = new StringBuilder();

    while (CompleteChars.length() > 0) {
        int index = random.nextInt(CompleteChars.length());
        finalpassword.append(CompleteChars.charAt(index));

        //this is what's going to make sure that theres no passwords repeating
        CompleteChars = CompleteChars.substring(0, index) + CompleteChars.substring(index + 1);
    }
    //This Is The Final Output To See The Password
        System.out.println("\n Your New Password is: " + finalpassword.toString());
 
        //Here We're Asking If the User would like to Continue AGAIN
        System.out.println("Would you like to try again? (yes/no)");
     String tryAgain = input.nextLine().trim().toLowerCase();

     if(!tryAgain.equals("yes")){
        System.out.println("okay then, Thanks for coming to the one and only best Password Maker 😁! GOODBYE!!!!!!");
      break;
    } 
    System.out.println();
}
input.close();

} //don't touch
}// don't touch



