import java.util.*;

public class Trainer {
    private ArrayList<Pokemon> slot;
    private Pokemon pokemon = new Pokemon() ;
    private int potion = 1;
    private String name;
    
    public Trainer(String name){
        slot = new ArrayList<Pokemon>();
        Pokemon pokemon1 = new Pokemon();
        Pokemon pokemon2 = new Pokemon();
        Pokemon pokemon3 = new Pokemon();
        pokemon1.poke3();
        slot.add(0,pokemon1);
        pokemon2.poke2();
        slot.add(1,pokemon2);
        pokemon3.poke1();

        slot.add(2,pokemon3);
        


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


    public void GetExp(Pokemon pokemon,int exp){
        pokemon.expup(exp);
        if(pokemon.getexp() >= 100)
            pokemon.levelup();
    }
    
    public String getNameT(){
        return this.name;
    }

    public void addP(){
        pokemon = new Pokemon();
        pokemon.Nopoke();

        slot.add(pokemon);
    }

    public void play(){
        int i = 1;

        while(i == 1){


            
        }

    }



}