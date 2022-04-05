
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // Cria (isntancia) um objeto do tipo conta nomeando de primeiraConta, retirando refer�ncias da classe conta
		primeiraConta.saldo = 200; // Atribui o valor 200 no atributo saldo do objeto primeiraConta
		System.out.println(primeiraConta.saldo); // Imprime o valor do atributo saldo do objeto primeiraConta
		
		primeiraConta.saldo += 100;
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Na primeira conta tem " + primeiraConta.saldo);
		System.out.println("Na segunda conta tem " + segundaConta.saldo);
		
		System.out.println("Ag�ncia da primeira conta � " + primeiraConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("Ag�ncia da segunda conta � " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("S�o a mesma conta");
		} else {
			System.out.println("N�o s�o a mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
