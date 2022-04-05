public class Conta { // Classe chamada Conta
	double saldo;	//	''	''	''	''	
	int agencia;	// atributos da classe
	int numero;		//	''	''	''	''
	String titular; //	''	''	''	''
	
	public void deposita(double valor){ // Criando o m�todo depositar
		this.saldo += valor; /* this � uma palavra reservada no java para refer�nciar o objeto que esteja invocando este m�todo, que no caso � o objeto contaPaulo, ou qualquer conta que voc� esteja invocando determinado m�todo*/
	}
	
	public boolean saca(double valor) { /* Um m�todo que retorna um valor booleano para o usu�rio ( true ou false)*/
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true; /* O return � uma palavra chave do java, ele para a execu��o do m�todo e volta (Retorna) para quem estava chamando o m�todo, que no caso � a conta que estiver invocando o m�todo*/
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor); // POdemos reutilizar um m�todo da sua pr�pria classe. que no caso � o deposita
			return true;
		} else {
			return false;
		}
	}
}

// Quando n�o se quer que nenhuma mensagem de retorno volte para o usu�rio colocamos a palavra reservada void no m�todo a ser criado

// OBS: N�o existe m�todos dentro de m�todos 