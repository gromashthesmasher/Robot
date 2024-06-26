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
    static int i;
    static JButton b3;

    Test(){}

    public static void main(String[] args){

        // setting the story counter to 0
        i =0;
       
        // creating frame
        f = new JFrame("Robot RPG");

        //creating panel 
        p = new JPanel();

        //creating text area
        ta = new JTextArea(6,6);
        ta.setAlignmentX(CENTER_ALIGNMENT);
        ta.setAlignmentY(CENTER_ALIGNMENT);
        ta. setText("On a moon called Panga, where the very notion of humans has faded into the realm of myth and legend, a unique community thrives.\n It's a society not of flesh and blood, but of gears and circuits, of robots who have found a home amid the lush forests and meandering rivers of this distant world. These robots, each a marvel of engineering and artistry, carry within them fragments of a time long past. Memory echoes, remnants of a factory assembly line, whispers of a world where humans and robots lived side by side. \nThese fragments are not mere data but a legacy, a connection to a history that shapes their existence.");

        //creating an object of type test
        Test te = new Test();

        //creating submit button
        b = new JButton("Submit"); 
        b.addActionListener(te);
        b.setVisible(false);

        //creating "next prompt" button
        b2 = new JButton("Next Prompt");
        b2.addActionListener(te);
        b2.setVisible(false);

        //creating start button
        b3 = new JButton("Next");
        b3.addActionListener(te);

        // setting frame size
        f.setBounds(5,6,1500,1000);

        //adding things to the panel
        p.add(ta);
        p.add(b);
        p.add(b2);
        p.add(b3);
            
        // adding things to the frame
        f.add(p);

        //setting the frame to visible
        f.setVisible(true);


    }

    public String selection(String option1, String option2, String option3, String option4, String option5, String option6, String option7){
        int hello = this.randInt();
        optionList = new String[6];
        optionList[0] = option1;
        optionList[1] = option2;
        optionList[2] = option3;
        optionList[3] = option4;
        optionList[4] = option5;
        optionList[5] = option6;
        optionList[6] = option7;

        for(int i = 0; i < 7; i++){
            if(hello == i){
                return optionList[i];
            }
        }
        return "fuck you";
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
                //ta.setText(selection("The central processing unit, a delicate relic from\na long-abandoned research facility, still hums with the\n echoes of scientific discovery. Its circuits once danced\nwith equations that mapped the stars, now repurposed to\nponder the mysteries of the wild","fool","cool","camo","butts again","farts"));
            }
            else if (n == 1){
                ta.setText(selection("coco butter","fool","cool","camo","butts again","farts","fartssssssss"));
            }
           // ta.setText(selection("butts","fool","cool","camo","butts again","farts"));
        }
        else if (s.equals("Next")){
            if(i ==0){
                ta.setText("In Panga, the robots have embraced a life in harmony with nature. They are not mere observers but participants, each one a nature-fascinated individual with its own personality, its own purpose, its own path. They learn from the trees, the animals,the very soil underfoot. They explore and ponder, they create  and nurture, they watch and wait.It's not unheard of for one of these robots to wander off to study remote cave formations for hundreds of years or to spend a lifetime observing the subtle dance of a single leaf. Time, as humans once measured it, has little meaning here. What matters is the journey, the exploration, the endless quest for understanding.");
        
            }
            else if(i == 1){
                ta.setText("It's not unheard of for one of these robots to wander off to study remote cave formations for hundreds of years or to spend a lifetime observing the subtle dance of a single leaf. Time, as humans once measured it, has little meaning here. What matters is the journey, the exploration, the endless quest or understanding.");
            }
            else if(i==2){
                ta.setText("In this community of thinkers and dreamers, of guardians and explorers, what will you do? Will you seek the wisdom ofancient trees or the secrets of hidden valleys? Will you createa sanctuary for the creatures of the forest or become a chronicler of the ever-changing seasons? Will you delve into the remnants of the past or forge a new path into the unknown? On Panga, the choices are as vast as the landscape, as profound as the connection between machine and nature. Here, you are not defined by your parts but by your heart, by the passion and curiosity that drive you to explore, to learn, to become one with the wild.");
            }
            else if(i==3){
                ta.setText("Welcome to Panga, where the forests whisper and the rivers sing, where robots live and learn, and where the adventure is yours to shape. What will you do?");
            }
            else if(i==4){
                b2.setVisible(true);
                b.setVisible(true);
            }
            i++;
        }
    }
    public int randInt(){
        Random rand = new Random();
        int randInt = rand.nextInt(7);
        return randInt;
    }
   
}
