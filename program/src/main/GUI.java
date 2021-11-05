import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class GUI {

    ManageAccount AccountData = new ManageAccount();
    JFrame frame = new JFrame();

    public void switchPanel(JPanel panel){
        //frame.removeAll();
        //frame.add(panel);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.revalidate();
        frame.repaint();

    }
    public GUI(){


        //Login panel
        JPanel Logpanel = new JPanel();
        Logpanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        //Logpanel.setLayout(new GridLayout(0,1));






        //sign up panel
        JPanel SignPanel = new JPanel();
        SignPanel.setBorder(BorderFactory.createEmptyBorder(30,30,50,50));
        SignPanel.setLayout(new GridLayout(0,1));




        //sign up switch button
        JButton SignUpSwitch = new JButton("Create Account");
        SignUpSwitch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(SignPanel);
            }
        });
        SignUpSwitch.setBounds(50,200,80,25);
        Logpanel.add(SignUpSwitch);
        //////////////////////////////////////////////////
        //login switch button
        JButton LoginSwitch = new JButton("Already have account");
        LoginSwitch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(Logpanel);
            }
        });
        LoginSwitch.setBounds(50,200,80,25);
        SignPanel.add(LoginSwitch);
        //////////////////////////////////////////


        //Sign up input
        JLabel userLabel = new JLabel("User Name");
        userLabel.setBounds(10,20,80,25);
        SignPanel.add(userLabel);
        /////////////////////////////////////////////
        JTextField CreateUserText= new JTextField(20);
        CreateUserText.setBounds(10,50,80,25);
        SignPanel.add(CreateUserText);
        //////////////////////////////////////////////////
        JLabel passLabel= new JLabel("Password");
        passLabel.setBounds(10,50,80,50);
        SignPanel.add(passLabel);
        //////////////////////////////////////////////////
        JPasswordField CreatePassField = new JPasswordField();
        //CreatePassField.setBounds(10,200,80,60);
        CreatePassField.setLocation(100,100);
        SignPanel.add(CreatePassField);
        /////////////////////////////////////////////
        JButton SaveAccount = new JButton("Create account");
        SaveAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username= CreateUserText.getText();
                String passward = CreatePassField.getText();
                SimpleDateFormat time = new SimpleDateFormat("yyyy.MM.dd");
                try {
                    AccountData.add_Account(passward, username,time.parse("2020.03.06"),time.parse("2020.03.06"),"");
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

            }
        });
        SaveAccount.setBounds(50,200,80,25);
        SignPanel.add(SaveAccount);
        //frame.add(Logpanel, BorderLayout.CENTER);
        frame.add(Logpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login/Sign Up");
        frame.setSize(1000,600);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
}
