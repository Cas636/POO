package src;

import java.util.*;

public class ArrayListItem {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new ItemListening("Universidad"));
		list.add(new ItemListening(" Distrital "));
		list.add(new ItemListening(" FJC "));

		Iterator iterador= list.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		Object objeto = new Object();
		objeto.toString();
	}

}

