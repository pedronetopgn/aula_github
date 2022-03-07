public class Conta {
  private int nrConta;
  private String nome;
  private float saldo;

  Conta (int nrConta, String nome, float saldo) {
    this.nrConta = nrConta;
    this.nome = nome;
    this.saldo = saldo;
  }

	public void ListarConta() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Numero da conta: " + this.nrConta);
    System.out.println("Saldo: " + this.saldo);
	}

  public void Saque(float valor) {
    this.saldo = this.saldo - valor;
  }

  public void Deposito(float valor){
    this.saldo = this.saldo + valor;
  }

  public Integer GetNrConta(){
    return this.nrConta;
  }
}
