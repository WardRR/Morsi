package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JLabel labelTitle;
    private JLabel labelSubtitle;
    private JButton buttonStart;

    public MainFrame(){

        setTitle("Morsi - Morse Code App");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);

        labelTitle = new JLabel("MORSI");
        labelTitle.setFont(new Font("Arial", Font.BOLD, 48)); // Veliki podebljani font

        labelSubtitle = new JLabel("[Text & Morse Tool]");
        labelSubtitle.setFont(new Font("Arial", Font.PLAIN, 16));

        buttonStart = new JButton("POKRENI");
        buttonStart.setFont(new Font("Arial", Font.BOLD, 18));
        buttonStart.setFocusable(false);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(labelTitle, gbc);

        gbc.gridy = 1;
        add(labelSubtitle, gbc);

        gbc.insets = new Insets(40, 10, 10, 10);
        gbc.gridy = 2;
        add(buttonStart, gbc);
    }

}
