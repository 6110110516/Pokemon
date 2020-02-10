import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class PokemonGame extends Pokemon
{
    static Pokemon[] MyPokemon = new Pokemon[10];
    
    public static void main(String args[])
    {
        // Pokemon[] MyPokemon = new Pokemon[10];
        // ArrayList<Pokemon> num;
        for(int i=0;i<10;i++)
            {
                MyPokemon[i] = new Pokemon();
            }
        int i = 1;
        while(i == 1)
        {
            
            System.out.println("************************************");
            System.out.println("'1' New Pokemon");
            System.out.println("'2' Check Pokemon");
            System.out.println("'3' Quit Game");
            System.out.println("************************************");
            

            Scanner manuP = new Scanner(System.in);
            int choose = manuP.nextInt();
            switch(choose)
            {
                case 1:
                    

                    selectslot();
                    break;
                case 2:
                    checkslot();
                    // System.out.println("Check Pokemon -> "+ getlevel());
                    break;
                case 3:
                    System.out.println("*****");
                    System.out.println("*Bye*");
                    System.out.println("*****");
                    i = 0;
                    break;
            }
            
        }
        
    }
    public static void selectslot()
    {
        showslot();
        Scanner select = new Scanner(System.in);
        int choose = select.nextInt();
        if(choose != 0)
            newpoke(choose);
        

    }

    public static void newpoke(int cslot)
    {   
        listpoke();
        Scanner select = new Scanner(System.in);
        int choose = select.nextInt();
        switch(choose)
        {
        case 1:
            MyPokemon[cslot-1].poke1();
            break;
        case 2:
            MyPokemon[cslot-1].poke2();
            break;
        case 3:
            MyPokemon[cslot-1].poke3();
            break;
        case 4:
            MyPokemon[cslot-1].poke4();
            break;
        }
        // Pokemon();
    }

    public static void showslot()
    {
        
        System.out.println("************************************");
        for(int i=1 ; i<11;i++)
        System.out.println("("+i+")  "+ MyPokemon[i-1].getnameP());
        System.out.println("************************************");
        System.out.println("select slot press '1-10'");
        System.out.println("     back press '0'");
        System.out.println("************************************");
    }

    public static void checkslot()
    {
        int choose = 1;
        
        while(choose != 0){
            
            showslot();
            Scanner select = new Scanner(System.in);
            choose = select.nextInt();
            if(choose != 0){
                info(choose);
            }
        }
    }
    public static void info(int choose)
    {
        int info =1;
        while(info != 0)
        {
                    
            infopoke(choose);
            Scanner select2 = new Scanner(System.in);
            info = select2.nextInt();
            if(info == 5)
            {
                MyPokemon[choose-1].Nopoke();
                info = 0;            
            }    
        }
    }

    public static void listpoke()
    {
        System.out.println("************************************");
        System.out.println("'1'  Bulbasaur ");
        System.out.println("'2'  Charmander ");
        System.out.println("'3'  Squirtle ");
        System.out.println("'4'  Pidgey ");
        System.out.println("************************************");
    }

    public static void infopoke(int choose)
    {
        System.out.println("************************************");
        System.out.println("name : "+ MyPokemon[choose-1].getnameP());
        System.out.println("level : "+ MyPokemon[choose-1].getlevel());
        System.out.println("HP : "+ MyPokemon[choose-1].getHP());
        System.out.println("SP : "+ MyPokemon[choose-1].getSP());
        System.out.println("************************************");
        System.out.println("back  press '0'");
        System.out.println("delete  press '5'");
        System.out.println("************************************");
    }

}


