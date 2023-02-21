package proyecto_bytebank;

public class metodos {
		public static void main(String[] args) {
			Cuenta cuentaAlex = new Cuenta(0, 0);
			cuentaAlex.saldo = 1000;
			cuentaAlex.deposita(500);
			
			System.out.println(cuentaAlex.saldo);
		
			cuentaAlex.saca(100);
			System.out.println(cuentaAlex.saldo );
			
			Cuenta miCuenta = new Cuenta(0, 0);
			miCuenta.deposita(1000);
			miCuenta.transfiere(400, cuentaAlex);
			
			System.out.println(miCuenta.saldo);
			System.out.println(cuentaAlex.saldo);
		
		}
}
