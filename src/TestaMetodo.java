
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaPaulo = new Conta();/* Uma variável do tipo conta é apenas uma referência para o objeto criado a partir da classe conta*/
		contaPaulo.saldo = 100;
		contaPaulo.deposita(50); // Invocando o método deposita
		System.out.println(contaPaulo.saldo);
		
		boolean conseguiuRetirar = contaPaulo.saca(20); /* Desta maneira além de conseguirmos invocar o método sacar também conseguimos retornar o valor booleano  do método sacar através da declaração da variável conseguiuRetirar*/
		System.out.println(contaPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		if(contaMarcela.transfere(350, contaPaulo)) { /* Neste caso como o método transferência retorna um resultado booleano, se consegue passar toda a invocação em um if como uma condição 														deste método como uma condição para um if*/
			System.out.println("transferência realizada com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaMarcela.saldo);
		
		
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.titular = "Paulo silveira";
		System.out.println(contaPaulo.titular);
		
	}
}
