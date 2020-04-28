import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UseItem extends JFrame{
    private final Trainer trainer;

    public UseItem(Trainer trainer){
        super("UseItem");
        this.trainer = trainer;
        int n = trainer.slot().size();

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());

        Box[] box = new Box[10];
        for(int i =0; i < 10;i++){
            box[i] = Box.createHorizontalBox();
        }
        Box potionBox = Box.createVerticalBox();
        System.out.println(n);
        JLabel[] labels = new JLabel[10];
        JButton[] usebutton = new JButton[10];
        
        for (int i =  0; i < 10; i++) {
            
            
            if(i < n){
                
                labels[i] = new JLabel( i+1 + "  name : " + trainer.slot().get(i).getnameP() +"  level : " + trainer.slot().get(i).getlevel() + "  exp : " + trainer.slot().get(i).getexp());
                usebutton[i] = new JButton("Use Potion");
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
        
        addItem(panel1, potionBox, 1, 0, 1, 1, GridBagConstraints.CENTER);

        JButton close = new JButton("Close");
        JButton useButton = new JButton("Use item");
        JButton okButton = new JButton("expup"); 
           
                                            
        Box buttonBox = Box.createHorizontalBox();
        buttonBox.add(okButton);
        buttonBox.add(Box.createHorizontalStrut(20));
        buttonBox.add(useButton);
        buttonBox.add(Box.createHorizontalStrut(20));
        buttonBox.add(close);
        addItem(panel1, buttonBox, 1, 4, 1, 1, GridBagConstraints.CENTER);
        
        okButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                trainer.GetExp(trainer.slot().get(0),15);
                
            }});

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