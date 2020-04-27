import java.util.*;
public class Trainer {
    private ArrayList<Pokemon> slot;
    private Pokemon pokemon = new Pokemon();
    private String name;
    
    public Trainer(String name){
        slot = new ArrayList<Pokemon>();

        this.name = name;
    }
    public ArrayList<Pokemon> slot(){
        return this.slot;
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