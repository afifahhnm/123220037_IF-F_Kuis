/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220037;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class halamanUtama extends JFrame implements ActionListener{
    JLabel tulisan2 = new JLabel (" Selamat Datang,");
    JButton tombolmajalah1 = new JButton(" Majalah Anak ");
    JButton tombolmajalah2 = new JButton(" Majalah Remaja ");
    JButton tombolmajalah3 = new JButton(" Majalah Dewasa ");
    

    public halamanUtama(String Username, String Password) {
        
        setTitle(" Halaman Utama");
        setSize(720, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
    
        add(tulisan2);
        add(tombolmajalah1);
        add(tombolmajalah2);
        add(tombolmajalah3);
        
        tulisan2.setText("Selamat Datang," + Username);
        tulisan2.setBounds(30,60, 600, 24);
        tombolmajalah1.setBounds(30,100, 600, 24);
        tombolmajalah2.setBounds(30,150, 600, 24);
        tombolmajalah3.setBounds(30,200, 600, 24);

        tulisan2.setFont(new Font("Arial", Font.BOLD, 17));
        tombolmajalah1.setFont(new Font("Arial", Font.BOLD, 17));
        tombolmajalah2.setFont(new Font("Arial", Font.BOLD, 17));
        tombolmajalah3.setFont(new Font("Arial", Font.BOLD, 17));
        
        tombolmajalah1.setBackground(Color.WHITE);
        tombolmajalah2.setBackground(Color.WHITE);
        tombolmajalah3.setBackground(Color.WHITE);
        
        tombolmajalah1.addActionListener(this);
        tombolmajalah2.addActionListener(this);
        tombolmajalah3.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== tombolmajalah1){
           new halamanPembelian();
       }
       if(e.getSource()== tombolmajalah2){
           new halamanPembelian2();
       }
      if(e.getSource()== tombolmajalah3){
           new halamanPembelian3();
       }
       this.dispose();
    }
  }
    
