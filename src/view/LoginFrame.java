package view;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    // login frame look, simplified
    private JLabel labelTitle;
    private JButton buttonBack;

    private JLabel labelUsername;
    private JTextField textUsername;

    private JLabel labelPassword;
    private JTextField textPassword;

    private JButton buttonSignIn;
    private JButton buttonCreateAccount;

    private JLabel labelFooter;

    public LoginFrame(){
        setTitle("Morsi - Login");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonBack = new JButton("BACK");
        buttonBack.setFocusable(false);
        topPanel.add(buttonBack);
        add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8,10,8,10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        labelTitle = new JLabel("MORSI", JLabel.CENTER);
        labelTitle.setFont(new Font("Arial", Font.BOLD, 36));

        labelUsername = new JLabel("Username:");
        textUsername = new JTextField(15);

        labelPassword = new JLabel("Password:");
        textPassword = new JPasswordField(15);

        buttonSignIn = new JButton("SIGN IN");
        buttonSignIn.setFont(new Font("Arial", Font.BOLD, 14));
        buttonSignIn.setFocusable(false);

        buttonCreateAccount = new JButton("Create account");
        buttonCreateAccount.setBorderPainted(false);
        buttonCreateAccount.setContentAreaFilled(false);
        buttonCreateAccount.setFocusable(false);

        labelFooter = new JLabel("ALL RIGHTS RESERVED @", JLabel.CENTER);
        labelFooter.setFont(new Font("Arial", Font.ITALIC,10));

        gbc.gridx = 0;

        gbc.gridy = 0;
        centerPanel.add(labelTitle, gbc);

        gbc.gridy = 1;
        centerPanel.add(labelUsername, gbc);

        gbc.gridy = 2;
        centerPanel.add(textUsername, gbc);

        gbc.gridy = 3;
        centerPanel.add(labelPassword, gbc);

        gbc.gridy = 4;
        centerPanel.add(textPassword, gbc);

        gbc.insets = new Insets(20,10,8,10);

        gbc.gridy = 5;
        centerPanel.add(buttonSignIn, gbc);

        gbc.insets = new Insets(8,10,8,10);

        gbc.gridy = 6;
        centerPanel.add(buttonSignIn, gbc);

        gbc.gridy = 7;
        gbc.insets = new Insets(30,10,5,10);
        centerPanel.add(labelFooter, gbc);

        add(centerPanel, BorderLayout.CENTER);

    }





}
