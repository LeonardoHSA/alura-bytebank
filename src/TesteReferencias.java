public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta �: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Slado da seegunda conta �: " + segundaConta.saldo);
		System.out.println();
		
		segundaConta.saldo += 100;
		
		System.out.println("Slado da seegunda conta �: " + segundaConta.saldo);
		
		System.out.println("Saldo da primeira conta �: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) { /* Neste caso o sinal de == vai reparar a refer�ncia e n�o o objeto, j� que primeiraConta � uma refer�ncia para o objeto primeira conta e n�o o objeyo em si */
			System.out.println("S�o a 'mesma conta' ");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
			
	}
	
}
