

public class Pokemon
{
    private int level =0;
    private int Exp = 0;

    private int HP = 0;
    private int Damage = 0;
    private String nameP = "---";
    private String name = "---";
    public static void main(String[] args){
    
    }
      
    public String getnameP()
    { return nameP; }

    public String getname()
    { return name; }

    public void expup(int exp){
        Exp += exp;
    }

    public void levelup(){
        Exp -= 100;
        level ++;
        HP += 5;
        Damage += 1;
    }

    public  int getexp()
    { return Exp; }

    public  int getlevel()
    { return level; }

    public int getHP()
    { return HP; }

    public int getDamage()
    { return Damage; }

    public void Name(String name){
        this.name = name;
    }

    
    public void Nopoke()
    {
        nameP ="--";
        level = 0;
        HP = 0;
        Damage = 0;
    }
   
    public void poke1()
    {
        nameP ="Bulbasaur";
        level = 1;
        HP = 100 ;
        Damage = 5 ;
    }
    public void poke2()
    {
        nameP ="Charmander";
        level = 1;
        HP = 90;
        Damage = 6;
    }
    public void poke3()
    {
        nameP ="Squirtle";
        level = 1;
        HP = 110;
        Damage = 4;
    }
    public void poke4()
    {
        nameP ="Pidgey";
        level = 1;
        HP = 100;
        Damage = 4;
    }
}