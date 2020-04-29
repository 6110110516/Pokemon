import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PokemonStatus extends JFrame
{   
    private Trainer trainer;

    public PokemonStatus(Trainer trainer){
        super("Pokemon Status ");
        this.trainer = trainer;
        int n = trainer.slot().size();
        int Potion = trainer.getpotion();
        int Gb = trainer.returnGB();
        int Pokeball = trainer.getpokeball();

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        
        JLabel potion = new JLabel("Potion EXP : "+Potion);
        JLabel GB = new JLabel("GB : "+Gb);
        JLabel PokeB = new JLabel("Pokeball : "+Pokeball);
        Box ItemBox = Box.createVerticalBox();
        ItemBox.add(potion);
        ItemBox.add(Box.createVerticalStrut(20));
        ItemBox.add(PokeB);
        ItemBox.add(Box.createVerticalStrut(100));
        ItemBox.add(GB);

        Box textBox = Box.createVerticalBox();
        JLabel[] labels = new JLabel[10];
        
        for (int i =  0; i < 10; i++) {
            if(i < n)
                labels[i] = new JLabel( i+1 + " | name : " + trainer.slot().get(i).getname() + " |  type : " + trainer.slot().get(i).getnameP() +  " | damage : " + trainer.slot().get(i).getDamage() +" |  HP : " + trainer.slot().get(i).getHP()+" | level : " + trainer.slot().get(i).getlevel() + " |  exp : " + trainer.slot().get(i).getexp()+ " |");
            else
                labels[i] = new JLabel(i+1 + "---");
            textBox.add(labels[i]);
            textBox.add(Box.createVerticalStrut(5));
            }
        addItem(panel1, textBox, 1, 0, 1, 1, GridBagConstraints.CENTER);
        addItem(panel1, ItemBox, 2, 0, 1, 1, GridBagConstraints.CENTER);

        JButton close = new JButton("Back");
        JButton useButton = new JButton("Use item");
                                            
        Box buttonBox = Box.createHorizontalBox();
        
        buttonBox.add(useButton);
        buttonBox.add(Box.createHorizontalStrut(20));
        buttonBox.add(close);
        addItem(panel1, buttonBox, 2, 4, 1, 1, GridBagConstraints.CENTER);
        
        
        useButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                UseItem useitem = new UseItem(trainer);
                useitem.setVisible(true);
                setVisible(false);
            }});    

        close.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                MainGame maingame = new MainGame(trainer);
                maingame.setVisible(true);
                setVisible(false);
            }});

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel1);
        pack();
        setSize(1000, 600);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
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
            gc.fill = GridBagConstraints.NONE;
            p.add(c, gc);
        }
}