import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lost extends JFrame{
    private Trainer trainer;
    
    public lost(Trainer trainer){
        super("Pokemon Lost");
        this.trainer = trainer;

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());

        JButton back = new JButton("back");                                   
        JLabel Text = new JLabel("You Lost");

        addItem(panel1, back, 1, 4, 1, 1, GridBagConstraints.CENTER);
        addItem(panel1, Text, 1, 0, 1, 1, GridBagConstraints.CENTER);
        
        back.addActionListener(new ActionListener(){  
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