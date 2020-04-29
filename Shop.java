import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; 

public class Shop extends JFrame{
    private Trainer trainer;
    
    public Shop(Trainer trainer){

    super("Pokemon Forest");
    this.trainer = trainer;

    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridBagLayout());


    JButton buypokeball = new JButton("Buy");
    JButton buypotion = new JButton("Buy");
    JButton buyultraball = new JButton("Sold Out");

    JLabel pokeball = new JLabel("PokeBall");
    JLabel GB30 = new JLabel("30 GB");

    JLabel potion = new JLabel("Potion");
    JLabel GB15 = new JLabel("15 GB");

    JLabel ultraball = new JLabel("UltraBall");
    JLabel GB100 = new JLabel("100 GB");

    Box[] shopbox = new Box[3];
    for(int i=0; i<3; i++){
        shopbox[i] = Box.createVerticalBox();
        if(i==0){
            shopbox[i].add(pokeball);
            shopbox[i].add(Box.createVerticalStrut(20));
            shopbox[i].add(GB30);
            shopbox[i].add(Box.createVerticalStrut(70));
            shopbox[i].add(buypokeball);
        }
        else if(i==1){
            shopbox[i].add(potion);
            shopbox[i].add(Box.createVerticalStrut(20));
            shopbox[i].add(GB15);
            shopbox[i].add(Box.createVerticalStrut(70));
            shopbox[i].add(buypotion);
        }    
        else if(i==2){
            shopbox[i].add(ultraball);
            shopbox[i].add(Box.createVerticalStrut(20));
            shopbox[i].add(GB100);
            shopbox[i].add(Box.createVerticalStrut(70));
            shopbox[i].add(buyultraball);
        } 
        addItem(panel1, shopbox[i], i, 0, 1, 1, GridBagConstraints.CENTER);
    }
    
    JLabel GBs = new JLabel("GB : "+trainer.returnGB());
    JButton close = new JButton("Back");                                                 

    Box buttonBox = Box.createHorizontalBox();
        buttonBox.add(GBs);
        buttonBox.add(Box.createHorizontalStrut(20));
        buttonBox.add(close);
        addItem(panel1, buttonBox, 2, 4, 1, 1, GridBagConstraints.CENTER);

    buypokeball.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            if(trainer.returnGB() >= 30){
                trainer.payGB(30);
                trainer.buypokeball();
                MainGame maingame = new MainGame(trainer);
                maingame.setVisible(true);
                setVisible(false);
            }
    }});

    buypotion.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            if(trainer.returnGB() >= 15){
                trainer.payGB(15);
                trainer.addpotion();
                MainGame maingame = new MainGame(trainer);
                maingame.setVisible(true);
                setVisible(false);
            } 
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