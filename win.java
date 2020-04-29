import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class win extends JFrame{
    private Trainer trainer;
    
    public win(Trainer trainer,Pokemon wildpokemon){
        super("Pokemon Win");
        this.trainer = trainer;
        int exp = 12*wildpokemon.getlevel();
        Random rand = new Random();
        int GB = rand.nextInt(10);
        int ball = trainer.getpokeball();
        trainer.GetGB(GB);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());

        JLabel Pokeball = new JLabel("Pokeball : "+ball);
        JButton Catch = new JButton("Catch");
        JButton leave = new JButton("leave");  

        JLabel Text1 = new JLabel("You Win");
        JLabel Text2 = new JLabel("EXP  +"+exp);
        JLabel Text3 = new JLabel("GB  +"+(10 + GB));

        Box textbox = Box.createVerticalBox();
        textbox.add(Text1);
        textbox.add(Box.createVerticalStrut(50));
        textbox.add(Text2);
        textbox.add(Box.createVerticalStrut(20));
        textbox.add(Text3);

        Box buttonBox = Box.createHorizontalBox();
        buttonBox.add(Catch);
        buttonBox.add(Box.createHorizontalStrut(20));
        buttonBox.add(leave);

        Box Boxs = Box.createVerticalBox();
        Boxs.add(Pokeball);
        Boxs.add(Box.createHorizontalStrut(20));
        Boxs.add(buttonBox);
        Pokeball.setAlignmentX(JButton.CENTER_ALIGNMENT);
        addItem(panel1, Boxs, 1, 4, 1, 1, GridBagConstraints.CENTER);
        addItem(panel1, textbox, 1, 0, 1, 1, GridBagConstraints.CENTER);

        Catch.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                if(trainer.getpokeball() > 0){
                trainer.usepokeball();
                Catch catchP = new Catch(trainer,wildpokemon);
                catchP.setVisible(true);
                setVisible(false);
                }
            }});
        
        leave.addActionListener(new ActionListener(){  
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