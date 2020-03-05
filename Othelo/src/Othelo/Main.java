package Othelo;

import javax.swing.JOptionPane;

public class Main {

	public static void main (String arg[]) {
		try {
			Interfaz tablero = new Interfaz();
			tablero.setBounds(200,0,1000,1000);
			tablero.setVisible(true);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error desde el main "+e.toString());

		}
	}
}
