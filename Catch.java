import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Catch extends JFrame{
    private Trainer trainer;
    
    public Catch(Trainer trainer,Pokemon pokemon){
    super("Catch Pokemon");
    this.trainer = trainer;
    JTextField name = new JTextField(20);

    JButton catchB = new JButton("Catch");  

    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridBagLayout());


    addItem(panel1, new JLabel("Name:"), 0, 3, 1, 1, GridBagConstraints.EAST);
    addItem(panel1, name, 1, 3, 2, 1, GridBagConstraints.WEST);

   
    addItem(panel1, catchB, 2, 4, 1, 1, GridBagConstraints.CENTER);

    catchB.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            if(name.getText().length() == 0){

            }
            else{
            trainer.addP();
            trainer.slot().get(trainer.slot().size()-1).Name(name.getText());
            trainer.slot().get(trainer.slot().size()-1).catchpokemon(pokemon);
            MainGame maingame = new MainGame(trainer);
            maingame.setVisible(true);
            setVisible(false);
            }
        }});
        

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(panel1);
    pack();
    setSize(500, 300);
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