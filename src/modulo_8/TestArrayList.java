package modulo_8;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Hola");
		al.add("Adios");
		al.add(new TestArrayList());
		al.add(5);//Se transforma a su Wrapper Integer
		al.add(new Integer(5));//esto es lo que sucede, un autoboxing en la linea 13
		al.add(true);//Se transforma a su Wrapper Boolean (AUTOBOXING)
		al.add("Adios");
		System.out.println(al);
		al.remove("Adios");
		Integer x = new Integer(5);
		
		al.remove(x);
		
		System.out.println(al);//SOLO SE ELIMINA LA PRIMER COINCIDENCIA
		
		ArrayList al2 = new ArrayList();
		al2.add(2);
		al2.add(3);
		al2.add(1);
		al2.add(4);
		al2.add(8);// agrega solo el objeto
		//al2.addAll(al);// agrega todos los elementos que vengan dentro de un objeto lista
		System.out.println(al2.size());
		System.out.println("Antes de ordenarlo"+al2);
		//Todos sus elementos deben de ser del mismo tipo para poder utilizar el SORT
		Collections.sort(al2);
		System.out.println("Despues de ordenarlo"+al2);
		
		
		
		
	}

}
