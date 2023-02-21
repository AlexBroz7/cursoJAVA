package proyecto_bytebank;

public class testReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(0, 0);
		primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		
		segundaCuenta.saldo = 100;
		
	}
}
