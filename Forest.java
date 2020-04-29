import javax.swing.*;
import java.io.File;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.*;
import java.awt.event.*;
import java.util.*; 

public class Forest extends JFrame {
    private Trainer trainer;
    private Pokemon pokemon1 = new Pokemon();
    private Pokemon pokemon2 = new Pokemon();
    private Pokemon pokemon3 = new Pokemon();
    public Forest(Trainer trainer){

    super("Pokemon Forest");
    this.trainer = trainer;

    // Pokemon pokemon1 = new Pokemon();
    // Pokemon pokemon2 = new Pokemon();
    // Pokemon pokemon3 = new Pokemon();
    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridBagLayout());

    // JLabel[] wildimg = new JLabel[3];
    JLabel wildimg1 = new JLabel();
    JLabel wildimg2 = new JLabel();
    JLabel wildimg3 = new JLabel();
    File[] file = new File[7];
    file[0] = new File("Bulbasaur.jpg");
    file[1] = new File("Charmander.jpg");
    file[2] = new File("Squirtle.jpg");
    file[3] = new File("Pidgey.jpg");
    file[4] = new File("Magikarp.jpg");
    file[5] = new File("Eevee.jpg");
    file[6] = new File("Kabigon.jpg");
    
    BufferedImage[] img =new BufferedImage[7]; 
    
    System.out.println("+++");
    for(int i=0; i<7; i++){
    try{
    img[i] = ImageIO.read(file[i]);
    } 
    catch (IOException ex) {
        ex.printStackTrace();
    }   
    }
    


    JButton[] wildbotton = new JButton[3];
    JLabel[] wildtext = new JLabel[3];
    Random rand = new Random();
    // int wildpoke ;
    
    for(int i=0; i<3;i++){
    int level = rand.nextInt(10);
    int wildpoke = rand.nextInt(7);

        if(i == 0){
            pokemon1.poke(wildpoke,level+1);
            wildimg1.setIcon(new ImageIcon(img[wildpoke]));
            wildtext[0] = new JLabel("|wild "+pokemon1.getnameP()+" | level : " + pokemon1.getlevel()+" | HP : "+pokemon1.getHP()+" |");
            wildbotton[0] = new JButton("Battle");
        }
        else if(i == 1){
            pokemon2.poke(wildpoke,level+1);
            wildimg2.setIcon(new ImageIcon(img[wildpoke]));
            wildtext[1] = new JLabel("|wild "+pokemon2.getnameP()+" | level : " + pokemon2.getlevel()+" | HP : "+pokemon2.getHP()+" |");
            wildbotton[1] = new JButton("Battle");
        }
        else if(i == 2){
            pokemon3.poke(wildpoke,level+1);
            wildimg3.setIcon(new ImageIcon(img[wildpoke]));
            wildtext[2] = new JLabel("|wild "+pokemon3.getnameP()+" | level : " + pokemon3.getlevel()+" | HP : "+pokemon3.getHP()+" |");
            wildbotton[2] = new JButton("Battle");
        }
    }
    
    Box[] wildbox = new Box[3];
    for(int i=0; i<3; i++){
        wildbox[i] = Box.createVerticalBox();
        if(i==0)
            wildbox[i].add(wildimg1);
        else if(i==1)
            wildbox[i].add(wildimg2);
        else if(i==2)
            wildbox[i].add(wildimg3);
        wildbox[i].add(Box.createVerticalStrut(20));
        wildbox[i].add(wildtext[i]);
        wildbox[i].add(Box.createVerticalStrut(20));
        wildbox[i].add(wildbotton[i]);
        addItem(panel1, wildbox[i], i, 0, 1, 1, GridBagConstraints.CENTER);
    }
    

    JButton close = new JButton("Back");

    // addItem(panel1, wildimg1, 1, 0, 1, 1, GridBagConstraints.CENTER);                                                 
    addItem(panel1, close, 2, 4, 1, 1, GridBagConstraints.CENTER);


    wildbotton[0].addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            choosepokemon choose = new choosepokemon(trainer,pokemon1);
            choose.setVisible(true);
            setVisible(false);
        }});

        wildbotton[1].addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            choosepokemon choose = new choosepokemon(trainer,pokemon2);
            choose.setVisible(true);
            setVisible(false);
        }});

        wildbotton[2].addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            choosepokemon choose = new choosepokemon(trainer,pokemon3);
            choose.setVisible(true);
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
        gc.fill = GridBagConstraints.CENTER;
        p.add(c, gc);
    }
}