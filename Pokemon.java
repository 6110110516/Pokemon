

public class Pokemon
{
    private static int level = 0;
    private static int HP = 0;
    private static int SP = 0;
    private String nameP = "---";
    private String name = "---";
    public static void main(String[] args){
    
    }
      
    public String getnameP()
    { return nameP; }

    public static int getlevel()
    { return level; }

    public int getHP()
    { return HP; }

    public int getSP()
    { return SP; }

    public void Name(String name){
        this.name = name;
    }

   
    public void poke1()
    {
        nameP ="Bulbasaur";
        level = 1;
        HP = 8;
        SP = 12;
    }
    public void poke2()
    {
        nameP ="Charmander";
        level = 1;
        HP = 10;
        SP = 10;
    }
    public void poke3()
    {
        nameP ="Squirtle";
        level = 1;
        HP = 12;
        SP = 8;
    }
    public void poke4()
    {
        nameP ="Pidgey";
        level = 1;
        HP = 9;
        SP = 9;
    }
}