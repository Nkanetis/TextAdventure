import java.util.Scanner;

public class Encounter01
{
	public Encounter01(String name, int playerAtk, int playerHp)
	{
		//displays message and creates a 'fight'
		System.out.println("");
		System.out.println(" XXXXXXXXX  XXX  XXXXXXXXXX  XXX   XXX  XXXXXXXXXX  ");
		System.out.println(" XXXXXXXXX  XXX  XXXXXXXXXX  XXX   XXX  XXXXXXXXXX  ");
		System.out.println(" XXX        XXX  XXX    XXX  XXX   XXX     XXXX     ");
		System.out.println(" XXX        XXX  XXX         XXX   XXX     XXXX     ");
		System.out.println(" XXXXXXX    XXX  XXX  XXXX   XXXXXXXXX     XXXX     ");
		System.out.println(" XXXXXXX    XXX  XXX  XXXXX  XXXXXXXXX     XXXX     ");
		System.out.println(" XXX        XXX  XXX    XXX  XXX   XXX     XXXX     ");
		System.out.println(" XXX        XXX  XXX    XXX  XXX   XXX     XXXX     ");
		System.out.println(" XXX        XXX  XXX    XXX  XXX   XXX     XXXX     ");
		System.out.println(" XXX        XXX  XXXXXXXXXX  XXX   XXX     XXXX     ");
		System.out.println(" XXX        XXX  XXXXXXXXXX  XXX   XXX     XXXX     ");
		System.out.println("");
					
		Fight01 action = new Fight01(name, playerAtk, playerHp);
	
	}

}