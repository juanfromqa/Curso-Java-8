package modulo_5;

public class Anotaciones {

	public static void main(String... args) {
		// 
		int $variable;
		int _variable;
		int variable;
		
		
		//Logicos, textuales, integrales y punto flotante
		
//		Logical - Boolean
//		Textual - char
//		Integral - byte,short,int,long
//		flotantes - float
		
		//***DATOS PRIMITIVOS EN JAVA
		// tipo-de-dato identificador [inicialización]
		
		//Booleano - Solo tiene 2 literales TRUE o FALSE
		boolean flag = false;
		
		//Textual - char - Representa un caracter de 16 btis UNICODE
		//en un char no es posible inicializarlo vacío, se debe poner ='\0'
		char c = '\0';//Vacío
		char c2 = 'a';
		char c3 = '+';
		char c4 = '\t';//Tabulacion
		char c5 = '\n';//salto de línea 
		char c6 = '\ucafe';//En notación con hexadecimal, agregar una u al inicio + 4 hexadecimales
		
		//String no es un primitivo y siempre se deben utilizar ""
		String cadena = "hola java";
		
		//Integral decimal, octal y hexadecimal
		int entero = 10;//Decimal
		int enteroOctal = 010;
		int enteroHexadecimal = 0xcafe;
		
		System.out.println("entero = "+entero);
		System.out.println("Octal = "+enteroOctal);
		System.out.println("Hexadecimal = "+enteroHexadecimal);
		
		//Punto flotante - double y float Cualquier número que incluya decimales
		//el valor por defecto para las literares es Double
		float f = 10.5F;//Se recomienta usar mayúscula
		double d = 10.9D;
		double d2 = 10.9;//No es necesario la 'D' ya que es por default Double
		
		
		//VARIABLES (pueden cambiar
		double iva = 1.5D;
		
		//Constantes y la palabra final
		int constante = 10;
		constante = 15; //Es posible ya que aun no es una constante
		//Por convención se deben de identificar con mayúsculas
		final int NUMERO_DE_MESES = 12;
		//NUMERO_DE_MESES = 13; //Error en la compilación, no se puede cambiar el valor de una constante (final)
		
		
		//Almacenamiento de primitivos y constantes en memoria
		/*
		 * STACK Almacena: 
		 * 				-Variables constantes, 
		 * 				-Referencias 
		 * 				-Tipos de datos primitivos
		 */
		
		/*
		 * 
		 * HEAP almacena: OBJETOS (Instancias) (OJO: no clases)
		 * 
		 */
		
		//OPERADORES ARITMETICOS  + - * / %  - TestOperadores.java
		//OPERADORES INCREMENTO Y DECREMENTO - TestOperadores.java
		//PROMOCIONES o UPCASTING - TestOperadores.java
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
