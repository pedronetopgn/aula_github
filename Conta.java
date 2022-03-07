public class Conta {
  private int nrConta;
  private String nome;
  private float saldo;
  private String extrato = "";

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
    this.extrato += "Efetuando Saque com Saldo: R$" + this.saldo + "\n";
    this.saldo = this.saldo - valor;
    this.extrato += "Saldo final: R$" + this.saldo + "\n";
  }

  public void Deposito(float valor){
    this.extrato += "Efetuando Deposito com Saldo: R$" + this.saldo + "\n";
    this.saldo = this.saldo + valor;
    this.extrato += "Saldo final: R$" + this.saldo + "\n";
  }

  public String Extrato(){
    if(this.extrato == "")
      return "Conta nao efetuou operacoes.";
    return this.extrato;
  }

  public Integer GetNrConta(){
    return this.nrConta;
  }
}
