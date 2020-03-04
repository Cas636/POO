package Othelo;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Cambios {

	public boolean BuscaBlancas(int i, int j, int x, int y, JButton array[][], boolean a) {
		if(array[i][j].getText().equals("blancas")) {
			int w=i;
			int z=j;
			int m=i;
			int g=j;
			while (array[w][z].getText().equals("blancas") && (w<8) && (z<8) && (w>0) && (z>0)) {
				w=w+(i-x);
				z=z+(j-y);
			}
			if (array[w][z].getText().equals("negras")) {
				a=false;
				array[x][y].setText("negras");
				array[x][y].setIcon(new ImageIcon("src/Imagenes/negra.png"));
				while (array[m][g].getText().equals("blancas") && (w<8) && (z<8) && (w>0) && (z>0)) {
					array[m][g].setText("negras");
					array[m][g].setIcon(new ImageIcon("src/Imagenes/negra.png"));
					m=m+(i-x);
					g=g+(j-y);
				}
			}

		}
		return a;

	}


	public boolean BuscaNegras(int i, int j, int x, int y, JButton array[][], boolean a) {
		if(array[i][j].getText().equals("negras")) {
			int w=i;
			int z=j;
			int m=i;
			int g=j;
			while (array[w][z].getText().equals("negras") && (w<8) && (z<8) && (w>0) && (z>0)) {
				w=w+(i-x);
				z=z+(j-y);
			}
			if (array[w][z].getText().equals("blancas")) {
				a=false;
				array[x][y].setText("blancas");
				array[x][y].setIcon(new ImageIcon("src/Imagenes/blanca.png"));
				while (array[m][g].getText().equals("negras") && (w<8) && (z<8) && (w>0) && (z>0)) {
					array[m][g].setText("blancas");
					array[m][g].setIcon(new ImageIcon("src/Imagenes/blanca.png"));
					m=m+(i-x);
					g=g+(j-y);

				}
			}
		}
		return a;
	}

}
