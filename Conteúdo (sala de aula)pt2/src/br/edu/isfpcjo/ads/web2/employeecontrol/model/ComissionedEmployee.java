package br.edu.isfpcjo.ads.web2.employeecontrol.model;

public class ComissionedEmployee extends Employee {
	
	protected double salesValue;
	protected double comissionPercentege;

	public ComissionedEmployee(String name, String cpf, 
		double salesValue, double comissionPercentege) {
		
		super(name, cpf);
		this.salesValue = salesValue;
		this.comissionPercentege = comissionPercentege;
	}

	public double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}

	public double getComissionPercentege() {
		return comissionPercentege;
	}

	public void setComissionPercentege(double comissionPercentege) {
		this.comissionPercentege = comissionPercentege;
	}

	@Override
	public String toString() {
		return "Empregado Comissionado [Valor das vendas= " + salesValue + ", Percentual de comissão= " + comissionPercentege
				+ ", Nome= " + name + ", CPF= " + cpf + "]";
	}
	
	@Override
	public double calculateIncome() {
		return salesValue * comissionPercentege / 100;
	}
	

}
