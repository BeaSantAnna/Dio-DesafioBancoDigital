package banco;

public class Main {

	public static void main(String[] args) {
		Cliente beatriz = new Cliente();
		beatriz.setNome("Beatriz");
		
		Conta cc = new ContaCorrente(beatriz);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(beatriz);
		cc.transferir(100, cp);
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
