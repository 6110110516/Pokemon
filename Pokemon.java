

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

    // public int Attack(int hp,int Damage){
    //     hp -= Damage;
    //     return hp;
    // }

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

    public void catchpokemon(Pokemon pokemon){
        nameP = pokemon.getnameP();
        level = pokemon.getlevel();
        HP = pokemon.getHP();
        Damage = pokemon.getDamage();
    }
    
    public void Nopoke()
    {
        nameP ="--";
        level = 0;
        HP = 0;
        Damage = 0;
    }
   
    public void poke(int NumP,int n){
        if(NumP == 0){
            nameP ="Bulbasaur";
            level = n;
            HP = 100 + (5*(n-1));
            Damage = 5 + n-1;
        }
        else if(NumP == 1){
            nameP ="Charmander";
            level = n;
            HP = 90 + (5*(n-1));
            Damage = 6 + n-1;
        }
        else if(NumP == 2){
            nameP ="Squirtle";
            level = n;
            HP = 110 + (5*(n-1));
            Damage = 4 + n-1;
        }
        else if(NumP == 3){
            nameP ="Pidgey";
            level = n;
            HP = 100 + (5*(n-1));
            Damage = 4 + n-1;
        }
        else if(NumP == 4){
            nameP ="Magikarp";
            level = n;
            HP = 102 + (5*(n-1));
            Damage = 1 + n-1;
        }
        else if(NumP == 5){
            nameP ="Eevee";
            level = n;
            HP = 110 + (5*(n-1));
            Damage = 5 + n-1;
        }
        else if(NumP == 6){
            nameP ="Kabigon";
            level = n;
            HP = 200 + (5*(n-1));
            Damage = 5 + n-1;
        }
        
    }
}