package proyecto_bytebank;

public class cuenta 

{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
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
}
