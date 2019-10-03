import javax.swing.JOptionPane;

public class Ejemplo {

	public static void main(String[] args) {
		try {
		manejoErrores();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error desde el main"+e.toString());
		}
		/*try{
			int [][]numeros = new int[3][3];
			numeros[-4][-4]=2;
			
			//int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una letra"));
			
			//String b = null;
			//JOptionPane.showMessageDialog(null, b);
			
			//int [][] a;
			//a[1][1]=2;
			
			//int a=Integer.parseInt(JOptionPane.showInputDialog("numero"));
			//clase:metodos, atributos y  
			
			
		}
		catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Error aritmetica"+e.toString());
		}
		catch(SecurityException e) {
			JOptionPane.showMessageDialog(null, "Error seguridad"+e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Error array"+e.toString());
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error entrada de numeros"+e.toString());
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error global"+e.toString());
		}
		finally {
			JOptionPane.showMessageDialog(null, "Finalizacion del programa");
		}
	*/
	}
	public static void manejoErrores() {
		try{
		
			JOptionPane.showMessageDialog(null, "hizo algo");
			
			//int [][]numeros = new int[3][3];
			//numeros[-4][-4]=2;
			
			int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una letra"));
			
			//String b = null;
			//JOptionPane.showMessageDialog(null, b);
			
			//int [][] a;
			//a[1][1]=2;
			
			//int a=Integer.parseInt(JOptionPane.showInputDialog("numero"));
			//clase:metodos, atributos y  
			
			
		}
		catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Error aritmetica"+e.toString());
		}
		catch(SecurityException e) {
			JOptionPane.showMessageDialog(null, "Error seguridad"+e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Error array"+e.toString());
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error entrada de numeros"+e.toString());
			manejoErrores();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error global"+e.toString());
		}
		finally {
			JOptionPane.showMessageDialog(null, "Finalizacion del programa");
		}
		
	}

}
