package proyecto_bytebank;

public class testReferencia2 {

		public static void main(String[] args) {
			Cliente diego = new Cliente();
			diego.nombre = "Diego";
			diego.documento = "3193872192";
			diego.telefono = "5540618100";
			
			Cuenta cuentaDeDiego = new Cuenta(0, 0);
				cuentaDeDiego.agencia =1;
				cuentaDeDiego.titular = diego;
				
				System.out.println(cuentaDeDiego.titular.documento);
		}		
}
