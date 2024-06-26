import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Test extends JFrame implements ActionListener{

    static JFrame f;
    static JPanel p;
    static JTextArea ta;
    static JButton b;
    static JButton b2;
    static Scene st;

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
        f.setBounds(3,4,600,600);

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
        }
        else if (s.equals("Next Prompt")) {
 
            st = new Scene();
            st.print("mango","Aladin","steam-punk","recreational","rescipt","hello");
        }
    }
}
