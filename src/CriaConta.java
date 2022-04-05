
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // Cria (isntancia) um objeto do tipo conta nomeando de primeiraConta, retirando referências da classe conta
		primeiraConta.saldo = 200; // Atribui o valor 200 no atributo saldo do objeto primeiraConta
		System.out.println(primeiraConta.saldo); // Imprime o valor do atributo saldo do objeto primeiraConta
		
		primeiraConta.saldo += 100;
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Na primeira conta tem " + primeiraConta.saldo);
		System.out.println("Na segunda conta tem " + segundaConta.saldo);
		
		System.out.println("Agência da primeira conta é " + primeiraConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("Agência da segunda conta é " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		} else {
			System.out.println("Não são a mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
