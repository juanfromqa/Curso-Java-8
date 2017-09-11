package Modulo_6;

public class TestValorReferencia {
	public static void main (String args[]) {
		Persona p = new Persona("JHS", 26, "DF", "MX");
		int edad = 100;
		getEdad(p,edad);
		System.out.println("x = "+edad);//100 el valor de X no se modifican
		System.out.println("edad ="+p.edad);//110
	}
	
	public static void getEdad(Persona p, int edad) {
		edad=edad +10;
		p.edad=edad;
		
	}
}