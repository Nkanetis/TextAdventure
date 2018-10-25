import java.util.Scanner;

public class Weapon
{
    //varaibles
    private String wepType;
    private int wepHp;
    private int wepMp;
    private int wepAtk;
    private int randWep;
    private int health;
    private int magic;
    private int attack;
    //keeps track of each time the player wants a new weapon
	byte spinCount = 0;
    boolean first = true;
    boolean encounter = true;
    String userInput;
    //array of strings with the different weapon names
    private String[] weps = {"Sword", "Staff", "Wand", "Orbs", "Two-Handed Axe", "Scythe"};
    
    /*-------------------Accessor Methods ------------------------- */
    public String getType()
    {
        return wepType;
    }
    public int getHp()
    {
        return wepHp;
    }
    public int getMp()
    {
        return wepMp;
    }
    public int getAtk()
    {
        return wepAtk;
    }

    /* --------------------- Mutator Methods --------------------- */
    public void setType()
    {
        randWep = (int) (Math.random() * weps.length);
        wepType = weps[randWep];
    }
    
    public void setCharHp() {
        if(randWep == 3 || randWep == 4 || randWep == 5)
            health = (int) (Math.random() * 5 + 1);
        else
            health = (int) (Math.random() * 25 + 1);
        wepHp = health;
    }

    public void setCharMp() {
        magic = (int) (Math.random() * 10 + 1);
        wepMp = magic;
    }

    public void setCharAtk() {
        if(randWep == 3 || randWep == 4 || randWep == 5)
            attack = (int) (Math.random() * 20 + 1);
        else
            attack = (int) (Math.random() * 10 + 1);
        wepAtk = attack;
    }

    public void spin()
    {
        setType();
        setCharHp();
        setCharMp();
        setCharAtk();
    }

    public Weapon()
    {
        setType();
        setCharHp();
        setCharMp();
        setCharAtk();
    }
	//display method that takes in parameters
	public void display(String charName, int charHp, int charAtk, int charMp)
	{
        //creates scanner
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Your Weapon is " + wepType);
        System.out.println("Its Stats are:");
        System.out.println("Extra HP: " + wepHp);
        System.out.println("Extra MP: " + wepMp);
        System.out.println("Extra Attack power: " + wepAtk);
		while (first)
        {
            System.out.println("Enter next option: \"continue\" - to move on, \"reroll\" - test your luck for new wep(only can 3 turns) \"stats\" - to list stats below with wep buffs");
            userInput = kbd.nextLine();

            if(userInput.equalsIgnoreCase("continue"))
                first = false;
            else
                if(userInput.equalsIgnoreCase("reroll"))
                    if(spinCount < 3)
                    {
                        spin();
                        System.out.println("Weapon Type:           " + wepType);
                        System.out.println("Extra HP:              " + wepHp);
                        System.out.println("Extra MP:              " + wepMp);
                        System.out.println("Extra Attack Power:    " + wepAtk);
                        ++spinCount;
                    }
                    else
                    {
                        System.out.println();
                        System.out.println("Can't you read? You have reached your 3 turns. Suck it up now!");
                    }
                else
                    if(userInput.equalsIgnoreCase("stats"))
                    {
                        System.out.println("Character name:        " + charName);
                        System.out.println("HP:                    " + charHp);
                        System.out.println("MP:                    " + charMp);
                        System.out.println("Attack Power:          " + charAtk);
                        System.out.println("Weapon Type:           " + wepType);
                        System.out.println("Extra HP:              " + wepHp);
                        System.out.println("Extra MP:              " + wepMp);
                        System.out.println("Extra Attack Power:    " + wepAtk); 
                    }
        }
        System.out.println("");
	}
	
}
