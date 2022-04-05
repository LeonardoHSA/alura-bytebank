public class Conta { // Classe chamada Conta
	double saldo;	//	''	''	''	''	
	int agencia;	// atributos da classe
	int numero;		//	''	''	''	''
	String titular; //	''	''	''	''
	
	public void deposita(double valor){ // Criando o método depositar
		this.saldo += valor; /* this é uma palavra reservada no java para referênciar o objeto que esteja invocando este método, que no caso é o objeto contaPaulo, ou qualquer conta que você esteja invocando determinado método*/
	}
	
	public boolean saca(double valor) { /* Um método que retorna um valor booleano para o usuário ( true ou false)*/
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true; /* O return é uma palavra chave do java, ele para a execução do método e volta (Retorna) para quem estava chamando o método, que no caso é a conta que estiver invocando o método*/
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor); // POdemos reutilizar um método da sua própria classe. que no caso é o deposita
			return true;
		} else {
			return false;
		}
	}
}

// Quando não se quer que nenhuma mensagem de retorno volte para o usuário colocamos a palavra reservada void no método a ser criado

// OBS: Não existe métodos dentro de métodos 