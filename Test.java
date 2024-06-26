import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import Scene;
import java.util.Arrays;
import java.util.ArrayList;

public class Test extends JFrame implements ActionListener{

    static JFrame f;
    static JPanel p;
    static JTextArea ta;
    static JButton b;
    static JButton b2;
    static String journal;
    static String[] optionList;
    static int n;

    Test(){}

    public static void main(String[] args){

        // creating frame
        f = new JFrame("Robot RPG");

        //creating panel 
        p = new JPanel();

        //creating text area
        ta = new JTextArea(3,4);
        ta. setText("You are a sentient Robot...\n\nkeeping track of your immortal life in this Solo Journaling RPG of Life and Decay. \n\nStarting with Act 1 you take a Journey trough your Lifecycle, your Robot Dm here *waves* will be Rolling 1D6 for you to help you create the Story of your Robot life.\n\n Hopefully, at the end, you can look back and be happy.\n\nAct 1 is your Creation, Act 2 is your Life learning, Act 3 is the Death of your Creator and Act 4 is the far future time after Mankind went extinct.\n\nYou create the Story, what is your purpose? What have you learned? What caused your creator to die? Why did Mankind go extinct?\n\n Clocks: As you progress, time is running out. Everytime the Time Passes, fill in a blank space in the clock. \nIf you filled all blanks of the clock, you progress to the next Cycle of your Life. \n\nFor every Event that is not the Time Passes you get 1XP in this Lifecycle. If you get 5XP you get a +1 to your first Dice roll in the next Lifecycle. \nIf you roll the same Event more than three times it becomes a Time Passes Event. Mark your rolls in the checkboxes. \n\nFor the Conclusion, you sum up the overall XP and with every 5XP you unlock a new final Question, answer them one after another. \n\nCan you get all 4 Conclusion Questions unlocked? \n\n...What may your story be?\n\nClick \"Next Prompt\" to see your first prompt.");

        //creating an object of type test
        Test te = new Test();

        //creating submit button
        b = new JButton("Submit"); 
        b.addActionListener(te);

        //creating "next prompt" button
        b2 = new JButton("Next Prompt");
        b2.addActionListener(te);

        // setting frame size
        f.setBounds(5,6,1500,1000);

        //adding things to the panel
        p.add(ta);
        p.add(b);
        p.add(b2);
            
        // adding things to the frame
        f.add(p);

        //setting the frame to visible
        f.setVisible(true);


    }
     // if the button is pressed
    public void actionPerformed(ActionEvent e)
    {
        //saving and displaying user text
        String s = e.getActionCommand();
        if (s.equals("Submit")) {
            ta.setText("don't eat my butt");
            n++;
        }
        else if (s.equals("Next Prompt")) {
            if(n ==0){
                ta.setText(selection("butts","fool","cool","camo","butts again","farts"));
            }
            else if (n == 1){
                ta.setText(selection("butts","fool","cool","camo","butts again","farts"));
            }
           // ta.setText(selection("butts","fool","cool","camo","butts again","farts"));
        }
    }
    public int randInt(){
        Random rand = new Random();
        int randInt = rand.nextInt(6);
        return randInt;
    }
    public String selection(String option1, String option2, String option3, String option4, String option5, String option6){
        int hello = this.randInt();
        optionList = new String[6];
        optionList[0] = option1;
        optionList[1] = option2;
        optionList[2] = option3;
        optionList[3] = option4;
        optionList[4] = option5;
        optionList[5] = option6;

        for(int i = 0; i < 6; i++){
            if(hello == i){
                return optionList[i];
            }
        }
        return "fuck you";
    }
}
