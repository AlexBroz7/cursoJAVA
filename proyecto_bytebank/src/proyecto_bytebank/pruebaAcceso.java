package proyecto_bytebank;

public class pruebaAcceso {
	public static void main(String[] args) {
		cuenta cuenta = new cuenta();
		cuenta.setAgencia(-22);
		cuenta.depositar(400);
		
		cuenta.retirar(300);
		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	}
}
