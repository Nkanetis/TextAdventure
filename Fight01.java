import java.util.Scanner;
public class Fight01
{
	//defining global variables
	int enemyHp, enemyMp, enemyAtk, enemyXp, health, magic, atk;
	String enemyName;
	final int MAX_ENEMIES = 6;
	Enemy01[] enemies = new Enemy01[MAX_ENEMIES];
	public Fight01(String playerName, int playerHp, int playerAtk)
	{

	//using a for loop to create and array of enemy objects with random attributes
	for (int i = 0; i < MAX_ENEMIES; i++)
	{
		if(i == 0)
		{
			enemyName = "Rat";
			health = (int) (Math.random() * (100 - 50) + 25);
			enemyHp = health;
			magic =(int) (Math.random() * (100 - 50) + 50);
			enemyMp = magic;
			atk = (int) (Math.random() * (20 - 5) + 5);
			enemyAtk = atk;
			enemyXp = 10;
		}
		if(i == 1)
		{
			enemyName = "Spider";
			health = (int) (Math.random() * (100 - 50) + 25);
			enemyHp = health;
			magic =(int) (Math.random() * (100 - 50) + 50);
			enemyMp = magic;
			atk = (int) (Math.random() * (20 - 5) + 5);
			enemyAtk = atk;
			enemyXp = 10;
		}
		if(i == 2)
		{
			enemyName = "Slime";
			health = (int) (Math.random() * (100 - 50) + 25);
			enemyHp = health;
			magic =(int) (Math.random() * (100 - 50) + 50);
			enemyMp = magic;
			atk = (int) (Math.random() * (20 - 5) + 5);
			enemyAtk = atk;
			enemyXp = 10;
		}
		if(i == 3)
		{
			enemyName = "Goblin";
			health = (int) (Math.random() * (100 - 50) + 25);
			enemyHp = health;
			magic =(int) (Math.random() * (100 - 50) + 50);
			enemyMp = magic;
			atk = (int) (Math.random() * (20 - 5) + 5);
			enemyAtk = atk;
			enemyXp = 10;
		}
		if(i == 4)
		{
			enemyName = "Orc";
			health = (int) (Math.random() * (100 - 50) + 25);
			enemyHp = health;
			magic =(int) (Math.random() * (100 - 50) + 50);
			enemyMp = magic;
			atk = (int) (Math.random() * (20 - 5) + 5);
			enemyAtk = atk;
			enemyXp = 10;
		}
		if(i == 5)
		{
			enemyName = "Troll";
			health = (int) (Math.random() * (100 - 50) + 25);
			enemyHp = health;
			magic =(int) (Math.random() * (100 - 50) + 50);
			enemyMp = magic;
			atk = (int) (Math.random() * (20 - 5) + 5);
			enemyAtk = atk;
			enemyXp = 10;
		}
		enemies[i] = new Enemy01(enemyName, enemyHp, enemyMp, enemyAtk, enemyXp);
	}

	//creates and 'rolls' a dice to find out which enemy is fighting  
	Die enemyDie = new Die();
	int enemyType = enemyDie.getValue() - 1;
	
	//gets the attributes of the enemy
	int monsterAtk = enemies[enemyType].getEnemyAtk();
	int monsterHp = enemies[enemyType].getEnemyHp();
	String monsterName = enemies[enemyType].getEnemyName();
	String battle = "";
	Scanner kbd = new Scanner(System.in);
	
	//promts user if they want to fight
		System.out.println("Do you want to RUN or ATTACK");
		battle = kbd.nextLine();
	
	//displays info about the player and monster
		System.out.println("");
		System.out.println(playerName + " has " + playerHp + " hit points and  " + playerAtk + " attack.");
		System.out.println("");
		System.out.println(monsterName + " has " + monsterHp + " hit points and " + monsterAtk + " attack.");
		System.out.println("");
			
		//loop that contiunes unless the player 'runs'
		while(battle.equalsIgnoreCase("ATTACK"))// contuines looping until someones health is greater than 0
		{
			//if player attacks subtracts health and checks if monster hp is 0 or less
			monsterHp = monsterHp - playerAtk;
			
			System.out.println(playerName + " attacks " + monsterName + ", " + " does " + playerAtk + " damage!");
			System.out.println("");
			if(monsterHp > 0)
			{
			playerHp = playerHp - monsterAtk;
			
			// monster attacks and checks to see if player health is more then 0
			System.out.println(monsterName + " attacks " + playerName + ", " + " does " + monsterAtk + " damage! Your health is now " + playerHp);
			System.out.println("");
				
				//prompts player if they want to continue to fight
				if(playerHp > 0)
				{
					System.out.println("Continue to ATTACK or RUN?");
					battle = kbd.nextLine();
					System.out.println("");
				}
			}
			//displays who one if the players or monsters health is below 1
			if(playerHp > 0 && monsterHp <= 0)
			{
				System.out.print(playerName + " wins");
				battle = "";
			}
		
			else
				if(monsterHp > 0 && monsterHp <= 0)
				{
					System.out.println(monsterName + " wins");
					battle = "";
				}
		}
		//message to conforim the battle ended
		if(battle.equalsIgnoreCase("RUN"))
			System.out.println("You ran like a coward");
	}
}