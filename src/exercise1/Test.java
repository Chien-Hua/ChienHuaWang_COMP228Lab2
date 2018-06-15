package exercise1;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Test {
    Question[] questions;

    public Test(Question[] questions) {
        this.questions = questions;
    }

    public void startTest(){
        for (Question q: questions){
            simulateQuestion(q);
        }
    }

    //display question
    public static void simulateQuestion(Question q) {
        String answer = JOptionPane.showInputDialog(q.getQuestionString());
        inputAnswer(q,answer);
    }

    //input and process answer
    public static void inputAnswer(Question question, String answer) {
        Boolean correctAnwer = checkAnswer(question,answer);
       String message = generateMessage(correctAnwer);
       JOptionPane.showMessageDialog(null, message);
    }

    // true if the anwer is correct; false if the anwer is incoorect.
    public static Boolean checkAnswer(Question question, String answer) {
        if (answer.equalsIgnoreCase(question.getAnswer())) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String generateMessage(boolean status) {
        Random randomObject = new Random();
        String result ="";
        if (status) {

            switch (randomObject.nextInt(4)) {

                case 0:
                    result = "Nice work!";
                    break;
                case 1:
                    result = "Excellent!";
                break;
                case 2:
                    result = "Good";
                break;
                case 3:
                    result = "Keep up the good work";
                break;
            }
            return result;
        } else {

            switch (randomObject.nextInt(4)) {

                case 0:
                    result = "No. Keep trying.";
                    break;
                case 1:
                    result = "No. Please try again";
                break;
                case 2:
                    result ="Wrong. Try once more";
                break;
                case 3:
                    result = "Don't give up!";
                break;
            }
            return result;
        }

    }

}

