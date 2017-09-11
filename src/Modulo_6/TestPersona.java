package Modulo_6;

public class TestPersona {
	
	public static void main(String... args) {
		Persona p = new Persona("Juan Hernandez", 20, "\nCiudad Universitaria\n", "MX");
		Persona q =p;
		q.direccion="CU  UAEMEX\n";
		System.out.println(p.toString());
		
		p = new Persona("",2,"","");
		
		Persona j = new Persona("HELLO");
		System.out.println(j.toString());
		
		//this en objetos
		j.nacionalidad="USA";
		Persona thisPersona = new Persona(j);
		
		System.out.println(thisPersona.toString());
		
		Persona y = new Persona("Otro");
		
		y = thisPersona.clonar();
		System.out.println(y);
		
	}

}
