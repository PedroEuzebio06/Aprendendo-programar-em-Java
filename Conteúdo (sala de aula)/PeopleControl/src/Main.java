import java.util.Scanner;

public class Main {
	
	private static Scanner teclado = new Scanner(System.in);
	
	private static PeopleManager manager = new PeopleManager();
	
	public static int menu() {
		System.out.println("----------------------------------");
		System.out.println("--Sistema de Controle de Pessoas--");
		System.out.println("----------------------------------");
		System.out.println("-------- MENU DE OPÇÕES ----------");
		System.out.println("----------------------------------");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Buscar pelo cpf");
		System.out.println("3 - Atualizar");
		System.out.println("4 - Remover");
		System.out.println("5 - Sair");
		System.out.println("----------------------------------");
		System.out.println("Escolha uma opção: ");
		return teclado.nextInt();
	}
	
	public static void register() {
		System.out.println("Digite o nome: ");
		String name = teclado.nextLine();
		System.out.println("Digite o CPF: ");
		String cpf = teclado.nextLine();
		Person person = new Person(name, cpf);
		if(manager.save(person)) {
			System.out.println("Pesso cadastrada com sucesso!");
			System.out.println(manager.getPeopleList());
		}else {
			System.out.println("Erro ao cadastrar a pessoa");
		}
	}
	
	private static void search() {
		System.out.println("Digite o CPF:");
		String cpf = teclado.nextLine();
		Person person = manager.search(cpf);
		if(person != null) {
			System.out.println("Pessoa encontrada. Dados: ");
			System.out.println(person);
		}else {
			System.out.println("Pessoa não encontrada. Tente novamente.");
		}
		
	}
	
	private static void update() {
		System.out.println("Digite o CPF: ");
		String cpf = teclado.nextLine();
		System.out.println("Digite o novo nome: ");
		String name = teclado.nextLine();
		if(manager.update(cpf, name)) {
			System.out.println("Ddaos atualizados.");
		}else {
			System.out.println("Erro ao atualizar os dados.");
		}
	}
	
	private static void remove() {
		System.out.println("Digite o CPF: ");
		String cpf = teclado.nextLine();
		if(manager.remove(cpf)) {
			System.out.println("Dados excluídos.");
		}else {
			System.out.println("Erro ao excluir os dados.");
		}
	}

	public static void main(String[] args) {
		int opcao;
		do {
			opcao = menu();
			teclado.nextLine();
			switch(opcao) {
			case 1: {
				register();
				break;
			}
			case 2: {
				search();
				break;
			}
			case 3: {
				update();
				break;				
			}
			case 4: {
				remove();
				break;
			}
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
			System.out.println("Pressione <Enter> para continuar...");
			teclado.nextLine();
		}while(opcao != 5);
	}

}
