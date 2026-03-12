import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SimpleQuizGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\n Welcome To our Question Game, here we will test your knowledge in the most bezar things that you might have known.You will be Scored on each question you get if you get a question WRONG you will get a negitive 1, ex:-1, if you get the question Correct then you gain a point, ex:+1 . Now that you understand how this works, Lets Get STARTED)\n ");
    System.out.print("Enter a Character/Nickname you would like to be called:");
    String Usersname = input.nextLine();

    while (true) {
      // The user has the option to choose what level of questions they want to answer, Which depending on their response and what they input, will lead them to the question//
        System.out.println("Okay " + Usersname +", What level do you want to try, (Easy, Mideocer, Hard)? ");
        String leadtothelevel = input.nextLine().trim().toLowerCase();


      //The ArrayList varables on top 
        ArrayList<String> question = new ArrayList<>();
        ArrayList<String[]> usersOptions = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();
        ArrayList<String> level =new ArrayList<>();
            
      /*------------------------------------------------------------------------------------------------------*/
      // this is question pop up one by one, because they choose/typed "EASY"//
              
      question.add("Bees have been known to fly higher than which famous mountain?");
      usersOptions.add(new String[] { "A)k2", "B)Mount Everest", "C)Makalu" });
      answer.add("B");// Mount Everest
      level.add("Easy");

      question.add("How do you say \"hello\" in Japanese?");
      usersOptions.add(new String[] { "A)Kawaii", "B)Kon'nichiwa", "C)Sugoi", "D)Suteki" });
      answer.add("B");// Kon'nichiwa
      level.add("Easy");

      question.add("What is the largest planet in our solar system?");
      usersOptions.add(new String[] { "A)Earth", "B)Jupiter", "C)Mercury", "D) Mars" });
      answer.add("B");// Jupiter
      level.add("Easy");

      question.add("Who painted the Mona Lisa? ");
      usersOptions.add(new String[] { "AFrida Kahlo", "B)Leonardo da Vinci", "C)Johannes Vermeer", "D)Pierre-Auguste" });
      answer.add("B"); // "Leonardo da Vinci"
      level.add("Easy");

      question.add("Which part of your body contains a bone called the ‘Funny Bone’?");
      usersOptions.add(new String[] { "A) Elbow", "B)Knee", "C)Foot", "D) hip" });
      answer.add("A"); // "Elbow"
      level.add("Easy");

      /*------------------------------------------------------------------------------------------------------*/
        //  These questions will pop up one by one, because the user typed in "MIDEOCER" 
          
      question.add("In what city does the law prohibit eating fried chicken with a fork? ");
      usersOptions.add(new String[] { "A) Gainesville", "B) Lakewood", "C) New York", "D) Tokyo" });
      answer.add("A"); // Gainesville
      level.add("Mideocer");

      question.add("What animal hibernates the longest?");
      usersOptions.add(new String[] { "A) Dinosaur", "B) Polar bear", "C) The snail", "D) Groundhogs" });
      answer.add("C"); // The snail
      level.add("Mideocer");

      question.add("What is the largest mammal on Earth now?");
      usersOptions.add(new String[] { "A)Shark", "B)Dinosaur", "C)winner dog", "D)Blue whale" });
      answer.add("D");// Blue whale
      level.add("Mideocer");

      question.add("What is a group of cats called?");
      usersOptions.add(new String[] { "A)A clowder", "B) Drip bomb", "C)A gaggle", "D) A cuddle" });
      answer.add("A");// A clowder
      level.add("Mideocer");

      question.add("Where would you find the world’s smallest street, Ebenezer Place?");
      usersOptions.add(new String[] { "A)Brazil", "B)Scotland", "C)Italy", "D)Japan" });
      answer.add("B");// Scotland
      level.add("Mideocer");

      question.add("Which animal is infamous for laughing?");
      usersOptions.add(new String[] { "A)Elephant", "B)Bat ", "C)Hyena", "D)huskies" });
      answer.add("C");// Hyena
      level.add("Mideocer");
      /*------------------------------------------------------------------------------------------------------*/
        //These questions will pop up one by one, because the user typed in "HARD"

        question.add("What product did ancient Romans use as toothpaste?");
        usersOptions.add(new String[] { "A) icream ", "B) Shampo", "C) Urine", "D) Soap" });
        answer.add("C");// Urine
        level.add("Hard");

        question.add("The longest hiccup attack in history lasted for how many Seconds?");
        usersOptions.add(new String[] { "A) 68 Seconds", "B) 50 Seconds", "C) 1 Minute", "D) 30 Seconds" });
        answer.add("A"); // 68 Seconds
        level.add("Hard");

        question.add("having the extream st of fear for being suck in a full room of people is known as what type of anxiety?");
        usersOptions.add(new String[] { "A) Social anxiety disorder", "B)OCD", "C) Panic disorder", "D) Emetophobia" });
        answer.add("D");// Emetophobia
        level.add("Hard");

        question.add("How many hearts does an octopus have?");
        usersOptions.add(new String[] { "A) 4", "B)3", "C) 2", "D) 8" });
        answer.add("B");// 3
        level.add("Hard");

        question.add("What animal has the most teeth?");
        usersOptions.add(new String[] { "A) HUMANS", "B) Shark", "C) snail", "D)Gorila" });
        answer.add("C");// snail
        level.add("Hard");

        question.add("This marsupial is the only animal in the world to poop in cubes?");
        usersOptions.add(new String[] { "A) Wombat.", "B)Capybara", "C) Cats", "D)A Lama" });
        answer.add("A");// The wombat
        level.add("Hard");

      /*------------------------------------------------------------------------------------------------------*/
        //here I will be combining all my data into one List for a Synchronized shuffling
        ArrayList<Integer> indices = new ArrayList<>();
        for (int j = 0; j< question.size(); j++){
          indices.add(j);
        }

        Collections.shuffle(indices);
        ArrayList<String> shuffledquestions = new ArrayList<>();
        ArrayList<String[]> shuffledOptions = new ArrayList<>();
        ArrayList<String> shuffledanswer = new ArrayList<>();
        ArrayList<String> shuffledlevel = new ArrayList<>();

        for(int j : indices){
          shuffledquestions.add(question.get(j));
          shuffledOptions.add(usersOptions.get(j));
          shuffledanswer.add(answer.get(j));
          shuffledlevel.add(level.get(j));
        }  
      
        question = shuffledquestions;
        usersOptions = shuffledOptions;
        answer = shuffledanswer;
        level = shuffledlevel;

        // -------------------------------------------------------------------------

        //The Score int//
        int score = 0;
        int i;
        int questionNumber = 1;

      for(i = 0; i < question.size(); i++){
        if(!level.get(i).trim().equalsIgnoreCase(leadtothelevel)) continue;    //okay so I'm using ".trim()" so that it can ignore the little mistakes that there could be if the user places a lower case or an upper case it WON'T MATTER

         System.out.println("Question " + questionNumber + ": " + question.get(i));
          questionNumber++;

        for (String opt : usersOptions.get(i)){
          System.out.println(opt); 
        }  

          //THEIR OPTIONS OF ANSWERS
        System.out.println(("Which one would you like to place as your answer, A / B / C / D: "));
        String userAnswer = input.nextLine().trim().toLowerCase();  

          //if they respond to the question correct then they will gain a point
        if(userAnswer.equals(answer.get(i).toLowerCase())){
          score++;
           System.out.println("🎊 YAY you have 1 point 🎊\n");
        }
        else {
          score--;
          System.out.println("Sorry you have -1 points ☹️");
         }
      }

      // Difined the Score 
      if(score < 5){
          System.out.println("Sorry try again next time 🥲, you finished with " + score + " Points");
      } 
      else {
         System.out.println("🎊🎊🎊🎊 Congratulation you ended off on a strong note with " + score + " Points") ;
      }

     //  they will be able to try again but can choose what level they would like to answer the question and will just start all over
      System.out.println("Would you like to try a different level? (yes/no)");
       String tryAgain = input.nextLine().trim().toLowerCase();

      if(!tryAgain.equals("yes")){
        System.out.println("okay then, Thanks for coming and TESTING your Knowlege on the most Random questions on earth😁! GOODBYE!!!!!!");
         break;
      } 
            System.out.println();
            continue;
   } 
    input.close();

  } //D.N.T. main

}// D.N.T class