public class RpgCharacter
{
    private String charName;
    private int charHp;
    private int charMp;
    private int charAtk;
    private int charXp;

    /* ------------------- Acessor methods -------------------------- */
    public String getCharName()
    {
        return charName;
    }

    public int getCharHp() {
        return charHp;
    }
    
    public int getCharMp() {
        return charMp;
    }

    public int getCharAtk() {
        return charAtk;
    }

    public int getCharXp() {
        return charXp;
    }

    /* ------------------- Mutator methods -------------------------- */
    public void setCharName(String name) 
    {
        charName = name;
    }
    
    public void setCharHp() 
    {  
        int health = (int) (Math.random() * (100 - 50) + 50);
        charHp = health;
    }

    public void setCharMp() 
    {
        int magic = (int) (Math.random() * (100 - 50) + 50);
        charMp = magic;
    }

    public void setCharAtk() 
    {
        int attack = (int) (Math.random() * (20 - 5) + 5);
        charAtk = attack;
    }

    public void setCharXp(int exp) 
    {   
        charXp += exp;
    }
    /* ------------------- Buff setter -------------------------- */

    public void setBuffs(int buffHp, int buffMp, int buffAtk)
    {
        charHp += buffHp;
        charMp += buffMp;
        charAtk += buffAtk;
    }


    /* ------------------- Constructor -------------------------- */

    public RpgCharacter(String name)
    {
        charName = name;
        setCharHp();
        setCharMp();
        setCharAtk();
        setCharXp(0);
    }
	
	public void display()
	{
		System.out.println("");
        System.out.println("Nice to meet you " + charName + ".");
        System.out.println("It seems you have " + charHp + " hit points.");
        System.out.println("You also have " + charMp + " mana points.");
        System.out.println("Your attack power is " + charAtk + " and you have " + charXp + " experience.");
		
	}

}