package proyecto_bytebank;

public class cuenta 

{
	private double saldo;
	private int agencia;
	private int numero;
	cliente titular;


	
	void depositar(double valorDepositado){
		this.saldo += valorDepositado;
	}
	
	public boolean retirar(double valorRetiro) {
		if(this.saldo >= valorRetiro) {
			this.saldo = this.saldo - valorRetiro;
			return true;
		}
		else {
			return false;		
		}
	}
		
		public boolean transferir(double valorTransferir, cuenta cuenta) {
				if(this.saldo <= this.saldo) {
					
				this.saldo -=  valorTransferir;
				cuenta.depositar(valorTransferir);
				return true;
					}
				else {
				return false; 	
				}
				
	}
		
		public double getSaldo(){
			return this.saldo;
		}
		
		public void setAgencia(int agencia){
			if(agencia>0) {
			this.agencia = agencia;
			}
			else {
				System.out.println("No estan permitidos los 0");
			}
			
			
		}
		
		public int getAgencia() {
			return agencia;
		}
		
		public void setTitular(cliente titular) {
			this.titular = titular;
		}
}
