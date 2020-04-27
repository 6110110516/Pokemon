import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainGame extends JFrame
{
        private Trainer trainer;
        // private int token = 1;
        public MainGame(Trainer trainer){
        super("Pokemon Hio");
        this.trainer = trainer;
        
        
        JButton jb1 = new JButton("New Pokemon");
        JButton jb2 = new JButton("Slot Pokemon");
        JButton jb3 = new JButton("Quit");

        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());

        Box buttonBox = Box.createVerticalBox();
        
        buttonBox.add(jb1);
        buttonBox.add(Box.createVerticalStrut(20));
        buttonBox.add(jb2);
        buttonBox.add(Box.createVerticalStrut(20));
        buttonBox.add(jb3);
        jb1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        jb2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        jb3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        System.out.println(trainer.slot().size());
        addItem(panel1, buttonBox, 3, 4, 1, 1, GridBagConstraints.CENTER);
        
        jb1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(trainer.slot().size() == 0){
                NewPokemon Newpokemon = new NewPokemon(trainer);
                Newpokemon.setVisible(true);
                }
            }
            
        });
        
        jb2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                PokemonStatus Status = new PokemonStatus(trainer);
                Status.setVisible(true);
            }});

        jb3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                System.exit(0);
            }});
            
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel1);
        this.pack();
        setSize(700, 300);
        setLocation(500, 280);
        setVisible(true);
        
    }
    private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = x;
        gc.gridy = y;
        gc.gridwidth = width;
        gc.gridheight = height;
        gc.weightx = 100.0;
        gc.weighty = 100.0;
        gc.insets = new Insets(5, 5, 5, 5);
        gc.anchor = align;
        gc.fill = GridBagConstraints.CENTER;
        p.add(c, gc);
    }

} 