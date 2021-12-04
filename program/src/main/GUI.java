import Account.*;
import AnalysisAndRec.Analyses;
import DateAndObject.DateAndExercise;
import DateAndObject.DateAndFood;
import Exercise.*;
import Food.Food;
import Food.ManageFood;
import OtherObjects.ModDate;
import static javax.swing.JOptionPane.showMessageDialog;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class GUI {
    //set current account to be empty
    ManageAccount accman= new ManageAccount();
    ManageFood foodman= new ManageFood();
    ManageExercise exman = new ManageExercise();
    Analyses ana = new Analyses();

    Account current_account= accman.creatEmptyAcc();
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
        JPanel Logpanel = new JPanel(null);



        //sign up panel
        JPanel SignPanel = new JPanel(null);
        //SignPanel.setBorder(BorderFactory.createEmptyBorder(30,30,50,50));
        //SignPanel.setLayout(new GridLayout(0,1));

        //main menu panel
        JPanel MainMenuPanel= new JPanel(null);

        //account info panel
        JPanel AccInfoPanel =new JPanel(null);

        //Food.Food Panel
        JPanel FoodPanel= new JPanel(null);

        //exercise panel
        JPanel exPanel= new JPanel(null);
        //analysis and recommend penal
        JPanel aandrPanel= new JPanel(null);


        //sign up switch button
        JButton SignUpSwitch = new JButton("Create Account");
        SignUpSwitch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(SignPanel);
            }
        });
        SignUpSwitch.setBounds(10,200,150,25);
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
        LoginSwitch.setBounds(10,200,200,25);
        SignPanel.add(LoginSwitch);
        //////////////////////////////////////////

        //*********************************************************
        //*********************************************************
        //Sign up input
        JLabel userLabel = new JLabel("User Name");
        userLabel.setBounds(10,20,80,25);
        SignPanel.add(userLabel);
        /////////////////////////////////////////////
        JTextField CreateUserText= new JTextField(20);
        CreateUserText.setBounds(10,50,100,25);
        SignPanel.add(CreateUserText);
        //////////////////////////////////////////////////
        JLabel passLabel= new JLabel("Password");
        passLabel.setBounds(10,100,80,50);
        SignPanel.add(passLabel);
        //////////////////////////////////////////////////
        JPasswordField CreatePassField = new JPasswordField();
        //CreatePassField.setBounds(10,200,80,60);
        CreatePassField.setBounds(10,140,100,25);
        SignPanel.add(CreatePassField);
        /////////////////////////////////////////////
        JButton SaveAccount = new JButton("Register");
        SaveAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username= CreateUserText.getText();
                String passward = CreatePassField.getText();

                try {
                    if (accman.scan_has_account(username)){
                        showMessageDialog(null,"User already exists!");}
                    else{
                        //current_account=accman.creatEmptyAcc();
                        current_account.setUsername(username);
                        current_account.setPassword(passward);
                        current_account.register();
                        showMessageDialog(null,"Success!");
                        switchPanel(MainMenuPanel);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        SaveAccount.setBounds(10,230,150,25);
        SignPanel.add(SaveAccount);
        //*********************************************************
        //*********************************************************
        //Login panel
        JLabel LoguserLabel = new JLabel("User Name");
        LoguserLabel.setBounds(10,20,80,25);
        Logpanel.add(LoguserLabel);
        /////////////////////////////////////////////////////
        JLabel LogpassLabel= new JLabel("Password");
        LogpassLabel.setBounds(10,100,80,50);
        Logpanel.add(LogpassLabel);
        ///////////////////////////////////////////////////
        JTextField LogUserText= new JTextField(20);
        LogUserText.setBounds(10,50,100,25);
        Logpanel.add(LogUserText);
        //////////////////////////////////////////////////////////
        JPasswordField LogPassField = new JPasswordField();
        LogPassField.setBounds(10,140,100,25);
        Logpanel.add(LogPassField);
        ////////////////////////////////////////////////////////
        JButton LogInButton = new JButton("Login");
        LogInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user=LogUserText.getText();
                String pass =LogPassField.getText();
                try {
                    if(accman.login(user,pass)){
                        current_account.setUsername(user);
                        current_account.setPassword(pass);
                        current_account.FillInfo();
                        showMessageDialog(null,"Success!");
                        switchPanel(MainMenuPanel);
                    }
                    else{
                        showMessageDialog(null,"Wrong username or password.");
                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }



            }
        });
        LogInButton.setBounds(10,230,150,25);
        Logpanel.add(LogInButton);
        //*********************************************************
        //*********************************************************
        //Main menu
        JLabel MenuTitle = new JLabel("Main Menu");
        MenuTitle.setBounds(470,10,200,100);
        MainMenuPanel.add(MenuTitle);
        //////////////////////////////////////////////////
        JButton SwitchAccount = new JButton("Switch Account");
        SwitchAccount.setBounds(300,80,400,50);
        SwitchAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //set current account to empty
                current_account=accman.creatEmptyAcc();
                switchPanel(Logpanel);
            }
        });
        MainMenuPanel.add(SwitchAccount);
        ///////////////////////////////////////////////////////////////////
        JButton GoToFood = new JButton("Food");
        GoToFood.setBounds(300,160,400,50);
        GoToFood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(FoodPanel);
            }
        });
        MainMenuPanel.add(GoToFood);
        ///////////////////////////////////////////////////////////////////////
        JButton GoToExercise = new JButton("Exercise");
        GoToExercise.setBounds(300,240,400,50);
        GoToExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switchPanel(exPanel);
            }
        });
        MainMenuPanel.add(GoToExercise);
        ////////////////////////////////////////////////////////////////////////
        JButton GoToAccInfo = new JButton("Account Info");
        GoToAccInfo.setBounds(300,320,400,50);
        GoToAccInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(AccInfoPanel);
            }
        });
        MainMenuPanel.add(GoToAccInfo);
        ///////////////////////////////////////////////////////////////////////
        JButton SaveButton = new JButton("Save");
        SaveButton.setBounds(300,400,400,50);
        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    current_account.register();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        MainMenuPanel.add(SaveButton);
        ///////////////////////////////////////////////////////////////////////
        JTextArea Savewarning = new JTextArea("""
                Warning: Always save before\s
                you close the application.\s
                Anything unsaved will be lost.""");
        Savewarning.setBounds(750,400,200,55);
        Savewarning.setEditable(false);
        MainMenuPanel.add(Savewarning);
        ///////////////////////////////////////////////////////////////////////
        JButton gotoarButton = new JButton("Analysis and Recommendation");
        gotoarButton.setBounds(300,480,400,50);
        gotoarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(aandrPanel);
            }
        });
        MainMenuPanel.add(gotoarButton);
        //*********************************************************
        //*********************************************************
        //account info panel
        JLabel AccInfoTitle = new JLabel("Account Info");
        AccInfoTitle.setBounds(470,10,200,100);
        AccInfoPanel.add(AccInfoTitle);
        /////////////////////////////////////////////////////////////////////
        JLabel lblSetGender = new JLabel("Set Gender");
        lblSetGender.setBounds(360,60,200,100);
        AccInfoPanel.add(lblSetGender);
        ///////////////////////////////////////////////////////////////////
        JLabel lblSetBirth = new JLabel("Set Birthday(year/month/day)");
        lblSetBirth.setBounds(360,100,200,100);
        AccInfoPanel.add(lblSetBirth);
        ////////////////////////////////////////////////////////////////
        JLabel lblSetWeight = new JLabel("Set Weight(kg)");
        lblSetWeight.setBounds(360,140,200,100);
        AccInfoPanel.add(lblSetWeight);
        ////////////////////////////////////////////////////////////////
        JButton SetMale = new JButton("Male");
        SetMale.setBounds(480,100,100,20);
        SetMale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                current_account.setGender("m");
            }
        });
        AccInfoPanel.add(SetMale);
        /////////////////////////////////////////////////////////////
        JButton SetFemale = new JButton("Female");
        SetFemale.setBounds(600,100,100,20);
        SetFemale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                current_account.setGender("f");
            }
        });
        AccInfoPanel.add(SetFemale);
        ///////////////////////////////////////////////////////////
        JTextField byearText = new JTextField();
        byearText.setBounds(540,140,60,20);
        AccInfoPanel.add(byearText);
        ///////////////////////////////////////////////////////
        JTextField bmonthText = new JTextField();
        bmonthText.setBounds(605,140,60,20);
        AccInfoPanel.add(bmonthText);
        ///////////////////////////////////////////////////////
        JTextField bdayText = new JTextField();
        bdayText.setBounds(670,140,60,20);
        AccInfoPanel.add(bdayText);
        ///////////////////////////////////////////////////////
        JButton SetBirth = new JButton("Set");
        SetBirth.setBounds(735,140,100,20);
        SetBirth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accman.isInt(byearText.getText())&accman.isInt(bmonthText.getText())
                &accman.isInt(bdayText.getText())){
                    ModDate birth = new ModDate(Integer.parseInt(byearText.getText()),
                            Integer.parseInt(bmonthText.getText()),
                            Integer.parseInt(bdayText.getText()));
                    current_account.setBirthday(birth);
                    showMessageDialog(null,"Success!");
                }
                else{showMessageDialog(null,"Input must be integers.");}

            }
        });
        AccInfoPanel.add(SetBirth);
        /////////////////////////////////////////////////////////
        JTextField weightText = new JTextField();
        weightText.setBounds(450,180,90,20);
        AccInfoPanel.add(weightText);
        /////////////////////////////////////////////////////////
        JButton SetWeight = new JButton("Set");
        SetWeight.setBounds(535,180,100,20);
        SetWeight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(accman.isDouble(weightText.getText())){

                    current_account.setWeight(Double.parseDouble(weightText.getText()));
                    showMessageDialog(null,"Success!");
                }
                else{showMessageDialog(null,"Input must be a double.");}

            }
        });
        AccInfoPanel.add(SetWeight);
        /////////////////////////////////////////////////////////
        JButton BackMenuAccInfo = new JButton("Menu");
        BackMenuAccInfo.setBounds(360,400,100,30);
        BackMenuAccInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(MainMenuPanel);
            }
        });
        AccInfoPanel.add(BackMenuAccInfo);
        //////////////////////////////////////////////////////////
        //*********************************************************
        //*********************************************************
        //Food.Food panel
        JLabel FoodpanelTitle = new JLabel("Food");
        FoodpanelTitle.setBounds(470,10,200,100);
        FoodPanel.add(FoodpanelTitle);
        ///////////////////////////////////////////////////////////
        JLabel lblDate = new JLabel("Date(y/m/d):");
        lblDate.setBounds(360,60,200,100);
        FoodPanel.add(lblDate);
        ///////////////////////////////////////////////////////////
        JTextField foodyText = new JTextField();
        foodyText.setBounds(450,100,60,20);
        FoodPanel.add(foodyText);
        /////////////////////////////////////////////////////////
        JTextField foodmText = new JTextField();
        foodmText.setBounds(515,100,60,20);
        FoodPanel.add(foodmText);
        /////////////////////////////////////////////////////////
        JTextField fooddText = new JTextField();
        fooddText.setBounds(575,100,60,20);
        FoodPanel.add(fooddText);
        /////////////////////////////////////////////////////////
        JButton BackMenuFood = new JButton("Menu");
        BackMenuFood.setBounds(360,400,100,30);
        BackMenuFood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(MainMenuPanel);
            }
        });
        FoodPanel.add(BackMenuFood);
        ///////////////////////////////////////////////////////////
