
import java.awt.*; //how things are places Layout
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame; //Basic window things(close,minimize,maximize)
import javax.swing.JLabel;//output line of text images
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class test extends JFrame {
  // private JLabel item1;
   private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
   private boolean winner=false;
   public test(){
	   super("Test");//title to the window
	   
	   //JPanel board = new JPanel();
	   setLayout(new GridLayout(3,3));//default  layout
	   //item1 =new JLabel("Item one");
	   //add(item1);
	   button1 = new JButton("");
	   add(button1);
	   button1.setBackground(Color.CYAN);
	   button2 = new JButton("");
	   button2.setBackground(Color.CYAN);
	   add(button2);
	   button3 = new JButton("");
	   button3.setBackground(Color.CYAN);
	   add(button3);
	   button4 = new JButton("");
	   button4.setBackground(Color.CYAN);
	   add(button4);
	   button5 = new JButton("");
	   button5.setBackground(Color.CYAN);
	   add(button5);
	   button6 = new JButton("");
	   button6.setBackground(Color.CYAN);
	   add(button6);
	   button7 = new JButton("");
	   button7.setBackground(Color.CYAN);
	   add(button7);
	   button8 = new JButton("");
	   button8.setBackground(Color.CYAN);
	   add(button8);
	   button9 = new JButton("");
	   button9.setBackground(Color.CYAN);
	   add(button9);
	   
	   HandlerClass handler = new HandlerClass(); //create oblect to actionlist
	   button1.addActionListener(handler);
	   button2.addActionListener(handler);
	   button3.addActionListener(handler);
	   button4.addActionListener(handler);
	   button5.addActionListener(handler);
	   button6.addActionListener(handler);
	   button7.addActionListener(handler);
	   button8.addActionListener(handler);
	   button9.addActionListener(handler);
   }
  
   public int count=0;
   String Disp;
   private class HandlerClass implements ActionListener{
	    public void actionPerformed(ActionEvent event){// this method is the one which shows what will happen when a button is clicked
	    	count++;
	    	if(count%2==1 ){
	    		Disp="1";
	    	}
	    	else{Disp="2";
	    	}
	    	if(event.getSource()== button1){
	    		button1.setText(Disp);
	    		button1.setFont(new Font("Arial", Font.PLAIN, 40));
	    		if(count%2==0){button1.setBackground(Color.GREEN);}
	    		else{button1.setBackground(Color.MAGENTA);}
	    		button1.setEnabled(false);//set button is pressed(only one press)
	    	}
	    	if(event.getSource()== button2){
	    		button2.setText(Disp);
	    		button2.setFont(new Font("Arial", Font.PLAIN, 40));
	    		if(count%2==0){button2.setBackground(Color.GREEN);}
	    		else{button2.setBackground(Color.MAGENTA);}
	    		button2.setEnabled(false);
	    	}
	    	if(event.getSource()== button3){
	    		button3.setText(Disp);
	    		button3.setFont(new Font("Arial", Font.PLAIN, 40));
	    		if(count%2==0){button3.setBackground(Color.GREEN);}
	    		else{button3.setBackground(Color.MAGENTA);}
	    		button3.setEnabled(false);
	    	}
	    	if(event.getSource()== button4){
	    		button4.setText(Disp);
	    		button4.setFont(new Font("Arial", Font.PLAIN, 40));
	    		if(count%2==0){button4.setBackground(Color.GREEN);}
	    		else{button4.setBackground(Color.MAGENTA);}
	    		button4.setEnabled(false);
	    	}
	    	if(event.getSource()== button5){
	    		button5.setText(Disp);
	    		button5.setFont(new Font("Arial", Font.PLAIN, 40));
	    		if(count%2==0){button5.setBackground(Color.GREEN);}
	    		else{button5.setBackground(Color.MAGENTA);}
	    		button5.setEnabled(false);
	    	}
	    	if(event.getSource()== button6){
	    		button6.setText(Disp);
	    		button6.setFont(new Font("Arial", Font.PLAIN, 40));
	    		if(count%2==0){button6.setBackground(Color.GREEN);}
	    		else{button6.setBackground(Color.MAGENTA);}
	    		button6.setEnabled(false);
	    	}
	    	if(event.getSource()== button7){
	    		button7.setText(Disp);
	    		button7.setFont(new Font("Arial", Font.PLAIN, 40));
	    		if(count%2==0){button7.setBackground(Color.GREEN);}
	    		else{button7.setBackground(Color.MAGENTA);}
	    		button7.setEnabled(false);
	    	}
	    	if(event.getSource()== button8){
	    		button8.setText(Disp);
	    		button8.setFont(new Font("Arial", Font.PLAIN, 40));
	    		if(count%2==0){button8.setBackground(Color.GREEN);}
	    		else{button8.setBackground(Color.MAGENTA);}
	    		button8.setEnabled(false);
	    	}
	    	if(event.getSource()== button9){
	    		button9.setText(Disp);
	    		button9.setFont(new Font("Arial", Font.PLAIN, 40));
	    		if(count%2==0){button9.setBackground(Color.GREEN);}
	    		else{button9.setBackground(Color.MAGENTA);}
	    		button9.setEnabled(false);
	    	}
	    	//There 8 combinations that can be win
	    	//Horizontal wins
	    	if(button1.getText()==button2.getText()&& button2.getText()==button3.getText() &&
	    			button3.getText()!= "" ){
	    		winner=true;
	    	}
	    	if(button4.getText()==button5.getText()&& button5.getText()==button6.getText() &&
	    			button6.getText()!= "" ){
	    		winner=true;
	    	}
	    	if(button7.getText()==button8.getText()&& button8.getText()==button9.getText() &&
	    			button9.getText()!= "" ){
	    		winner=true;
	    	}
	    	//vertical wins
	    	if(button1.getText()==button4.getText()&& button4.getText()==button7.getText() &&
	    			button7.getText()!= "" ){
	    		winner=true;
	    	}if(button2.getText()==button5.getText()&& button5.getText()==button8.getText() &&
	    			button8.getText()!= "" ){
	    		winner=true;
	    	}if(button3.getText()==button6.getText()&& button6.getText()==button9.getText() &&
	    			button9.getText()!= "" ){
	    		winner=true;
	    	}
	    	
	    	//diagonal wins
	    	if(button1.getText()==button5.getText()&& button5.getText()==button9.getText() &&
	    			button9.getText()!= "" ){
	    		winner=true;
	    	}if(button3.getText()==button5.getText()&& button5.getText()==button7.getText() &&
	    			button7.getText()!= "" ){
	    		winner=true;
	    	}
	    	if(winner){
	    		JOptionPane.showMessageDialog(null,Disp+" Wins!");
	    	}
	    	if(winner== false && count==9){
	    		JOptionPane.showMessageDialog(null,"Tie!");//set tie if there is no winner after 9 turns
	    	} 
	    	
	    	
	    }
	   
   }
   
}
