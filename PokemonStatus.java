import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokemonStatus extends JFrame
{   
    Pokemon pokemon;

    public PokemonStatus(){
        // super("Pokemon Status " +pokemon.getnameP());
        // this.pokemon = pokemon;

        Container c = getContentPane();
        JLabel name = new JLabel("s");
        JLabel hp = new JLabel("HP :" );

        c.add(name);
        c.add(hp);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);

        }
    
}