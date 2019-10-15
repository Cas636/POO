package Interfaz.Grafica;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{
	
	private ArrayList <JButton> botones;
	private JPanel panel1, panel2;
	private JLabel text;
	private JTextField cajaTexto;
	private ActionListener action;
	
	
	public GUI(){
		super("Interfaz");
		accion();
		crearBotones();
		//crearText();
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void accion() {
		action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String opcion = (String)e.getActionCommand();
				
				if(opcion.equals("boton 1")) {
					botones.get(0).setText("Se oprimio");
				}
				else if(opcion.equals("boton 2")) {
					botones.get(1).setText("Se oprimio");
				}
				else if(opcion.equals("boton 3")) {
					botones.get(2).setText("Se oprimio");
				}
				else if(opcion.equals("boton 4")) {
					botones.get(3).setText("Se oprimio");
				}
				else if(opcion.equals("boton 5")) {
					botones.get(4).setText("Se oprimio");
				}
			}
		};
	} 
	public void crearBotones(){
		setLayout(new BorderLayout());
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(5,5));
		botones = new ArrayList <JButton>();
		for(int i=0;i<10;i++) {
			botones.add(i, new JButton("boton "+(i+1)));
			panel1.add(botones.get(i));
			if(i<5) {
				botones.get(i).addActionListener(action);
			}
			else {
				botones.get(i).addActionListener(this);
			}
		}
		add(panel1);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}