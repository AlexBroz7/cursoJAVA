package proyecto_bytebank;

public class metodos {
		public static void main(String[] args) {
			cuenta cuentaAlex = new cuenta();
			cuentaAlex.saldo = 1000;
			cuentaAlex.depositar(500);
			
			System.out.println(cuentaAlex.saldo);
		
			cuentaAlex.retirar(100);
			System.out.println(cuentaAlex.saldo );
			
			cuenta miCuenta = new cuenta();
			miCuenta.depositar(1000);
			miCuenta.transferir(400, cuentaAlex);
			
			System.out.println(miCuenta.saldo);
			System.out.println(cuentaAlex.saldo);
		
		}
}
