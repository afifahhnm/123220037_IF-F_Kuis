/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220037;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class halamanLogin extends JFrame implements ActionListener{
    JLabel tulisan = new JLabel (" Selamat Datang di halaman Login ");
    JLabel labelUsername = new JLabel (" Username ");
    JLabel labelPassword = new JLabel (" Password ");
    JTextField inputUsername = new JTextField ();
    JTextField inputPassword = new JTextField ();
    JButton tombolLogin = new JButton(" Login ");
    
    halamanLogin(){
    
        setTitle(" Halaman Login");
        setSize(720, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
    
        add(tulisan);
        add(labelUsername);
        add(labelPassword);
        add(inputUsername);
        add(inputPassword);
        add(tombolLogin);
        
        tulisan.setBounds(30,60, 600, 24);
        labelUsername.setBounds(30,120, 600, 24);
        labelPassword.setBounds(30,160, 500, 24);
        inputUsername.setBounds(100,120, 500, 24);
        inputPassword.setBounds(100,160, 500, 24);
        
        tombolLogin.setBounds(30, 200,600, 32);
        tombolLogin.setBackground(Color.WHITE);
        
        tombolLogin.addActionListener(this);
    
        setVisible(true);
  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       try{
           String Username = inputUsername.getText();
           String Password = inputPassword.getText();
           
           if(Username.isEmpty()){
           throw new Exception (" Username Masih Kosong ");
           }
           
           new halamanUtama(Username, Password);
           this.dispose();
           
       }catch(Exception Error){
           JOptionPane.showMessageDialog(this, Error.getMessage());
       }
    }

}
