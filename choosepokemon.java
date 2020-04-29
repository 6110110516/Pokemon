import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class choosepokemon extends JFrame{
    private Trainer trainer;
    
    public choosepokemon(Trainer trainer,Pokemon wildpokemon){
        super("Pokemon choosepokemon");
        this.trainer = trainer;
        // this.wildpokemon = wildpokemon;
        int n = trainer.slot().size();

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());

        

        Box[] box = new Box[10];
        for(int i =0; i < 10;i++){
            box[i] = Box.createHorizontalBox();
        }

        Box battleBox = Box.createVerticalBox();
        JLabel[] labels = new JLabel[10];
        JButton[] choose = new JButton[10];
        
        for (int i =  0; i < 10; i++) {
            
            
            if(i < n){
                
                labels[i] = new JLabel( i+1 + " |  name : " + trainer.slot().get(i).getname() + "|  type : " + trainer.slot().get(i).getnameP() +"|  level : " + trainer.slot().get(i).getlevel() + "|  exp : " + trainer.slot().get(i).getexp()+" | ");
                choose[i] = new JButton("Choose Pokemon");
                battleBox.add(choose[i]);
                box[i].add(labels[i]);   
                box[i].add(Box.createHorizontalStrut(5));         
                box[i].add(choose[i]);
                
                
            }
            else{
                labels[i] = new JLabel(i+1 + "---");
                // usebutton[i] = new JButton("---");
                box[i].add(labels[i]); 
            }
              
            
            battleBox.add(box[i]);
            battleBox.add(Box.createVerticalStrut(5));
            }
        addItem(panel1, battleBox, 1, 0, 1, 1, GridBagConstraints.CENTER);

        JButton close = new JButton("Back");                                      
        Box buttonBox = Box.createHorizontalBox();
       
        buttonBox.add(Box.createHorizontalStrut(20));
        buttonBox.add(close);
        addItem(panel1, buttonBox, 1, 4, 1, 1, GridBagConstraints.CENTER);
              
               
        if(n > 0){
            // System.out.println(trainer.getpotion());
            if( n > 0)
            choose[0].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    if(trainer.Battle(trainer.slot().get(0), wildpokemon) == 1){
                        trainer.GetExp(trainer.slot().get(0),12*wildpokemon.getlevel());
                        win w = new win(trainer,wildpokemon);
                        w.setVisible(true);
                        setVisible(false);
                    }
                    else if(trainer.Battle(trainer.slot().get(0), wildpokemon) == 0){
                        lost l = new lost(trainer);
                        l.setVisible(true);
                        setVisible(false);
                    }
            }});
            if( n > 1)
            choose[1].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    if(trainer.Battle(trainer.slot().get(1), wildpokemon) == 1){
                        trainer.GetExp(trainer.slot().get(1),12*wildpokemon.getlevel());
                        win w = new win(trainer,wildpokemon);
                        w.setVisible(true);
                        setVisible(false);
                    }
                    else if(trainer.Battle(trainer.slot().get(1), wildpokemon) == 0){
                        lost l = new lost(trainer);
                        l.setVisible(true);
                        setVisible(false);
                    }
            }});
            if( n > 2 )
            choose[2].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    if(trainer.Battle(trainer.slot().get(2), wildpokemon) == 1){
                        trainer.GetExp(trainer.slot().get(2),12*wildpokemon.getlevel());
                        win w = new win(trainer,wildpokemon);
                        w.setVisible(true);
                        setVisible(false);
                    }
                    else if(trainer.Battle(trainer.slot().get(2), wildpokemon) == 0){
                        lost l = new lost(trainer);
                        l.setVisible(true);
                        setVisible(false);
                    }
            }});
            if( n > 3 )
            choose[3].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    if(trainer.Battle(trainer.slot().get(3), wildpokemon) == 1){
                        trainer.GetExp(trainer.slot().get(3),12*wildpokemon.getlevel());
                        win w = new win(trainer,wildpokemon);
                        w.setVisible(true);
                        setVisible(false);
                    }
                    else if(trainer.Battle(trainer.slot().get(3), wildpokemon) == 0){
                        lost l = new lost(trainer);
                        l.setVisible(true);
                        setVisible(false);
                    }
            }});
            if( n > 4 )
            choose[4].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    if(trainer.Battle(trainer.slot().get(4), wildpokemon) == 1){
                        trainer.GetExp(trainer.slot().get(4),12*wildpokemon.getlevel());
                        win w = new win(trainer,wildpokemon);
                        w.setVisible(true);
                        setVisible(false);
                    }
                    else if(trainer.Battle(trainer.slot().get(4), wildpokemon) == 0){
                        lost l = new lost(trainer);
                        l.setVisible(true);
                        setVisible(false);
                    }
            }});
            if( n > 5 )
            choose[5].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    if(trainer.Battle(trainer.slot().get(5), wildpokemon) == 1){
                        trainer.GetExp(trainer.slot().get(5),12*wildpokemon.getlevel());
                        win w = new win(trainer,wildpokemon);
                        w.setVisible(true);
                        setVisible(false);
                    }
                    else if(trainer.Battle(trainer.slot().get(5), wildpokemon) == 0){
                        lost l = new lost(trainer);
                        l.setVisible(true);
                        setVisible(false);
                    }
            }});
            if( n > 6 )
            choose[6].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    if(trainer.Battle(trainer.slot().get(6), wildpokemon) == 1){
                        trainer.GetExp(trainer.slot().get(6),12*wildpokemon.getlevel());
                        win w = new win(trainer,wildpokemon);
                        w.setVisible(true);
                        setVisible(false);
                    }
                    else if(trainer.Battle(trainer.slot().get(6), wildpokemon) == 0){
                        lost l = new lost(trainer);
                        l.setVisible(true);
                        setVisible(false);
                    }  
            }}); 
            if( n > 7 )
            choose[7].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    if(trainer.Battle(trainer.slot().get(7), wildpokemon) == 1){
                        trainer.GetExp(trainer.slot().get(7),12*wildpokemon.getlevel());
                        win w = new win(trainer,wildpokemon);
                        w.setVisible(true);
                        setVisible(false);
                    }
                    else if(trainer.Battle(trainer.slot().get(7), wildpokemon) == 0){
                        lost l = new lost(trainer);
                        l.setVisible(true);
                        setVisible(false);
                    }
            }});
            if( n > 8 )
            choose[8].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    if(trainer.Battle(trainer.slot().get(8), wildpokemon) == 1){
                        trainer.GetExp(trainer.slot().get(8),12*wildpokemon.getlevel());
                        win w = new win(trainer,wildpokemon);
                        w.setVisible(true);
                        setVisible(false);
                    }
                    else if(trainer.Battle(trainer.slot().get(8), wildpokemon) == 0){
                        lost l = new lost(trainer);
                        l.setVisible(true);
                        setVisible(false);
                    }   
            }});
            if( n > 9 )
            choose[9].addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    if(trainer.Battle(trainer.slot().get(9), wildpokemon) == 1){
                        trainer.GetExp(trainer.slot().get(9),12*wildpokemon.getlevel());
                        win w = new win(trainer,wildpokemon);
                        w.setVisible(true);
                        setVisible(false);
                    }
                    else if(trainer.Battle(trainer.slot().get(9), wildpokemon) == 0){
                        lost l = new lost(trainer);
                        l.setVisible(true);
                        setVisible(false);
                    }
            }});
        }

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