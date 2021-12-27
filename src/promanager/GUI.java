package promanager;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GUI extends JPanel implements ActionListener {
    
    private JButton NewWebBTN = new JButton();
    private JButton NewAppBTN = new JButton();
    private JButton NewGameBTN = new JButton();
    private JButton NewProjectsBTN = new JButton();
    private JButton NewHelpBTN = new JButton();
    
    private JPanel buttonPanel, displayPanel, contentPanel;
    private final Scanner scanner = new Scanner(System.in);
    
    List<Website> webProj = new ArrayList<Website>(); //[Website, Website, Website]
    List<Game> gameProj = new ArrayList<Game>(); //[Game, Game, Game]
    List<App> appProj = new ArrayList<App>(); //[App, App, App]
    
    GUI(){
        //Main content Panel
        contentPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        contentPanel.setOpaque(true);

        //Create button panel
        buttonPanel = new JPanel(new GridLayout(2, 1));
        buttonPanel.setPreferredSize(new Dimension(100, 300));
        buttonPanel.setOpaque(true);
        
        //Create button.
        NewWebBTN = new JButton();
        NewWebBTN.addActionListener(this);
        NewWebBTN.setPreferredSize(new Dimension(100, 50));
        NewWebBTN.setText("Add Web Project");
        buttonPanel.add(NewWebBTN);
        
        //Create button
        NewAppBTN = new JButton();
        NewAppBTN.addActionListener(this);
        NewAppBTN.setPreferredSize(new Dimension(100, 50));
        NewAppBTN.setText("Add App Project");
        buttonPanel.add(NewAppBTN);
        
        //Create btton
        NewGameBTN = new JButton();
        NewGameBTN.addActionListener(this);
        NewGameBTN.setPreferredSize(new Dimension(100, 50));
        NewGameBTN.setText("Add Game Project");
        buttonPanel.add(NewGameBTN);
        
        //Create button
        NewProjectsBTN = new JButton();
        NewProjectsBTN.addActionListener(this);
        NewProjectsBTN.setPreferredSize(new Dimension(100, 50));
        NewProjectsBTN.setText("View");
        buttonPanel.add(NewProjectsBTN);

        //Create button
        NewHelpBTN = new JButton();
        NewHelpBTN.addActionListener(this);
        NewHelpBTN.setPreferredSize(new Dimension(100, 50));
        NewHelpBTN.setText("Help");
        buttonPanel.add(NewHelpBTN);
        
        //Will display the images once added to the order
        displayPanel = new JPanel(new GridLayout(3,1,10,10));
        displayPanel.setPreferredSize(new Dimension(300, 540));
        displayPanel.setOpaque(true);
      
        //Add all panels to main containter panel and add that to the window  
        contentPanel.add(buttonPanel);
        contentPanel.add(displayPanel);
        this.add(contentPanel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(NewWebBTN)) {
            if (this.webProj.size() < 10) {
            addWeb();                
            } else {
             System.out.println("Max websites reached."); 
            }
        }
        if(e.getSource().equals(NewGameBTN)) {
            if (this.gameProj.size() < 10) {
            addGame();                
            } else {
             System.out.println("Max games reached."); 
            }
        }
        if(e.getSource().equals(NewAppBTN)) {
            if (this.appProj.size() < 10) {
            addApp();                
            } else {
             System.out.println("Max apps reached."); 
            }
        }
        if(e.getSource().equals(NewProjectsBTN)) {
        
            if (webProj.isEmpty()){
                System.out.println("No websites available");
            } else {
                for (Website website : webProj) {
                    System.out.println("Name: " + website.getName() + " Deadline: " + website.getDeadline() + " Client: " + website.getClient() + " Price: " + website.getPrice() + " Server: " + website.getServer());
                }
            }
             if (gameProj.isEmpty()){
                System.out.println("No games available");
            } else {
                for (Game game : gameProj) {
                     System.out.println("Name: " + game.getName() + " Deadline: " + game.getDeadline() + " Client: " + game.getClient() + " Price: " + game.getPrice() + " Platform: " + game.getPlatform() + " Genre: " + game.getGenre());
                }
            }           
             if (appProj.isEmpty()){
                System.out.println("No apps available");
            } else {
                for (App app : appProj) {
                  System.out.println("Name: " + app.getName() + " Deadline: " + app.getDeadline() + " Client: " + app.getClient() + " Price: " + app.getPrice() + " Type: " + app.getType());
                }
            }                 
        }
        if(e.getSource().equals(NewHelpBTN)) {
            System.out.println("This is help!");
        }
    }

    public void addWeb (){
        //Asks user for input.
        System.out.println("Name?");
        String n = scanner.next();
        
        System.out.println("Deadline?");
        String d = scanner.next();
        
        System.out.println("Client?");
        String c = scanner.next();
        
        System.out.println("Price?");        
        int p = scanner.nextInt();
        
        System.out.println("Server?");        
        String s = scanner.next();
        
        System.out.println("Number of pages?");
        int np = scanner.nextInt();
        
        //Adds user input to the array list.        
        webProj.add(new Website(n,d,c,p,s,np));
        
        //When looping through each element it would return each element.
        for (Website website : webProj) {
            System.out.println("Name: " + website.getName() + " Deadline: " + website.getDeadline() + " Client: " + website.getClient() + " Price: " + website.getPrice() + " Server: " + website.getServer());
        }
    }
        
    public void addGame (){
        //Asks the user for input
        System.out.println("Name?");
        String n = scanner.next();
        
        System.out.println("Deadline?");
        String d = scanner.next();
        
        System.out.println("Client?");
        String c = scanner.next();
        
        System.out.println("Price?");        
        int p = scanner.nextInt();
        
        System.out.println("Platform?");
        String pm = scanner.next();    

        System.out.println("Genre?");
        String g = scanner.next();   
        
        //Adds user input to the array list.        
        gameProj.add(new Game(n,d,c,p,pm,g));
        
        //When looping through each element it would return each element.
        for (Game game : gameProj) {
            System.out.println("Name: " + game.getName() + " Deadline: " + game.getDeadline() + " Client: " + game.getClient() + " Price: " + game.getPrice() + " Platform: " + game.getPlatform() + " Genre: " + game.getGenre());
        }
    }
    
    public void addApp (){
        //Asks the user for input
        System.out.println("Name?");
        String n = scanner.next();
        
        System.out.println("Deadline?");
        String d = scanner.next();
        
        System.out.println("Client?");
        String c = scanner.next();
        
        System.out.println("Price?");        
        int p = scanner.nextInt();
        System.out.println("Type?");
        String t = scanner.next();    
        
        //Adds user input to the array list.
        appProj.add(new App(n,d,c,p,t));
        
        //When looping through each appproj element. Each element would be an App class. 
        for (App app : appProj) {
            //Formatting the app project to a string then printing it
            System.out.println("Name: " + app.getName() + " Deadline: " + app.getDeadline() + " Client: " + app.getClient() + " Price: " + app.getPrice() + " Type: " + app.getType());
        }
    }
}
