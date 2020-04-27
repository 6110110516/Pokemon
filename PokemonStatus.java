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

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());

        Box textBox = Box.createVerticalBox();

        JLabel[] labels = new JLabel[10];
        
        for (int i =  0; i < 10; i++) {
            if(i < n)
                labels[i] = new JLabel( i+1 + trainer.slot().get(i).getnameP());
            else
                labels[i] = new JLabel(i+1 + "---");
            textBox.add(labels[i]);
            textBox.add(Box.createVerticalStrut(5));
            }
        addItem(panel1, textBox, 1, 0, 1, 1, GridBagConstraints.CENTER);

        JButton close = new JButton("Close");
        JButton okButton = new JButton("New"); 
           
        
                            
        
        Box buttonBox = Box.createHorizontalBox();
        buttonBox.add(okButton);
        buttonBox.add(Box.createHorizontalStrut(20));
        
        buttonBox.add(close);
        addItem(panel1, buttonBox, 1, 4, 1, 1, GridBagConstraints.CENTER);
        
        

        close.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                setVisible(false);
            }});

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel1);
        this.pack();
        this.setSize(700, 300);
        this.setLocation(500, 280);
        this.setVisible(true);

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