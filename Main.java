import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	static ArrayList<Conta> contas = new ArrayList<Conta>();

	public static void main(String[] args) {
		while(true) {
			Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
			int op = mainMenu.getSelection();

			if(op == 1) {
				Menu menuConta = new Menu("Menu conta", Arrays.asList("Criar conta", "Listar contas", "Sair"));
				int op2 = menuConta.getSelection();

				if(op2 == 1) {
					CriarConta();
				}
				else if(op2 == 2) {
					ListarContas();
				}
				else if(op2 == 3) {
					System.out.println("Saindo");
				}
			}

			if(op == 3) {
				break;
			}
		}

		System.out.println("Fim");
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
	}

}
