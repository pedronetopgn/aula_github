public class Cliente {
    private String cpf;
    private String nome;
    private String tel;

    Cliente(String cpf, String nome, String tel) {
        this.cpf = cpf;
        this.nome = nome;
        this.tel = tel;
    }

    public void ListarCliente() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.tel);
    }
}
