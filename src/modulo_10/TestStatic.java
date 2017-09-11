package modulo_10;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket ticket1 = new Ticket();
		Ticket ticket2 = new Ticket();
		Ticket ticket3 = new Ticket();
		System.out.println(ticket1.idProducto);
		System.out.println(ticket2.idProducto);
		System.out.println(ticket3.idProducto);
		Ticket ticket4 = new Ticket();
		ticket2.cuentaInstancias();
		

	}

}
