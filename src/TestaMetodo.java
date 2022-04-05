
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaPaulo = new Conta();/* Uma vari�vel do tipo conta � apenas uma refer�ncia para o objeto criado a partir da classe conta*/
		contaPaulo.saldo = 100;
		contaPaulo.deposita(50); // Invocando o m�todo deposita
		System.out.println(contaPaulo.saldo);
		
		boolean conseguiuRetirar = contaPaulo.saca(20); /* Desta maneira al�m de conseguirmos invocar o m�todo sacar tamb�m conseguimos retornar o valor booleano  do m�todo sacar atrav�s da declara��o da vari�vel conseguiuRetirar*/
		System.out.println(contaPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		if(contaMarcela.transfere(350, contaPaulo)) { /* Neste caso como o m�todo transfer�ncia retorna um resultado booleano, se consegue passar toda a invoca��o em um if como uma condi��o 														deste m�todo como uma condi��o para um if*/
			System.out.println("transfer�ncia realizada com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaMarcela.saldo);
		
		
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.titular = "Paulo silveira";
		System.out.println(contaPaulo.titular);
		
	}
}
