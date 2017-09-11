package modulo_10;

//Servirá para llevar el control de unos productos
public class Ticket {
	//Variables de instancia
	int idProducto;
	String descripcion;
	int stock;
	
	//Variables de clase , existen aunque no existan instancias de la clase.
	public static int id=0;
	

	//Constructor
	public Ticket() {
		this.idProducto=++id;
	
	}
	
	//Metodo de clase NO pueden acceder a variables de instancia ni metodos de instancia
	public static void cuentaInstancias() {
		System.out.println(id);//Solo puede acceder a otros miembros estàticos
		System.out.println((int) Math.random());//Solo puede acceder a otros miembros estàticos inclusive de otras clases
		
		
	}
	

	
	
	
}
