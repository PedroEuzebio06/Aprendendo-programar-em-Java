
public class Main {

	public static void main(String[] args) {
		// Instanciar um objeto da classe BankAccount
		BankAccount account1 = new BankAccount();
		System.out.println(account1);
		account1.displayDetails();
		account1.deposit(1000);
		System.out.println("Saldo atualizado: R$" + account1.balance);
		account1.withdraw(1500);
		System.out.println("Saldo atualizado: R$" + account1.balance);
		account1.clientName = "Pedro Euzébio";
		account1.displayDetails();		
		
		
		// instanciar outro objeto da classe BankAccount
		BankAccount account2 = new BankAccount(); 
		System.out.println(account2);
		account1.displayDetails();

	}

}
