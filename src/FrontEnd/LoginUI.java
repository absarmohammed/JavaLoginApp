package src.FrontEnd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame {

    private JTextField Name;
    private JPasswordField Password;
    private JButton Login;

    public LoginUI() {

        // Set frame properties
        setTitle("Login UI");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Username Label
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 50, 100, 30);
        add(usernameLabel);

        // Username TextField
        Name = new JTextField();
        Name.setBounds(150, 50, 200, 30);
        add(Name);

        // Password Label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        add(passwordLabel);

        // Password Field
        Password = new JPasswordField();
        Password.setBounds(150, 100, 200, 30);
        add(Password);

        // Login Button
        Login = new JButton("Login");
        Login.setBounds(150, 150, 100, 30);
        add(Login);

        // Add Action Listener to Login Button
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = Name.getText();
                String password = new String(Password.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }

                System.out.println("Username: " + username + " Password: " + password);
            }
        });

        // Center the frame on the screen
        setLocationRelativeTo(null);
    }
}
