package br.edu.isfpcjo.ads.web2.employeecontrol.model;

public class SalariedAndComissionedEmployee extends ComissionedEmployee {
	
	private double salary;

	public SalariedAndComissionedEmployee(String name, String cpf, double salesValue, double comissionPercentege, double salary) {
		super(name, cpf, salesValue, comissionPercentege);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Empregado Salariado e Comissionadoc[salário= R$" + salary + ", valor das vendas= " + salesValue
				+ ", Percentual de comissão= " + comissionPercentege + "%, nome= " + name + ", CPF= " + cpf + "]";
	}
	

}
