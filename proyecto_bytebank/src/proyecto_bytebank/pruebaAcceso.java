package proyecto_bytebank;

public class pruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(0, 0);
		cuenta.setAgencia(-22);
		cuenta.deposita(400);
		
		cuenta.saca(300);
		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	}
}
