/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameDevelopment;

/**
 *
 * @author Lina Fernanda Silva Z.
 */

public class Question {
   private String question;
   private String firstAnswer;
   private String secondAnswer;
   private String thirdAnswer;
   private String fourthAnswer;
   private String fiftyfiftyOption;
   private String phoneOption;
   private String audienceOption;
   private String correctAnswer;

   /**
   *
   * @param question
   * @param firstAnswer
   * @param secondAnswer
   * @param thirdAnswer
   * @param fourthAnswer
   * @param fiftyfiftyOption
   * @param phoneOption
   * @param audienceOption
   * @param correctAnswer
   * 
   */
   public Question(String question, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer,
           String fiftyfiftyOption, String phoneOption, String audienceOption, String correctAnswer) {
       super(); //superclass method(s)
       this.question = question;
       this.firstAnswer = firstAnswer;
       this.secondAnswer = secondAnswer;
       this.thirdAnswer = thirdAnswer;
       this.fourthAnswer = fourthAnswer;
       this.fiftyfiftyOption = fiftyfiftyOption;
       this.phoneOption = phoneOption;
       this.audienceOption = audienceOption;
       this.correctAnswer = correctAnswer;
   }

   // getter and setter
   public String getQuestion() {
       return question;
   }

   public void setQuestion(String question) {
       this.question = question;
   }

   public String getFirstAnswer() {
       return firstAnswer;
   }

   public void setFirstAnswer(String firstAnswer) {
       this.firstAnswer = firstAnswer;
   }

   public String getSecondAnswer() {
       return secondAnswer;
   }

   public void setSecondAnswer(String secondAnswer) {
       this.secondAnswer = secondAnswer;
   }

   public String getThirdAnswer() {
       return thirdAnswer;
   }

   public void setThirdAnswer(String thirdAnswer) {
       this.thirdAnswer = thirdAnswer;
   }

   public String getFourthAnswer() {
       return fourthAnswer;
   }

   public void setFourthAnswer(String fourthAnswer) {
       this.fourthAnswer = fourthAnswer;
   }
   
   public String getFiftyfiftyOption(){
       return fiftyfiftyOption;
   }
   
   public void setFiftyfiftyOption(String fiftyfiftyOption){
       this.fiftyfiftyOption = fiftyfiftyOption;
   }
   
   public String getPhoneOption(){
       return phoneOption;
   }
   
   public void setPhoneOption(String phoneOption){
       this.phoneOption = phoneOption;
   }
   
   public String getAudienceOption(){
       return audienceOption;
   }
   
   public void setAudienceOption(String audienceOption){
       this.audienceOption = audienceOption;
   }

   public String getCorrectAnswer() {
       return correctAnswer;
   }

   public void setCorrectAnswer(String correctAnswer) {
       this.correctAnswer = correctAnswer;
   }

   // toString method for print the question
   @Override
   public String toString() {
       return question + "\n" + firstAnswer + "\n" + secondAnswer + "\n" + thirdAnswer + "\n" + fourthAnswer + 
               "\n or if you want some help please dial: \n e) 50-50 Option \n f) Call a friend \n g) Public poll" ;
   }
   
}
