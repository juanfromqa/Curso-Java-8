package modulo_5;

public class TestPrimitivos {

	public static void main(String[] args) {
		byte b=127;//Desde -128 hasta  127
		short sh=327;// desde -32678 hasta 32678
		int a = 32679;
		int i = b; //Puede contener a cualquiera de los dos enteros declarados anteriormente
		int c = sh;
		long l = 1098;//no necesita L ya que cabe en un entero
	//  i = l; // Un long no cabe dentro de un entero
		int intCasteadoAlong= (int) l; //Para hacer lo anterior se puede ejecutar mediante un casteo
		System.out.println(intCasteadoAlong);//imprime 1098
		
		float f = 10.5F;
		i = (int) f;  //Solamente almacena los valores enteros
		System.out.println(i);//Imprime 10
		
		
		boolean bo = true;
		//i=(int) bo; Es incorrecto castear booleanos a enteros
		char caracter = '\ucafe';
		i = caracter; //Caracter es completamente compatible con Enteros y no necesita casting
		System.out.println(i);//Imprime el valor decimal del caracter
		
		
		
		
		
		

	}

}
