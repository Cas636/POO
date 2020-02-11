package interfazz;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener{

	JButton array[];
	JButton boton1;
	JPanel Panel;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	
	public Interfaz() {
		//setLayout (null);
		//boton1 = new JButton("1");
		//boton2 = new JButton("2");
		//boton3 = new JButton("3");
		//boton4 = new JButton("4");
		//boton1.setBounds(300,250,100,30);
		//add(boton1);
		//boton1.addActionListener(this);
		//boton2.addActionListener(this);
		//boton3.addActionListener(this);
		//boton4.addActionListener(this);
		Panel = new JPanel();
		
		array = new JButton[8];
		Panel.setLayout(new GridLayout (2,2));
		for(int i=0;i<8;i++) {
			array[i]=new JButton("boton"+ i);
			array[i].addActionListener(this);
			Panel.add(array[i]);
		}
		
		//Panel.add(boton1);
		//Panel.add(boton2);
		//Panel.add(boton3);
		//Panel.add(boton4);
		add(Panel);
	}
	public void actionPerformed(ActionEvent c) {
	if(c.getSource()==boton1) {
		System.exit(0);
	}
	
	if(c.getSource()==boton2) {
		boton2.setText("cambio");
		
	}
	if(c.getSource()==boton3) {
		boton3.setText("2+1");
	}
	if(c.getSource()==boton4) {
		boton4.setText("2+2");
	}
	}
	
	
	
	public JButton getBoton1() {
		return boton1;
	}
	public void setBoton1(JButton boton1) {
		this.boton1 = boton1;
	}
	
}
