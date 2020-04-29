import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UseItem extends JFrame{
    private  Trainer trainer;
    private int i = 0;
    public UseItem(Trainer trainer){
        super("UseItem");
        this.trainer = trainer;
        int n = trainer.slot().size();
        int Potion = trainer.getpotion();

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());

        Box[] box = new Box[10];
        for( i =0; i < 10;i++){
            box[i] = Box.createHorizontalBox();
        }
        Box potionBox = Box.createVerticalBox();
        // System.out.println(n);
        JLabel potion = new JLabel("Potion EXP : "+Potion);
        JLabel[] labels = new JLabel[10];
        JButton[] usebutton = new JButton[10];
        
        
        for ( i =  0; i < 10; i++) {
            
            
            if(i < n){
                
                labels[i] = new JLabel( i+1 + " |  name : " + trainer.slot().get(i).getname() + "|  type : " + trainer.slot().get(i).getnameP() +"|  level : " + trainer.slot().get(i).getlevel() + "|  exp : " + trainer.slot().get(i).getexp()+" | ");
                usebutton[i] = new JButton("Use Potion EXP");
                potionBox.add(usebutton[i]);
                box[i].add(labels[i]);   
                box[i].add(Box.createHorizontalStrut(5));         
                box[i].add(usebutton[i]);
                
                
            }
            else{
                labels[i] = new JLabel(i+1 + "---");
                // usebutton[i] = new JButton("---");
                box[i].add(labels[i]); 
            }
              
            
            potionBox.add(box[i]);
            potionBox.add(Box.createVerticalStrut(5));
            }
        
        addItem(panel1, potionBox, 1, 0, 1, 1, GridBagConstraints.EAST);
        addItem(panel1, potion, 2, 0, 1, 1, GridBagConstraints.CENTER);
        JButton close = new JButton("Back");
                                                      
        addItem(panel1, close, 2, 4, 1, 1, GridBagConstraints.CENTER);
        if(trainer.getpotion() > 0){
            // System.out.println(trainer.getpotion());
            if( n > 0)
            usebutton[0].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    trainer.GetExp(trainer.slot().get(0),30);
                    trainer.usepotion();
                    PokemonStatus status = new PokemonStatus(trainer);
                    status.setVisible(true);
                    setVisible(false);
            }});
            if( n > 1)
            usebutton[1].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    trainer.GetExp(trainer.slot().get(1),30);
                    trainer.usepotion();
                    PokemonStatus status = new PokemonStatus(trainer);
                    status.setVisible(true);
                    setVisible(false);
                    
            }});
            if( n > 2 )
            usebutton[2].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    trainer.GetExp(trainer.slot().get(2),30);
                    trainer.usepotion();
                    PokemonStatus status = new PokemonStatus(trainer);
                    status.setVisible(true);
                    setVisible(false);
                        
            }});
            if( n > 3 )
            usebutton[3].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    trainer.GetExp(trainer.slot().get(3),30);
                    trainer.usepotion();
                    PokemonStatus status = new PokemonStatus(trainer);
                    status.setVisible(true);
                    setVisible(false);
                    
            }});
            if( n > 4 )
            usebutton[4].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    trainer.GetExp(trainer.slot().get(4),30);
                    trainer.usepotion();
                    PokemonStatus status = new PokemonStatus(trainer);
                    status.setVisible(true);
                    setVisible(false);
                        
            }});
            if( n > 5 )
            usebutton[5].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    trainer.GetExp(trainer.slot().get(5),30);
                    trainer.usepotion();
                    PokemonStatus status = new PokemonStatus(trainer);
                    status.setVisible(true);
                    setVisible(false);
                    
            }});
            if( n > 6 )
            usebutton[6].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    trainer.GetExp(trainer.slot().get(6),30);
                    trainer.usepotion();
                    PokemonStatus status = new PokemonStatus(trainer);
                    status.setVisible(true);
                    setVisible(false);
                        
            }}); 
            if( n > 7 )
            usebutton[7].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    trainer.GetExp(trainer.slot().get(7),30);
                    trainer.usepotion();
                    PokemonStatus status = new PokemonStatus(trainer);
                    status.setVisible(true);
                    setVisible(false);
                    
            }});
            if( n > 8 )
            usebutton[8].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    trainer.GetExp(trainer.slot().get(8),30);
                    trainer.usepotion();
                    PokemonStatus status = new PokemonStatus(trainer);
                    status.setVisible(true);
                    setVisible(false);
                        
            }});
            if( n > 9 )
            usebutton[9].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    trainer.GetExp(trainer.slot().get(9),30);
                    trainer.usepotion();
                    PokemonStatus status = new PokemonStatus(trainer);
                    status.setVisible(true);
                    setVisible(false);
                    
            }});
               
        }
                
        close.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                PokemonStatus Status = new PokemonStatus(trainer);
                Status.setVisible(true);
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