//        JButton AddDate = new JButton("Add");
//        AddDate.setBounds(520,100,70,20);
//        AddDate.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//        FoodPanel.add(AddDate);
        ///////////////////////////////////////////////////////////
        JLabel lblFood = new JLabel("Enter Food:");
        lblFood.setBounds(360,100,200,100);
        FoodPanel.add(lblFood);
        /////////////////////////////////////////////////////////////
        JTextField FoodText = new JTextField();
        FoodText.setBounds(450,140,120,20);
        FoodPanel.add(FoodText);
        ////////////////////////////////////////////////////////////////
        JTextField foodWeightText = new JTextField();
        foodWeightText.setBounds(500,180,120,20);
        FoodPanel.add(foodWeightText);
        ////////////////////////////////////////////////////////////
        JButton AddFood = new JButton("Add");
        AddFood.setBounds(580,140,70,20);
        AddFood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String y= foodyText.getText();
                String m = foodmText.getText();
                String d= fooddText.getText();
                String w= foodWeightText.getText();
                String food= FoodText.getText();
                if(accman.isInt(y)&accman.isInt(m)&accman.isInt(d)&accman.isDouble(w)){
                    try {
                        if(foodman.has_food(food)){
                           DateAndFood entry =  new DateAndFood(new ModDate(Integer.parseInt(y),
                                   Integer.parseInt(m),Integer.parseInt(d)),
                                   new Food(food,Double.parseDouble(w))
                                   );

                           current_account.getFood_record().add(entry);
                            showMessageDialog(null,"Success");
                        }
                        else{showMessageDialog(null,"Invalid food name." +
                                "You can use search to find the correct name.");}
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }


                }
                else{showMessageDialog(null,"Invalid Input. Date must " +
                        "be integers and weight must be a double.");}
            }
        });
        FoodPanel.add(AddFood);


        ////////////////////////////////////////////////////////////////
        JButton SearchFood = new JButton("Search");
        SearchFood.setBounds(660,140,90,20);
        SearchFood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });
        FoodPanel.add(SearchFood);
        ///////////////////////////////////////////////////////////////
        JLabel lblWeight = new JLabel("Enter Food Weight(g):");
        lblWeight.setBounds(360,140,200,100);
        FoodPanel.add(lblWeight);
        /////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////
        JButton deleteFood = new JButton("Delete");
        deleteFood.setBounds(760,140,90,20);
        deleteFood.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String y= foodyText.getText();
                String m = foodmText.getText();
                String d= fooddText.getText();
                String w= foodWeightText.getText();
                String food= FoodText.getText();
                if(accman.isInt(y)&accman.isInt(m)&accman.isInt(d)&accman.isDouble(w)){
                    try {
                        if(foodman.has_food(food)){
                            DateAndFood entry =  new DateAndFood(new ModDate(Integer.parseInt(y),
                                    Integer.parseInt(m),Integer.parseInt(d)),
                                    new Food(food,Double.parseDouble(w))
                            );
                            boolean food_in_list = false;
                            for(DateAndFood i:current_account.getFood_record()){
                                if(entry.isEqual(i)){
                                    food_in_list=true;
                                    entry=i;
                                }
                            }
                            if(food_in_list) {
                                current_account.getFood_record().remove(entry);
                                showMessageDialog(null, "Success");
                            }else{showMessageDialog(null, "Entry does not exist " +
                                    "in database");}
                        }
                        else{showMessageDialog(null,"Invalid food name." +
                                "You can use search to find the correct name.");}
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }


                }
                else{showMessageDialog(null,"Invalid Input. Date must " +
                        "be integers and weight must be a double.");}
            }

        });
        FoodPanel.add(deleteFood);
        //*********************************************************
        //*********************************************************
        //exercise panel
        JLabel expanelTitle = new JLabel("Exercise");
        expanelTitle.setBounds(470,10,200,100);
        exPanel.add(expanelTitle);
        ///////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////
        JLabel lblexDate = new JLabel("Date:");
        lblexDate.setBounds(360,60,200,100);
        exPanel.add(lblexDate);
        ///////////////////////////////////////////////////////////
        JTextField exyText = new JTextField();
        exyText.setBounds(400,100,60,20);
        exPanel.add(exyText);
        /////////////////////////////////////////////////////////
        JTextField exmText = new JTextField();
        exmText.setBounds(465,100,60,20);
        exPanel.add(exmText);
        /////////////////////////////////////////////////////////
        JTextField exdText = new JTextField();
        exdText.setBounds(525,100,60,20);
        exPanel.add(exdText);
        /////////////////////////////////////////////////////////
        JButton BackMenuex = new JButton("Menu");
        BackMenuex.setBounds(360,400,100,30);
        BackMenuex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(MainMenuPanel);
            }
        });
        exPanel.add(BackMenuex);
        /////////////////////////////////////////////////////////
        JLabel lblex = new JLabel("Enter Exercise:");
        lblex.setBounds(360,100,200,100);
        exPanel.add(lblex);
        /////////////////////////////////////////////////////////////
        JTextField exerciseText = new JTextField();
        exerciseText.setBounds(455,140,120,20);
        exPanel.add(exerciseText);
        /////////////////////////////////////////////////////////////
        JTextField extimeText = new JTextField();
        extimeText.setBounds(530,180,120,20);
        exPanel.add(extimeText);
        ////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        JButton Addex = new JButton("Add");
        Addex.setBounds(580,140,70,20);
        Addex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String y= exyText.getText();
                String m = exmText.getText();
                String d= exdText.getText();
                String t= extimeText.getText();
                String exc= exerciseText.getText();
                if(accman.isInt(y)&accman.isInt(m)&accman.isInt(d)&accman.isDouble(t)){
                    try {
                        if(exman.hasExercise(exc)){
                            DateAndExercise entry =  new DateAndExercise(new ModDate(Integer.parseInt(y),
                                    Integer.parseInt(m),Integer.parseInt(d)),
                                    new Exercise(exc,Double.parseDouble(t))
                            );

                            current_account.getExercise_record().add(entry);
                            showMessageDialog(null,"Success");
                        }
                        else{showMessageDialog(null,"Invalid exercise name." +
                                "You can use search to find the correct name.");}
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }


                }
                else{showMessageDialog(null,"Invalid Input. Date must " +
                        "be integers and time must be a double.");}

            }
        });
        exPanel.add(Addex);
        ////////////////////////////////////////////////////////////////
        JButton Searchex = new JButton("Search");
        Searchex.setBounds(660,140,90,20);
        Searchex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });
        exPanel.add(Searchex);
        ///////////////////////////////////////////////////////////////
        JLabel exlblWeight = new JLabel("Exercise Duration(Minutes):");
        exlblWeight.setBounds(360,140,200,100);
        exPanel.add(exlblWeight);
        /////////////////////////////////////////////////////////////

        JButton deleteex = new JButton("Delete");
        deleteex.setBounds(760,140,90,20);
        deleteex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String y= exyText.getText();
                String m = exmText.getText();
                String d= exdText.getText();
                String t= extimeText.getText();
                String exc= exerciseText.getText();
                if(accman.isInt(y)&accman.isInt(m)&accman.isInt(d)&accman.isDouble(t)){
                    try {
                        if(exman.hasExercise(exc)){
                            DateAndExercise entry =  new DateAndExercise(new ModDate(Integer.parseInt(y),
                                    Integer.parseInt(m),Integer.parseInt(d)),
                                    new Exercise(exc,Double.parseDouble(t))
                            );

                            boolean ex_in_list = false;
                            for(DateAndExercise i:current_account.getExercise_record()){
                                if(entry.isEqual(i)){
                                    ex_in_list=true;
                                    entry=i;
                                }
                            }
                            if(ex_in_list) {
                                current_account.getExercise_record().remove(entry);
                                showMessageDialog(null, "Success");
                            }else{showMessageDialog(null, "Entry does not exist " +
                                    "in database");}
                        }
                        else{showMessageDialog(null,"Invalid exercise name." +
                                "You can use search to find the correct name.");}
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }


                }
                else{showMessageDialog(null,"Invalid Input. Date must " +
                        "be integers and time must be a double.");}
            }
        });
        exPanel.add(deleteex);
        //*********************************************************
        //*********************************************************
        //a and r panel
        JLabel aandrTitle = new JLabel("Analysis and Recommendation");
        aandrTitle.setBounds(470,1,200,100);
        aandrPanel.add(aandrTitle);
        /////////////////////////////////////////////////////////////
        JButton BackMenuar = new JButton("Menu");
        BackMenuar.setBounds(360,500,100,30);
        BackMenuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchPanel(MainMenuPanel);
            }
        });
        aandrPanel.add(BackMenuar);
        /////////////////////////////////////////////////////////////
        JTextArea rectxt= new JTextArea();
        rectxt.setBounds(260,130,200,300);
        rectxt.setEditable(false);
        aandrPanel.add(rectxt);
        /////////////////////////////////////////////////////////////
        JTextArea anatxt= new JTextArea();
        anatxt.setBounds(660,130,200,200);
        anatxt.setEditable(false);
        JScrollPane anascroll = new JScrollPane(anatxt);
        anascroll.setBounds(610,130,350,200);
        aandrPanel.add(anascroll);
        /////////////////////////////////////////////////////////////
        JTextArea dateanatxt= new JTextArea();
        dateanatxt.setBounds(660,350,200,180);
        dateanatxt.setEditable(false);
        aandrPanel.add(dateanatxt);
        /////////////////////////////////////////////////////////////
        JButton btnrecom = new JButton("Recommendation");
        btnrecom.setBounds(260,70,200,30);
        aandrPanel.add(btnrecom);
        /////////////////////////////////////////////////////////////
        JButton btnAnalysis = new JButton("Analysis");
        btnAnalysis.setBounds(660,70,200,30);
        btnAnalysis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    anatxt.setText(ana.foodrectoString(current_account));
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
        aandrPanel.add(btnAnalysis);
        //*********************************************************
        //*********************************************************
        frame.add(Logpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Fitness");
        frame.setSize(1000,600);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
}