package proyecto_bytebank;

public class testReferencia {
	public static void main(String[] args) {
		cuenta primeraCuenta = new cuenta();
		primeraCuenta.saldo = 200;
		
		cuenta segundaCuenta = primeraCuenta;
		
		segundaCuenta.saldo = 100;
		
	}
}
