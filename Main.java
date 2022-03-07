import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	static ArrayList<Conta> contas = new ArrayList<Conta>();
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public static void main(String[] args) {
		while (true) {
			Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
			int op = mainMenu.getSelection();

			if (op == 1) {
				Menu menuConta = new Menu("Menu conta", Arrays.asList("Criar conta", "Listar contas", "Sair"));
				int opConta = menuConta.getSelection();

				if (opConta == 1) {
					CriarConta();
				} else if (opConta == 2) {
					ListarContas();
				} else if (opConta == 3) {
					System.out.println("Saindo");
				}
			}

			if (op == 2) {
				Menu menuCliente = new Menu("Menu cliente", Arrays.asList("Criar cliente", "Listar clientes", "Sair"));
				int opCliente = menuCliente.getSelection();

				if (opCliente == 1) {
					CriarCliente();
				} else if (opCliente == 2) {
					ListarClientes();
				} else if (opCliente == 3) {
					System.out.println("Saindo");
				}
			}

			if (op == 3) {
				Menu menuOperacoes = new Menu("Menu operacoes", Arrays.asList("Saque", "Deposito", "Sair"));
				int operacao = menuOperacoes.getSelection();
				if (operacao == 1) {
					Saque();
				}
				if (operacao == 2) {
					Deposito();
				}
				if (operacao == 3) {
					System.out.println("Saindo");
				}
			}
		}
	}

	public static void CriarCliente() {
		System.out.println("Criar cliente");

		System.out.print("Nome: ");
		Scanner s = new Scanner(System.in);
		String nome = s.nextLine();

		System.out.print("CPF: ");
		String cpf = s.nextLine();

		System.out.print("Telefone: ");
		String tel = s.nextLine();

		Cliente newCliente = new Cliente(cpf, nome, tel);

		clientes.add(newCliente);
	}

	public static void ListarClientes(){
		
	}

	public static void CriarConta() {
		System.out.println("Criar conta");

		System.out.print("Nome: ");
		Scanner s = new Scanner(System.in);
		String nome = s.nextLine();

		System.out.print("nrConta: ");
		String nrConta = s.nextLine();

		System.out.print("Saldo: ");
		String saldo = s.nextLine();

		Conta newConta = new Conta(Integer.parseInt(nrConta), nome, Float.parseFloat(saldo));

		contas.add(newConta);
	}

	public static void ListarContas() {
		System.out.println("Listar contas");
		if (contas.size() == 0) {
			System.out.println("Nao existem contas");
		} else {
			for (Conta suaConta : contas) {
				suaConta.ListarConta();
				System.out.println("");
			}
		}
	}

	public static void Saque() {
		System.out.println("Operacao de Saque");

		System.out.print("Numero da conta: ");
		Scanner s = new Scanner(System.in);
		String numeroConta = s.nextLine();
		Conta contaEncontrada = findConta(Integer.parseInt(numeroConta));
		if (contaEncontrada == null) {
			System.out.println("Conta nao encontrada");
			return;
		}
		System.out.print("Valor do saque: ");
		String valor = s.nextLine();
		contaEncontrada.Saque(Float.parseFloat(valor));
		System.out.println("Valor sacado com sucesso.");
	}

	public static void Deposito() {
		System.out.println("Operacao de Deposito");

		System.out.print("Numero da conta: ");
		Scanner s = new Scanner(System.in);
		String numeroConta = s.nextLine();
		Conta contaEncontrada = findConta(Integer.parseInt(numeroConta));
		if (contaEncontrada == null) {
			System.out.println("Conta nao encontrada");
			return;
		}
		System.out.print("Valor do deposito: ");
		String valor = s.nextLine();
		contaEncontrada.Deposito(Float.parseFloat(valor));
		System.out.println("Valor depositado com sucesso.");
	}

	public static Conta findConta(Integer nrConta) {

		for (Conta conta : contas) {
			if (conta.GetNrConta().equals(nrConta)) {
				return conta;
			}
		}
		return null;
	}
}
