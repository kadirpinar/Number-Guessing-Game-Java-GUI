
package guess;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Guess extends JFrame implements ActionListener{

    
       private JLabel jlbl = new JLabel();
       private JLabel jlbl1 = new JLabel();
       private JButton jbtn = new JButton();
       private JButton jbtn1 = new JButton();
       private JButton jbtn2 = new JButton();
       private JTextField txt = new JTextField();
       
       public Guess (){
       setLayout(new FlowLayout());
       jlbl = new JLabel("Enter your number");
       txt = new JTextField(5);
       jbtn = new JButton("Enter");
       jbtn.addActionListener(this);
       jlbl1 = new JLabel();
       jbtn1 =new JButton("Bigger");
        jbtn1.addActionListener(this);
       jbtn2 =new JButton("Smaller");
       jbtn2.addActionListener(this);
       add(jlbl);
       add(txt);
       add(jbtn);
       add(jlbl1);
       add(jbtn1);
       add(jbtn2);
       }
       int high=100;
       int low=0;
       int guess=50;
       @Override
       public void actionPerformed(ActionEvent a){
           jlbl1.setText("Computer guess:"+guess);
           int number=(int) Integer.parseInt(txt.getText());
           if(a.getSource()==jbtn1){
               if(guess<number){
            low=guess;
            guess=(high+low)/2;
            jlbl1.setText("Computer guess:"+guess);
               }
               else jlbl1.setText("You're cheating");
               }
           else if(a.getSource()==jbtn2){
               if(guess>number){
            high=guess;
            guess=(high+low)/2;
            jlbl1.setText("Computer guess:"+guess);
               }
               else jlbl1.setText("You're cheating");
               } 
           if(guess==number) jlbl1.setText("Computer has known the number");
           }
       
    public static void main(String[] args) {
        
     Guess g1 = new Guess();
     
     g1.setDefaultCloseOperation(EXIT_ON_CLOSE);
     g1.setSize(300,300);
     g1.setVisible(true);
     g1.setTitle("Guess Game");
        
        
    }
    
}
