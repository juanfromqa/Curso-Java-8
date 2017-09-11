package Modulo_6;
public class Persona {
	String nombre = "";
	int edad = 1;
	String direccion = "";
	String nacionalidad = "";
	
	//Constructor
	public Persona(String name, int age, String address, String country) {
		nombre=name;
		edad=age;
		direccion=address;
		nacionalidad=country;		
		
	}
	
	public Persona (String nombre) {
		this.nombre=nombre;
	}
	
	//this en objetos
	public Persona(Persona p) {
		this.nombre=p.nombre;
		this.edad=p.edad;
		this.direccion=p.direccion;
		this.nacionalidad=p.nacionalidad;
	}
	
	
	public Persona clonar() {
		Persona tmp = new Persona(this);
		return tmp;
	}
	
	
	//Métodos
	public void comunicarse() {
		System.out.println("Persona hablando");
	}
	
	public void comer() {
		System.out.println("Persona comiendo");
	}
	
	public String toString() {
		return "Nombre: "+nombre + "\nedad: "+edad+ "\nDirección: "+direccion+"\nNacionalidad: "+nacionalidad;
	}
	
}
