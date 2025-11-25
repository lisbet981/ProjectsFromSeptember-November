import java.util.Scanner;

public class cakeparty {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);  
        System.out.print("how many cake box do you have?");
        int cakebox = input.nextInt();
        
        System.out.print("how many slices do you want each guest to have?");
        int slice = input.nextInt();

        System.out.print("how many guest do you have?");
        int guest = input.nextInt();

        // check the equation 
        int results;
        int amountPerGuest;
        int remander;
        
        //. if the actually have cake boxes 
        if(cakebox > 0){
            results = cakebox * slice;
            System.out.println("The amount of cakes you have " + results);

            amountPerGuest = results / guest; 
            System.out.println("The amount of cakes per Guest " + amountPerGuest);

            remander = results - (guest * amountPerGuest); 
            System.out.println("The remainder " + remander);

        }
 }
   
}