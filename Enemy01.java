public class Enemy01
{
    private String enemyName;
    private int enemyHp;
    private int enemyMp;
    private int enemyAtk;
    private int enemyXp;

    /* ------------------- Acessor methods -------------------------- */
    public String getEnemyName()
    {
        return enemyName;
    }

    public int getEnemyHp() {
        return enemyHp;
    }
    
    public int getEnemyMp() {
        return enemyMp;
    }

    public int getEnemyAtk() {
        return enemyAtk;
    }

    public int getEnemyXp() {
        return enemyXp;
    }

    /* ------------------- Constructor -------------------------- */

    public Enemy01(String name, int health, int magic, int atk, int xp)
    {
        enemyName = name;
		enemyHp = health;
		enemyMp = magic;
		enemyAtk = atk;
		enemyXp = xp;
    }

}