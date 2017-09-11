package modulo_5;

public class TestOperadores {

	public static void main(String[] args) {
		
		//OPERADORES ARITMETICOS  + - * / %
		
		int x = 10, y = 20, z = 30;
		
		System.out.println("Suma = "+(x+y));
		System.out.println("Resta = "+(y-x));
		System.out.println("Multiplicacion = "+(x*y));
		System.out.println("Modulo = "+(x%y));
		//Poner especial atención en el órden de las operaciones dentro del paréntesis, en el ejemplo se concatena una suma a un string
		System.out.println(x+y +" es la suma de "+x+" mas "+y);
		
		//OPERADORES INCREMENTO Y DECREMENTO 
		
		x++; // Es la forma abreviada de x=x+1  		
		System.out.println("x = "+x);
		
		y--; // Es la forma abreviada de y=y-1
		System.out.println("y = "+y);
		
		z= x++ + ++y;// Vale x = 10  hasta la siguiente línea y 'y' 21 ya que primero se hace el incremento 
		
		z= x++ + y-- + x++ +y-- - x;
		System.out.println("z = "+z);
		
		int incremento = 10;
		incremento++;
		System.out.println(++incremento);
		System.out.println(incremento++);
		System.out.println(incremento);
		
		x= 1;
		y= 1;
		
		
		//                   1   + 2   + (2)3  -  1
		int incrementoTest = x++ + ++y + ++x - --y;
		System.out.println(incrementoTest);
		/*jerarquía de operaciones
		 	1.- Parentesis
			2.- Incrementos decrementos
			3.- Multiplicaciones y divisiones
		*/
		
		
		long lon = 10; //Originalmente es un entero, se realiza una promocion
		
		//Tener cuidado al hacer operaciones
		byte byt=0;		
		//byt = x+y; //no es posible pues sabemos que el resultado es un entero
		byt = (byte) (x+y); 
		
		float f1 = 10.5F, f2=1.3F;
		System.out.println("Resultado Float = "+(f1/f2 ));
		
		int entero1 = 10, entero2= 7;
		System.out.println("Resultado: "+(entero1/entero2));//ESTO SOLO IMPRIME EL VALOR ENTERO DE LA OPERACION
		System.out.println("Resultado: "+((float) entero1 / (float) entero2)); //Para hacer lo anterior cada numero debe ser tratado como float
		
	}

}
