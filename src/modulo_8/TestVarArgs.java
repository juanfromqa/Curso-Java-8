package modulo_8;

public class TestVarArgs {

	public static void main(String[] args) {
	//ARGUMENTOS VARIABLES
		System.out.println(sum(10,15));
		System.out.println(sum(10,15,20));
		System.out.println(sumaArgsVariables("",10,15,20));
		System.out.println(sumaArgsVariables("prueba",10,15,20,40,60,80));
		

	}
	
	public static int sum(int x, int y) {
		return (x+y);
	}
	public static int sum(int x, int y, int z) {
		return (x+y+z);
	}
	
	public static int sumaArgsVariables(String a,int...args) { //Desde Java 5  
															 //  Los argumentos variables siempre deben ser el último elemento 
		int result = 0;
		for (int arg: args) {
			result += arg;
		}
		return result;
	}
	

}
