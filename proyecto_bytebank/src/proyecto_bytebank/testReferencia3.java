package proyecto_bytebank;

public class testReferencia3 {
	public static void main(String[] args) {
		cuenta cuentaDeDiego = new cuenta();
		cuentaDeDiego.titular = new cliente();
		cuentaDeDiego.titular.nombre = "Alex";
		
		System.out.println(cuentaDeDiego.titular.nombre);
	}
}
