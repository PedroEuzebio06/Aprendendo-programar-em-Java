/*Escreva uma classe em Java para representar produtos. Toda produto possui código, 
nome e preço, e os valores do código e do nome são obrigatórios durante a instanciação 
de uma produto. Além disso, para cada produto, deve haver uma forma para que se 
modifiquem e acessem seus dados a qualquer momento. Considere o conceito de 
encapsulamento. Crie uma classe, composta pelo método main(), para efetuar as 
seguintes tarefas: 
a. Instancie um produto com base em valores predefinidos. 
b. Modifique o nome e o preço (a partir de valores predefinidos) do produto 
instanciado, e imprima os dados atualizados. */


public class Produto {
	// Atributos privados (Encapsulamento)
	private int codigo;
	private String nome;
	private double preco;
	
	// Construtor: Garante que código e nome sejam fornecidos na criação
	public Produto(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	// Métodos Getter e Setter
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void exibirInformações() {
		System.out.println("------ Produto ------");
		System.out.println("Código: " + codigo);
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("---------------------");
	}
	

}
