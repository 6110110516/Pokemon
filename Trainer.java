import java.util.*;

public class Trainer {
    private ArrayList<Pokemon> slot;
    private Pokemon pokemon = new Pokemon() ;
    private int potion = 5;
    private int GB = 100;
    private int GBr ;
    private int Pokeball = 0;
    private String name;
    
    public Trainer(String name){
        slot = new ArrayList<Pokemon>();

        this.name = name;
    }
    public ArrayList<Pokemon> slot(){
        return this.slot;
    }

    public int getpotion(){
        return potion;
    }
    public void usepotion(){
        potion--;
    }
    public void addpotion(){
        potion++;
    }

    public void usepokeball(){
        Pokeball --;
    }

    public void buypokeball(){
        Pokeball ++;
    }

    public int getpokeball(){
        return Pokeball;
    }

    public void GetExp(Pokemon pokemon,int exp){
        pokemon.expup(exp);
        if(pokemon.getexp() >= 100)
            pokemon.levelup();
    }

    public void GetGB(int getGb){
        GB += getGb;
        GBr = getGb;
    }

    public void payGB(int Gb){
        GB -= Gb;
    }

    public int returnGB(){
        return GB;
    }

    public int Battle(Pokemon mypoke,Pokemon wildpoke) {
        int HPmypoke = mypoke.getHP();
        int HPwildpoke = wildpoke.getHP();
     
        while(true){
            if(HPmypoke > 0){
                HPwildpoke = Attack(HPwildpoke,mypoke.getDamage());
                System.out.println("wildpoke : "+HPwildpoke+"/"+wildpoke.getHP());
            }
            else{
                return 0;
            }
            if(HPwildpoke > 0){
                HPmypoke = Attack(HPmypoke,wildpoke.getDamage());
                System.out.println("mypoke : "+HPmypoke+"/"+mypoke.getHP());
            }
            else{
                return 1;
            }
        }
    }

    public String getNameT(){
        return this.name;
    }

    public void addP(){
        pokemon = new Pokemon();
        pokemon.Nopoke();

        slot.add(pokemon);
    }

    public int Attack(int hp,int Damage){
        hp = hp-Damage;
        return hp;
    }

    public void play(){
        int i = 1;

        while(i == 1){


            
        }

    }



}