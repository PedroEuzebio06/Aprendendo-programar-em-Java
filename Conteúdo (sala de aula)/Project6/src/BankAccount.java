
public class BankAccount {
	
	// declaracao de atributos
	int id;
	String clientName;
	double balance;
	
	
	// metodo para efetuar um saque
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
		}
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void displayDetails() {
		System.out.println("Dados da conta:");
		System.out.println("Código: " + id);
		System.out.println("Nome do cliente: " + clientName);
		System.out.println("Saldo: R$ " + balance);
	}

}
