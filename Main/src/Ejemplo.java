import java.io.InputStreamReader;
import java.io.Reader;

public class Ejemplo {

	public static void main(String[] args) {
		//cuenta numero de tecleos
		/*try {
			int cont =0;
			while(System.in.read()!='\n') {
			cont++;
			
			System.out.println();
			System.err.println("tecleo"+cont+"carnetero");
			}
		}
		catch(Exception e) {
			
		}*/
		//captura teclas que dijita
		/*StringBuffer bf = new StringBuffer();
		char c;
		try {
			Reader entrada = new InputStreamReader(System.in);
				while((c=(char)entrada.read())!='x'){
					bf.append(c);
				}
		}catch(Exception e) {
			System.out.println("Error");
		}
		System.out.println(bf.toString());
		*/
		
		char[] buffer = new char[255];
		try {
			Reader entrada = new InputStreamReader(System.in);
			int tamano = entrada.read(buffer);
			
			
		}catch(Exception e) {
			
		}
		System.out.println(" ");
		String str = new String(buffer);
		System.out.println(str);
		
	}

}
