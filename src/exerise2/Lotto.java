package exerise2;
import java.util.Random;
import javax.swing.*;

public class Lotto {

    int sum = 0; // set default value
    Random random = new Random(); // declare new object

     static int[] numbers = new int[3];
    int input; // store user's input

    //  constructor
    public Lotto() {
        JFrame frame = new JFrame("Random Number");

        numbers[0] = random.nextInt(9) + 1;
        numbers[1] = random.nextInt(9) + 1;
        numbers[2] = random.nextInt(9) + 1;
        //  usually, constructor are used to create an object (set values)

        sum = numbers[0] + numbers[1] + numbers[2];

        input = Integer.parseInt(JOptionPane.showInputDialog ("Please Enter a number: "));

        for (int i = 0; i < 4; i++) {
            if (input >= 3 && input <= 27) {
                if (input == sum) {
                    JOptionPane.showMessageDialog(frame, String.format("This is the right number. The number is %d", sum ),
                            "Correct Answer", JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else {
                    input = Integer.parseInt(JOptionPane.showInputDialog ("This is the wrong number. Please Enter a number: "));
                }
            } else {
                input = Integer.parseInt(JOptionPane.showInputDialog ("Please re-enter a number between 3 and 27:"));
            }

        }
        JOptionPane.showMessageDialog(frame,
                String.format("Number 1: %d Number 2: %d Number 3: %d%nThe sum is %d",numbers[0],numbers[1],numbers[2],sum));
    }
    //  end constructor


    public static void main(String[] args) { // Driver
            Lotto lotto = new Lotto();
            //  next time, please put code in the appropriate methods. A constructor is not used for all of the code/logic
    }
}

