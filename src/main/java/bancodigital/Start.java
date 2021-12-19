package bancodigital;

public class Start {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		Conta cw = new ContaCorrente();
		cc.imprimirExtrato();
		cw.depositar(5000);
		cw.imprimirExtrato();
		
	}

}
