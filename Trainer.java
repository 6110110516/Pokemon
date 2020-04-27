import java.util.*;
public class Trainer {
    private ArrayList<Pokemon> slot;
    private Pokemon pokemon = new Pokemon();
    private String name;
    
    public Trainer(String name){
        slot = new ArrayList<Pokemon>();

        pokemon = new Pokemon();
        pokemon.poke1();

        slot.add(pokemon);

        this.name = name;
    }
    public ArrayList<Pokemon> slot(){
        return this.slot;
    }
    
    public String getNameT(){
        return this.name;
    }

    // public Pokemon addP(){
    //     Pokemon pokemon = pokemon.poke1();
    //     return pokemon;
    // }

    public void play(){
        int i = 1;

        while(i == 1){


            

        }

    }

}