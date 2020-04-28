import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class NewPokemon extends JFrame{
    
    private Trainer trainer;
   
    public NewPokemon(Trainer trainer){
        super("New Pokemon");
        this.trainer = trainer;
        JTextField name = new JTextField(20);

        JRadioButton Bulbasaur = new JRadioButton("Bulbasaur"); 
        JRadioButton Charmander = new JRadioButton("Charmander");
        JRadioButton Squirtle = new JRadioButton("Squirtle");

        JButton okButton = new JButton("New"); 
        
        JButton closeButton = new JButton("Close");
    
        

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        
      
        addItem(panel1, Bulbasaur, 0, 0, 1, 1, GridBagConstraints.SOUTH);
        addItem(panel1, Charmander, 1, 0, 1, 1, GridBagConstraints.SOUTH);
        addItem(panel1, Squirtle, 2, 0, 1, 1, GridBagConstraints.SOUTH);
        ButtonGroup group = new ButtonGroup();
        group.add(Bulbasaur);
        group.add(Charmander);
        group.add(Squirtle);


        addItem(panel1, new JLabel("Name:"), 0, 3, 1, 1, GridBagConstraints.EAST);
        addItem(panel1, name, 1, 3, 2, 1, GridBagConstraints.WEST);
              
        
        Box buttonBox = Box.createHorizontalBox();
        buttonBox.add(okButton);
        buttonBox.add(Box.createHorizontalStrut(20));
        
        buttonBox.add(closeButton);
        addItem(panel1, buttonBox, 2, 4, 1, 1, GridBagConstraints.CENTER);
        
        okButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if (name.getText().length() == 0||((Bulbasaur.isSelected() == false ) && (Charmander.isSelected() == false) && (Squirtle.isSelected() == false))){
                }
                else{
                if(trainer.slot().size() == 1){
                

                }
                else if(name.getText() != "" && Bulbasaur.isSelected()){
                    trainer.addP();
                    trainer.slot().get(0).Name(name.getText());
                    trainer.slot().get(0).poke1();
                   
                }
                else if(name.getText() != "" && Charmander.isSelected()){
                    trainer.addP();
                    trainer.slot().get(0).Name(name.getText());
                    trainer.slot().get(0).poke2();
                   
                }
                else if(name.getText() != "" && Squirtle.isSelected()){
                    trainer.addP();
                    trainer.slot().get(0).Name(name.getText());
                    trainer.slot().get(0).poke3();
                }
                
                setVisible(false);
                MainGame maingame = new MainGame(trainer);
                maingame.setVisible(true);
            }
            }});

        closeButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                setVisible(false);
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