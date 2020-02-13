package interfazz;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener{

	ImageIcon negra;
	JButton array[][];
	//boolean matriz[][];
	JPanel Panel;
	int n=8;
	public Interfaz() {
		Panel = new JPanel();
		array = new JButton[n][n];
		Panel.setLayout(new GridLayout (n,n));
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]=new JButton("boton "+ i +" , " + j);
				array[i][j].addActionListener(this);
				Panel.add(array[i][j]);
			}
		}
		add(Panel);

	}


	public void actionPerformed(ActionEvent c) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(c.getSource()==array[i][j]) {
					array[i][j].setIcon(new ImageIcon("src/Imagenes/negra.png"));
				}

			}
		}

	}


	public JButton[][] getArray() {
		return array;
	}


	public void setArray(JButton[][] array) {
		this.array = array;
	}

}



