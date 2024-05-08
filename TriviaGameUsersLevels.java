/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameDevelopment;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 11/01/2020
 * @author Lina Fernanda Silva Z.
 * Objective: Create a trivia game where two players take turns answering 
 * five questions that the compiler reads from a text file. For each correct answer, 
 * the program will keep a tally of points each & display the winner at the end. 
 
 assignment: add the 50/50 option, phone, audience
 */
public class TriviaGameUsersLevels {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
       
    
    public static void main(String[] args)  throws FileNotFoundException {
        // Scanner to read file input

       ArrayList<Question> questions = new ArrayList<>();
       //WriteResults resultswwtbm = new WriteResults();
       int playerOnePoints = 0;
       int playerTwoPoints = 0;
       
       // Scanner to scan keyboard input
       //Scanner uscan = new Scanner(System.in);
       Scanner scan = new Scanner(System.in);

       //Find User in file:
       File usersFile = new File("C:\\Users\\lunaf\\OneDrive\\Documents\\2T - Game Development\\Trivia Game\\users.txt");
       
       //Finds the file FOR LEVEL 1 & creates object instances of each question and pass them into an ArrayList
       File file1 = new File("C:\\Users\\lunaf\\OneDrive\\Documents\\2T - Game Development\\Trivia Game with users and Levels\\questionsLevel1.txt");
       
       //LEVEL 2
       File file2 = new File("C:\\Users\\lunaf\\OneDrive\\Documents\\2T - Game Development\\Trivia Game with users and Levels\\questionsLevel2.txt");

       System.out.println("Please enter your name: ");
       String username = scan.nextLine();
       System.out.println("Username entered: " + username);
       try {
            //Scanner usc = new Scanner(System.in);
            
            Scanner scf = new Scanner(usersFile);
            Scanner sc1 = new Scanner(file1);
            Scanner sc2 = new Scanner(file2);
            int x = 0;
            while (scf.hasNextLine() ){ //&& scf.nextLine().equalsIgnoreCase(username)){
                
                //System.out.println("into the while");
                if (scf.nextLine().equalsIgnoreCase(username)){
                    x = 1;
                    System.out.println("************* Welcome to the Trivia Game " + username.toUpperCase() +" ************");
                    // while loop until file has line
                    while (sc1.hasNextLine()) {
                        // read the line
                        String question          = sc1.nextLine();
                        String firstAnswer       = sc1.nextLine();
                        String secondAnswer      = sc1.nextLine();
                        String thirdAnswer       = sc1.nextLine();
                        String fourthAnswer      = sc1.nextLine();
                        String fiftyfiftyOption  = sc1.nextLine();
                        String phoneOption       = sc1.nextLine();
                        String audienceOption    = sc1.nextLine();
                        String correctAnswer     = sc1.nextLine();
                        questions.add(
                                new Question(question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer,
                                             fiftyfiftyOption, phoneOption, audienceOption, correctAnswer));
                    }
                    sc1.close();
                    //Reading LEVEL 2 QUESTIONS
                    while (sc2.hasNextLine()) {
                        // read the line
                        String question          = sc2.nextLine();
                        String firstAnswer       = sc2.nextLine();
                        String secondAnswer      = sc2.nextLine();
                        String thirdAnswer       = sc2.nextLine();
                        String fourthAnswer      = sc2.nextLine();
                        String fiftyfiftyOption  = sc2.nextLine();
                        String phoneOption       = sc2.nextLine();
                        String audienceOption    = sc2.nextLine();
                        String correctAnswer     = sc2.nextLine();
                        questions.add(
                                new Question(question, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer,
                                             fiftyfiftyOption, phoneOption, audienceOption, correctAnswer));
                    }
                    sc2.close();
                    
                }
            }
            if (x != 1){
                    System.out.println("The username entered doesn't exist in the file Amigo(a) " + username.toUpperCase());
                }
            scf.close();
        } catch (FileNotFoundException e) {
           e.printStackTrace();
       }

       /**
       * This for loop alternates questions to each player. It let's the players 
       * know if they guessed correctly or not and track their points.
       */
       // Now variable i would indicate the level
       for (int i = 0; i < questions.size(); i++) {
           // Assign every other question to player one
           System.out.println("************************ LEVEL 1 ************************ \n");
           if (i < 5){//% 2 == 0) {
               System.out.println("Please answer the following question: \n");
               System.out.println(questions.get(i).toString());
               String answer = scan.next();
               if (answer.equalsIgnoreCase(questions.get(i).getCorrectAnswer())) {
                   playerOnePoints++;
                   System.out.println("You got it right! You have " + playerOnePoints + " point(s).\n");
                // 50-50 Option
                }else if(answer.equalsIgnoreCase("e")){
                   System.out.println(questions.get(i).getFiftyfiftyOption());
                   answer = scan.next();   
                   if (answer.equalsIgnoreCase(questions.get(i).getCorrectAnswer())) {
                        playerOnePoints++;
                        System.out.println("You got it right! You have " + playerOnePoints + " point(s).\n");
                   }else {
                       System.out.println("Sorry, that was incorrect! You have " + playerOnePoints + " point(s).\n");
                    }
                // End 50-50 Option
                // Call a friend Option
               }else if(answer.equalsIgnoreCase("f")){
                   System.out.println(questions.get(i).getPhoneOption());
                   answer = scan.next();
                   if (answer.equalsIgnoreCase(questions.get(i).getCorrectAnswer())){
                       playerOnePoints++;
                       System.out.println("You got it right! You have " + playerOnePoints + " point(s).\n");
                   }else{
                       System.out.println("Sorry, that was incorrect! You have " + playerOnePoints + " point(s).\n");
                   }
                //End Call a friend Option
                //Public poll
               }else if(answer.equalsIgnoreCase("g")){
                   System.out.println(questions.get(i).getAudienceOption());
                   answer = scan.next();
                   if (answer.equalsIgnoreCase(questions.get(i).getCorrectAnswer())){
                      playerOnePoints++;
                      System.out.println("You got it right! You have " + playerOnePoints + " point(s). \n");
                   }else{
                       System.out.println("Sorry, that was incorrect! You have "+ playerOnePoints + " point(s). \n");
                    }
                //End Public poll
               }else {
                   System.out.println("Sorry, that was incorrect! You have " + playerOnePoints + " point(s).\n");
               }
           //RESULTS LEVEL 1
           //System.out.println("*********** Level 1 Finished " + username.toUpperCase() + " Your Score was: " + playerOnePoints + " *********** \n");
           } else {
               System.out.println("************************ LEVEL 2 ************************* \n");
               System.out.println("Please answer the following question: \n");
               System.out.println(questions.get(i).toString());
               String answer = scan.next();
               if (answer.equalsIgnoreCase(questions.get(i).getCorrectAnswer())) {
                   playerTwoPoints++;
                   System.out.println("You got it right! You have " + playerTwoPoints + " point(s).\n");
               // 50-50 Option
                }else if(answer.equalsIgnoreCase("e")){
                   System.out.println(questions.get(i).getFiftyfiftyOption());
                   answer = scan.next();   
                   if (answer.equalsIgnoreCase(questions.get(i).getCorrectAnswer())) {
                        playerTwoPoints++;
                        System.out.println("You got it right! You have " + playerTwoPoints + " point(s).\n");
                   }else {
                       System.out.println("Sorry, that was incorrect! You have " + playerTwoPoints + " point(s).\n");
                    }
                // End 50-50 Option
                // Call a friend Option
               }else if(answer.equalsIgnoreCase("f")){
                   System.out.println(questions.get(i).getPhoneOption());
                   answer = scan.next();
                   if (answer.equalsIgnoreCase(questions.get(i).getCorrectAnswer())){
                       playerTwoPoints++;
                       System.out.println("You got it right! You have " + playerTwoPoints + " point(s).\n");
                   }else{
                       System.out.println("Sorry, that was incorrect! You have " + playerTwoPoints + " point(s).\n");
                   }
                //End Call a friend Option
                //Public poll
               }else if(answer.equalsIgnoreCase("g")){
                   System.out.println(questions.get(i).getAudienceOption());
                   answer = scan.next();
                   if (answer.equalsIgnoreCase(questions.get(i).getCorrectAnswer())){
                      playerTwoPoints++;
                      System.out.println("You got it right! You have " + playerTwoPoints + " point(s). \n");
                   }else{
                       System.out.println("Sorry, that was incorrect! You have "+ playerTwoPoints + " point(s). \n");
                    }
                //End Public poll
               }else {
                   System.out.println("Sorry, that was incorrect! You have " + playerTwoPoints + " point(s).\n");
               }
           }
       }

       //RESULTS
       System.out.println("***** Game Finished " + username.toUpperCase() +" *****\n" + "** Your Level 1 score was "+ playerOnePoints + " **\n" + "** Your Level 2 score was "+ playerTwoPoints + " ** \n****** See you nex time ******");
       
       
       // Decide who wins
      /* if (playerOnePoints > playerTwoPoints) {
           //resultswwtbm();
           //System.out.print("Player one wins!");
           System.out.println("Game Finished " + username.toUpperCase() + " See you nex time");
       }*else {
           System.out.print("Player two wins!");
       }*/
       
       //Writing results
       
    }
    
}

