import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewPokemon extends JFrame{
    

    public static void main(String[] args){
        new NewPokemon();
                
    }
    JTextField name = new JTextField(20);

    JRadioButton Bulbasaur = new JRadioButton("Bulbasaur"); 
    JRadioButton Charmander = new JRadioButton("Charmander");
    JRadioButton Squirtle = new JRadioButton("Squirtle");

    JButton okButton = new JButton("New"); 
    JButton closeButton = new JButton("Close");

    public NewPokemon(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());

      
        addItem(panel1, Bulbasaur, 0, 0, 1, 1, GridBagConstraints.CENTER);
        addItem(panel1, Charmander, 1, 0, 1, 1, GridBagConstraints.CENTER);
        addItem(panel1, Squirtle, 2, 0, 1, 1, GridBagConstraints.CENTER);

        addItem(panel1, new JLabel("Name:"), 0, 3, 1, 1, GridBagConstraints.EAST);
        addItem(panel1, name, 1, 3, 2, 1, GridBagConstraints.WEST);
        

        Box buttonBox = Box.createHorizontalBox();
        buttonBox.add(okButton);
        buttonBox.add(Box.createHorizontalStrut(20));
        buttonBox.add(closeButton);
        addItem(panel1, buttonBox, 2, 4, 1, 1, GridBagConstraints.CENTER);

        closeButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                setVisible(false);
            }});


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