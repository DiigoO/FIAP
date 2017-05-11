package br.com.fiap.Aula2;
public class Funcionario extends Pessoa {
	
	private double salario;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", getSalario()=" + getSalario() + ", getCpf()=" + getCpf()
				+ ", getNome()=" + getNome() + ", getCPF()=" + getCPF() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}