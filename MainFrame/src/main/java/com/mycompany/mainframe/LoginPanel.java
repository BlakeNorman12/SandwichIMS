/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author bnorm
 * 
 * This is the login screen for our application. The purpose is to validate users 
 * prior to allowing them to perform any functions within the system.
 * 
 */

//TODO:
//Add text fields for username and password
//Add login functionality. Verify with the database that the user is a valid user
//Beautify the GUI
//Make sure the user is notified when login is failed or successful. Use a JPane to display a message

public class LoginPanel extends JPanel {
    
    private MainFrame mainFrame;
    
    public LoginPanel(MainFrame mainFrame) {
        
        this.mainFrame = mainFrame;
        setLayout(new FlowLayout());
        
        //Frame Components
        
        JLabel label = new JLabel("Login");
        JButton loginButton = new JButton("Login");
        
        loginButton.addActionListener(e -> {
            
            System.out.println("Login clicked. Navigating to main menu.");
            mainFrame.navigateTo("MainMenu");
            
                });
        
        add(label);
        add(loginButton);
    }
}