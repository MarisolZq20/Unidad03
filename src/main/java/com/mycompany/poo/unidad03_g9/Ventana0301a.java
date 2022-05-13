/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo.unidad03_g9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Ventana0301a extends JFrame {
    private final ArrayList<JPanel> jPanelList = new ArrayList<>(); 

    public Ventana0301a(String title, int w, int h)  {
        super(title);
        this.setSize(w, h);
        var p = new Point(200,150);
        this.setLocation(p);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
    }

    public Ventana0301a(int w, int h) {
        var dimension = new Dimension(w,h);
        this.setSize(dimension);
    }
    
    public void iniciarComponentes(){
        this.iniciarPaneles();
    }
    
    public void iniciarPaneles(){
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder("Panel 0"));
        this.jPanelList.get(1).setBackground(Color.BLACK);
        this.jPanelList.get(1).setBorder(BorderFactory.createTitledBorder("Panel 1"));
        this.jPanelList.get(2).setBackground(Color.GREEN);
        this.jPanelList.get(2).setBorder(BorderFactory.createTitledBorder("Panel 2"));
        this.jPanelList.get(3).setBackground(Color.RED);
        this.jPanelList.get(3).setBorder(BorderFactory.createTitledBorder("Panel 3"));
        this.jPanelList.get(4).setBackground(Color.BLUE);
        this.jPanelList.get(4).setBorder(BorderFactory.createTitledBorder("Panel 4"));
        this.jPanelList.get(5).setBackground(Color.CYAN);
        this.jPanelList.get(5).setBorder(BorderFactory.createTitledBorder("Panel 5"));
        this.jPanelList.get(6).setBackground(Color.GRAY);
        this.jPanelList.get(6).setBorder(BorderFactory.createTitledBorder("Panel 6"));
        this.jPanelList.get(7).setBackground(Color.MAGENTA);
        this.jPanelList.get(7).setBorder(BorderFactory.createTitledBorder("Panel 7"));
        this.jPanelList.get(8).setBackground(Color.ORANGE);
        this.jPanelList.get(8).setBorder(BorderFactory.createTitledBorder("Panel 8"));
        this.jPanelList.get(9).setBackground(Color.PINK);
        this.jPanelList.get(9).setBorder(BorderFactory.createTitledBorder("Panel 9"));
        this.jPanelList.get(10).setBackground(Color.YELLOW);
        this.jPanelList.get(10).setBorder(BorderFactory.createTitledBorder("Panel 10"));
        
        this.jPanelList.get(0).setLayout(new FlowLayout());
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(0).add(this.jPanelList.get(10));
    }
    
}
