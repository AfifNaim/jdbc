package com.d3ti.PboLanjut20.jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class JFrameContoh extends JFrame {

 /**
  * 
  */
 private static final long serialVersionUID = 1L;
 private JPanel contentPane;
 DBBiodata biodata;
 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     JFrameContoh frame = new JFrameContoh();
     frame.setVisible(true);
      System.out.println("frame berhasil;");
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the frame.
  */
 public JFrameContoh() {
  super("Biodata");
  
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 450, 300);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  contentPane.setLayout(new BorderLayout());
  setContentPane(contentPane);
  
  JScrollPane scrollPane = new JScrollPane();
  contentPane.add(scrollPane, BorderLayout.CENTER);
  scrollPane.setBounds(100,100,500,200);
  biodata = new DBBiodata();
  Vector<String> columnNames = new Vector<String>();
  columnNames.addElement("id");
  columnNames.addElement("nim");
  columnNames.addElement("nama");
  columnNames.addElement("jk");
  columnNames.addElement("tmp_lahir");
  columnNames.addElement("tgl_lahir");
  columnNames.addElement("alamat");
  
  JLabel lblNama = new JLabel("Nama");
  lblNama.setEnabled(false);
  lblNama.setBounds(0,0,50,20);
  contentPane.add(lblNama, BorderLayout.NORTH);
  JLabel lblNIM = new JLabel("NIM");
  lblNIM.setEnabled(false);
  lblNIM.setBounds(50,100,100,200);
  contentPane.add(lblNIM, BorderLayout.NORTH);
  
  JTable table = new JTable(biodata.data(), columnNames);
  DefaultTableModel dtm=new DefaultTableModel(biodata.data(),columnNames);
  table.setModel(dtm);
  scrollPane.setColumnHeaderView(table);
  
  JScrollPane scrollPane_1 = new JScrollPane();
  scrollPane.setViewportView(scrollPane_1);
  
  JScrollPane scrollPane_3 = new JScrollPane();
  scrollPane.setRowHeaderView(scrollPane_3);
  
  JScrollPane scrollPane_2 = new JScrollPane();
  contentPane.add(scrollPane_2, BorderLayout.EAST);
  
  
  
  

 }
 
 

}