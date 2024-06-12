/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220037;

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
public class halamanPembelian2 extends JFrame implements ActionListener{
    JLabel tulisan3 = new JLabel (" Halaman Pembelian ");
    JLabel labelKategori = new JLabel (" Kategori ");
    JLabel labelHarga = new JLabel (" Harga ");
    JLabel labelJumlah = new JLabel (" Jumlah ");
    JLabel labeltotalharga = new JLabel (" Total harga ");
    JLabel labeltotalbeli = new JLabel (" total pembelian");
    JTextField kategori = new JTextField ();
    JTextField harga = new JTextField ();
    JTextField jumlah = new JTextField ();
    JButton kembali  = new JButton(" Kembali");
    JButton beli  = new JButton(" Beli");

    halamanPembelian2(){
        setTitle(" Halaman Pembelian");
        setSize(720, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(tulisan3);
        add(labelKategori);
        add(labelHarga);
        add(labelJumlah);
        add(labeltotalharga);
        add(labeltotalbeli);
        add(kategori);
        add(harga);
        add(jumlah);
        add(kembali);
        add(beli);
        
        kategori.setText("Majalah Remaja");
        tulisan3.setBounds(30,60, 600, 24);
        labelKategori.setBounds(100,100, 600, 24);
        labelHarga.setBounds(30,130, 600, 24);
        labelJumlah.setBounds(100,170, 600, 24);
        labeltotalharga.setBounds(30,200, 600, 24);
        labeltotalbeli.setBounds(30,250, 600, 24);
        kategori.setBounds(100,300, 600, 24);
        jumlah.setBounds(30,350, 600, 24);
        kembali.setBounds(30,370, 600, 24);
        beli.setBounds(100,390, 600, 24);

        tulisan3.setFont(new Font("Arial", Font.BOLD, 17));
        labelKategori.setFont(new Font("Arial", Font.BOLD, 17));
        labelHarga.setFont(new Font("Arial", Font.BOLD, 17));
        labelJumlah.setFont(new Font("Arial", Font.BOLD, 17));
        labeltotalharga.setFont(new Font("Arial", Font.BOLD, 17));
        labeltotalbeli.setFont(new Font("Arial", Font.BOLD, 17));
        kategori.setFont(new Font("Arial", Font.BOLD, 17));
        jumlah.setFont(new Font("Arial", Font.BOLD, 17));
        kembali.setFont(new Font("Arial", Font.BOLD, 17));
        beli.setFont(new Font("Arial", Font.BOLD, 17));
        
        kembali.addActionListener(this);
        beli.addActionListener(this);
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()== kembali){
            new halamanLogin();
       
    }
  
    }
}
