package interfazz;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener{

	ImageIcon negra;
	ImageIcon blanca;
	JButton array[][];
	JPanel Panel;
	int n=8;
	int contador=0;
	
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
		iniciar();

	}

	public void iniciar() {
		array[3][3].setIcon(new ImageIcon("src/Imagenes/blanca.png"));
		array[4][4].setIcon(new ImageIcon("src/Imagenes/blanca.png"));
		array[3][4].setIcon(new ImageIcon("src/Imagenes/negra.png"));
		array[4][3].setIcon(new ImageIcon("src/Imagenes/negra.png"));

	}
	public void actionPerformed(ActionEvent c) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(c.getSource()==array[i][j]) {
					if(contador<60) {
						validar(i,j,contador);
						if(((contador % 2)==0) && (i<8) && (j<8) && (c.getActionCommand().equals("boton "+ i +" , " + j))){
						array[i][j].setIcon(new ImageIcon("src/Imagenes/negra.png"));
						}
					
						if(((contador % 2)!=0) && (i<8) && (j<8) && (c.getActionCommand().equals("boton "+ i +" , " + j))){    
							array[i][j].setIcon(new ImageIcon("src/Imagenes/blanca.png"));
						}
						contador++;
					}
				}

			}
		}

	}

public void validar(int x, int y, int contador){
		
		if((x!=0) && (y!=0) && (x!=7) && (y!=7)) {
			if ((contador%2)==0){
				int g=(x-1);
				int m=(y-1);
				for(int i=(x-1);i<(g+3);i++){//revisar el alrededor de la casilla 
					for(int j=(y-1);j<(m+3);j++){//del color diferente al que esta jugando
						if(tablero[i][j]=='b') {
							BuscaBlancas(i,j,x,y);
							respuesta=false;
						}
					}
				}

			}
			else {
				int g=(x-1);
				int m=(y-1);
				for(int i=(x-1);i<(g+3);i++){//revisar el alrededor de la casilla 
					for(int j=(y-1);j<(m+3);j++){//el color diferente al que esta jugando
						if(tablero[i][j]=='n') {
							BuscaNegras(i,j,x,y, tablero);
							respuesta=false;
						}
					}
				}
			}
		}
		else{
			if ((contador%2)==0) {
				if((x==0) && (y==0)){
					for(int i=x;i<2;i++){//revisar el alrededor de la casilla 
						for(int j=y;j<2;j++){//del color diferente al que esta jugando
							if(tablero[i][j]=='b') {
								BuscaBlancas(i,j,x,y);
								respuesta=false;
							}
						}
					}
				}
				else if(y!=0){
					int m=y;
					for(int i=(x);i<2;i++){//revisar el alrededor de la casilla 
						for(int j=(y-1);j<(m+3);j++){//del color diferente al que esta jugando
							if(tablero[i][j]=='b') {
								BuscaBlancas(i,j,x,y);
								respuesta=false;
							}
						}
					}
				}

				else{
					int g=x;
					for(int i=(x-1);i<1;i++){//revisar el alrededor de la casilla 
						for(int j=y;j<(g+3);j++){//del color diferente al que esta jugando
							if(tablero[i][j]=='b') {
								BuscaBlancas(i,j,x,y);
								respuesta=false;
							}
						}
					}
				}
			}

		else {
			if((x==0) && (y==0)){
				for(int i=x;i<2;i++){//revisar el alrededor de la casilla 
					for(int j=y;j<2;j++){//del color diferente al que esta jugando
						if(tablero[i][j]=='b') {
							BuscaBlancas(i,j,x,y);
							respuesta=false;
						}
					}
				}
			}
			else if(y!=0){
				int m=y;
				for(int i=x;i<2;i++){//revisar el alrededor de la casilla 
					for(int j=(y-1);j<(m+3);j++){//del color diferente al que esta jugando
						if(tablero[i][j]=='b') {
							BuscaBlancas(i,j,x,y);
							respuesta=false;
						}
					}
				}
			}

			else {
				int g=x;
				for(int i=(x-1);i<1;i++){//revisar el alrededor de la casilla 
					for(int j=y;j<(g+3);j++){//del color diferente al que esta jugando
						if(tablero[i][j]=='b') {
							BuscaBlancas(i,j,x,y);
							respuesta=false;
						}
					}
				}
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



