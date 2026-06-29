package view;

import javax.swing.*;
import java.awt.*;

public class SignupFrame extends JFrame {

    private JButton buttonBack;
    private JLabel labelTitle;
    private JLabel labelUsername;
    private JTextField textUsername;
    private JLabel labelPassword;
    private JPasswordField textPassword;
    private JLabel labelConfirmPassword;
    private JPasswordField textConfirmPassword;
    private JButton buttonCreateAccount;
    private JLabel labelFooter;


    public SignupFrame(){
        setTitle("Morsi - Sign Up");
        setSize(400,600);
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

        //title


        // text+password
    }




}
