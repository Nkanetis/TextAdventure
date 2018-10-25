import java.util.Scanner;

public class Move01 
{
	//global variables
	int playerRoll;
	private String userMove;
	int encounterRoll;
	boolean move = true;
	boolean stop = true;
	boolean encounter;
	//creating scanner
	Scanner kbd = new Scanner(System.in);

	public Move01()
	{
		//loop that ends when the player moves
		while(stop)
		{		
			//loop that ends when an encoutner happens
			while(move)
			{
				//prompts user which direction to go
				System.out.print("Move where?('left','right','forward') or type STOP to end >> ");
				userMove = kbd.nextLine();
			
				switch(userMove.toLowerCase()) {
					case "forward":
 
					case "left":

					case "right":

						System.out.println("");
						System.out.println("you move " + userMove + " through /door/ and enter the next room...");
						
						//creates two dice and checks value of the "roll"
						Die roll = new Die();
						playerRoll = roll.getValue();
						Die roll2 = new Die();
						encounterRoll = roll2.getValue();

						//if values are equal it starts an ecounter and ends the loops otherwise ask where to move again
						if( playerRoll > encounterRoll) 
						{
							System.out.println("");
							System.out.println("encounter begin");
							encounter = true;
							move = false;
							stop = false;
							
						} 
						else
						{
							System.out.println("");
							System.out.println("The room is empty");
						}
						break;
					case "stop":
						move = false;
						stop = false;
						break;
					default:
						System.out.println("");
						System.out.println("Enter 'left', 'right' or 'forward' to move, or 'stop' to quit the game!");
				} 
			}	
		}
	}
	public String getMove()
	{
		return userMove;
	}
}