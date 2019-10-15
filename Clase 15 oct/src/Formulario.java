

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Formulario extends JFrame implements ActionListener{

	JButton boton1;
	
	public Formulario() {
		setLayout(null);
		
		boton1 = new JButton("HOLA");
		boton1.setBounds(320, 270, 100, 20);
		add(boton1);
		boton1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			System.exit(0);
		}
		
	}
	
}
