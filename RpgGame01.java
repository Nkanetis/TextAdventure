import java.util.Scanner;
import javax.swing.*;

public class RpgGame01
{
    public static void main(String[] args)//main method header 
    {   
		boolean quit = true;
		//running method to display the rpg title
		RpgTitle title = new RpgTitle();
		title.display();
 
		//creating scanner
        Scanner kbd = new Scanner(System.in);
		
		//ask user for there name
        System.out.print("Greetings traveler, tell me your name >> ");
        String playerName = kbd.nextLine();
		
		//runs RpgCharacter method with the argument of the playerName var
        RpgCharacter player1 = new RpgCharacter(playerName);
		
		//creating variables of the players stats/info to be used as arguments 
		int charHp = player1.getCharHp(), charAtk = player1.getCharAtk(), charMp = player1.getCharMp();
		String name = player1.getCharName();
		
		//Displaying the players stats with he display method
		player1.display();
		
		//Creating and displaying weapon stats with the display method and it takes in arguments
        Weapon player1Wep = new Weapon();
		
		
        
		player1Wep.display(playerName, charHp, charAtk, charMp);
        
        charHp += player1Wep.getHp();
        charMp += player1Wep.getMp();
        charAtk += player1Wep.getAtk();
        
        while(quit)  // movement runs until death or quit.. not after first encounter
        {
            System.out.println("");
            Move01 player1Move = new Move01();
            if (!player1Move.getMove().equalsIgnoreCase("stop"))
            {
                Encounter01 fight = new Encounter01(playerName, charHp, charAtk);
            }
            else
            {
                quit = false;
            }
        }
               
    }
}