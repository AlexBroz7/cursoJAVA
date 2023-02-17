package proyecto_bytebank;

public class testReferencia2 {

		public static void main(String[] args) {
			cliente diego = new cliente();
			diego.nombre = "Diego";
			diego.documento = "3193872192";
			diego.telefono = "5540618100";
			
			cuenta cuentaDeDiego = new cuenta();
				cuentaDeDiego.agencia =1;
				cuentaDeDiego.titular = diego;
				
				System.out.println(cuentaDeDiego.titular.documento);
		}		
}
