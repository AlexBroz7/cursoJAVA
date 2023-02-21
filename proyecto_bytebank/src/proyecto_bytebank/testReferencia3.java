package proyecto_bytebank;

public class testReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaDeDiego = new Cuenta(0, 0);
		cuentaDeDiego.titular = new Cliente();
		cuentaDeDiego.titular.nombre = "Alex";
		
		System.out.println(cuentaDeDiego.titular.nombre);
	}
}
