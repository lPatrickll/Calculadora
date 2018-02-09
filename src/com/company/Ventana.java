package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JButton Panel1 = new JButton();
    private JTextField Text=new JTextField();
    private JPanel Panel2= new JPanel();
    private JButton boton7 = new JButton("7");
    private JButton boton8 = new JButton("8");
    private JButton boton9 = new JButton("9");
    private JButton botonX = new JButton("X");
    private JButton boton4 = new JButton("4");
    private JButton boton5 = new JButton("5");
    private JButton boton6 = new JButton("6");
    private JButton botonMenos = new JButton("-");
    private JButton boton1 = new JButton("1");
    private JButton boton2 = new JButton("2");
    private JButton boton3 = new JButton("3");
    private JButton botonMas = new JButton("+");
    private JButton botonDivicion = new JButton("%");
    private JButton boton0 = new JButton("0");
    private JButton botonComa = new JButton(",");
    private JButton botonIgual = new JButton("=");
    public Ventana(){
        super("Calculadora");
        setLayout(new BorderLayout());
        add(Panel1, BorderLayout.NORTH);
        Panel1.add(Text);
        add(Panel2, BorderLayout.CENTER);
        Panel2.setLayout(new GridLayout(4,4));
        Panel2.add(boton7);
        Panel2.add(boton8);
        Panel2.add(boton9);
        Panel2.add(botonX);
        Panel2.add(boton4);
        Panel2.add(boton5);
        Panel2.add(boton6);
        Panel2.add(botonDivicion);
        Panel2.add(boton1);
        Panel2.add(boton2);
        Panel2.add(boton3);
        Panel2.add(botonMas);
        Panel2.add(botonComa);
        Panel2.add(boton0);
        Panel2.add(botonIgual);
        Panel2.add(botonMenos);
    }
}
