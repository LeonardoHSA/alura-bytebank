public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta é: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Slado da seegunda conta é: " + segundaConta.saldo);
		System.out.println();
		
		segundaConta.saldo += 100;
		
		System.out.println("Slado da seegunda conta é: " + segundaConta.saldo);
		
		System.out.println("Saldo da primeira conta é: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) { /* Neste caso o sinal de == vai reparar a referência e não o objeto, já que primeiraConta é uma referência para o objeto primeira conta e não o objeyo em si */
			System.out.println("São a 'mesma conta' ");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
			
	}
	
}
