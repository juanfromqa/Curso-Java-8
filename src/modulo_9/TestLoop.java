package modulo_9;

public class TestLoop {

	public static void main(String[] args) {
		//While
		int x = 0;
		System.out.println("******WHILE");
		while (x++ < 10) {
			System.out.println("X es igual a : "+x);
		}
		
		System.out.println("Valor final de x es : "+x);
		
		//do-while
		System.out.println("******DO-WHILE");
		x=0;
		do {
			System.out.println("X es igual a : "+x);
		} while (x++<10);
		System.out.println("Valor final de x es : "+x);
		
		
		//FOR
		x=0;
		System.out.println("******FOR");
		for (int i = 0; i < 10; i++) {
			System.out.println(x);
		}
		
		//Se permite lo siguiente:
		for (String a = "-------", y = "";a.length()>0;a=a.substring(0,a.length()-1),y=y+"|") {
			System.out.println(a+y);
			
		}
		
		//Tambien se puden quitar los decrementos o decrementos y condicion
		String a = "+++++++", y = "";
		for (;;) {
			
			a=a.substring(0,a.length()-1);
					y=y+"|";
					
			System.out.println(a+y);
			if (a.length()<=0) {
				break;
				//continue;
			}
			
		}
		
		
		
		
		//ETIQUETAS
		System.out.println("ETIQUETAS");
		w://etiqueta
		for (int i = 0; i < 6; i++) {
			z: //Solo se permite en ciclos las etiquetas
			for (int j = 0; j < 6; j++) {
				if (i == 3) continue w;
				System.out.println(j+"-"+i);
				if (j == 5) break z;
			}
		}
		
		
	}

}
