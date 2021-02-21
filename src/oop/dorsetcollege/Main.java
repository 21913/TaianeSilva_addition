package oop.dorsetcollege;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

      /*  JOptionPane.showMessageDialog( null, "This is an information message " , "Information Message",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog( null, "This is an error " , "Error Dialog",
                JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog( null, "This is a Warning Message " , "Warning message",
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog( null, "This is a question message " , "Question Message",
                JOptionPane.QUESTION_MESSAGE);
*/

// another way to do the confirmation dialog. Confirm an action as 0 is yes, 1 is no;

       int result = JOptionPane.showConfirmDialog( null, " Are you ready to start? " , "Confirm Dialog",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

       System.out.println("result is " + result);

        String firstNumber = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        //to enter with number > 0
        if (firstNumber == null || secondNumber == null || firstNumber.length() == 0 || secondNumber.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Number must be > 0 ", "Error Dialog",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }


        //
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        JOptionPane.showMessageDialog( null, "The sun is " + sum, "Sun of Two Integers",
                JOptionPane.PLAIN_MESSAGE);


    }
}
