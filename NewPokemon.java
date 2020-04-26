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

        Box sizeBox = Box.createVerticalBox();
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(Bulbasaur);
        sizeGroup.add(Charmander);
        sizeGroup.add(Squirtle);
        sizeBox.add(Bulbasaur);
        sizeBox.add(Charmander);
        sizeBox.add(Squirtle);
        sizeBox.setBorder(BorderFactory.createTitledBorder("Type"));
        addItem(panel1, sizeBox, 0, 3, 1, 1, GridBagConstraints.NORTH);

        Box buttonBox = Box.createHorizontalBox();
        buttonBox.add(okButton);
        buttonBox.add(Box.createHorizontalStrut(20));
        buttonBox.add(closeButton);
        addItem(panel1, buttonBox, 2, 4, 1, 1, GridBagConstraints.NORTH);


        this.add(panel1);
        this.pack();
        this.setSize(400, 200);
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