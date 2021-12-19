package bancodigital;

public abstract class Conta implements IConta{
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numeroDeConta;
	protected double saldo;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroDeConta = SEQUENCIAL++;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroDeConta() {
		return numeroDeConta;
	}

	public double getSaldo() {
		return saldo;
	}
	protected void imprimirInformacoesDeConta() {
		System.out.println(String.format("Agencia %d", agencia));
		System.out.println(String.format("Conta %d", numeroDeConta));
		System.out.println(String.format("Saldo %.2f", saldo));
	}
	
}
