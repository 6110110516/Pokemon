import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainGame extends JFrame
{
    private Trainer trainer;

        public MainGame(Trainer trainer){
        super("Pokemon Hio");
        this.trainer = trainer;

        Container c = getContentPane();

        
        // JLabel trainerNameLabel = new JLabel(this.trainer.getNameT());
        JButton jb1 = new JButton("New Pokemon");
        JButton jb2 = new JButton("Slot Pokemon");
        JButton jb3 = new JButton("Quit");
        jb1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                NewPokemon Newpokemon = new NewPokemon();
                Newpokemon.setVisible(true);

                
            }});
        

        jb3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                System.exit(0);
            }});
        jb1.setAlignmentX(Component.CENTER_ALIGNMENT);
        jb2.setAlignmentX(Component.CENTER_ALIGNMENT);
        jb3.setAlignmentX(Component.CENTER_ALIGNMENT);


        // c.add(trainerNameLabel);
        c.add(jb1);
        c.add(jb2);
        c.add(jb3);
        c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 300);
        setLocation(500, 280);
        setVisible(true);
        
    }

} 