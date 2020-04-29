import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; 

public class Forest extends JFrame {
    private Trainer trainer;
    private Pokemon pokemon = new Pokemon();
    public Forest(Trainer trainer){
    super("Pokemon Forest");
    this.trainer = trainer;

    Pokemon pokemon1 = new Pokemon();
    Pokemon pokemon2 = new Pokemon();
    Pokemon pokemon3 = new Pokemon();
    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridBagLayout());
    
    JButton[] wildbotton = new JButton[3];
    JLabel[] wildtext = new JLabel[3];
    Random rand = new Random();
    // int wildpoke ;
    
    for(int i=0; i<3;i++){
    int level = rand.nextInt(10);
    int wildpoke = rand.nextInt(7);

        if(i == 0){
            pokemon1.poke(wildpoke,level+1);
            wildtext[0] = new JLabel("|wild "+pokemon1.getnameP()+" | level : " + pokemon1.getlevel()+" | HP : "+pokemon1.getHP()+" |");
            wildbotton[0] = new JButton("Battle");
        }
        else if(i == 1){
            pokemon2.poke(wildpoke,level+1);
            wildtext[1] = new JLabel("|wild "+pokemon2.getnameP()+" | level : " + pokemon2.getlevel()+" | HP : "+pokemon2.getHP()+" |");
            wildbotton[1] = new JButton("Battle");
        }
        else if(i == 2){
            pokemon3.poke(wildpoke,level+1);
            wildtext[2] = new JLabel("|wild "+pokemon3.getnameP()+" | level : " + pokemon3.getlevel()+" | HP : "+pokemon3.getHP()+" |");
            wildbotton[2] = new JButton("Battle");
        }
    }
    
    Box[] wildbox = new Box[3];
    for(int i=0; i<3; i++){
        wildbox[i] = Box.createVerticalBox();
        wildbox[i].add(wildtext[i]);
        wildbox[i].add(Box.createVerticalStrut(20));
        wildbox[i].add(wildbotton[i]);
        addItem(panel1, wildbox[i], i, 0, 1, 1, GridBagConstraints.CENTER);
    }
    

    JButton close = new JButton("Back");

                                                        
    addItem(panel1, close, 2, 4, 1, 1, GridBagConstraints.CENTER);

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
        gc.fill = GridBagConstraints.CENTER;
        p.add(c, gc);
    }
}