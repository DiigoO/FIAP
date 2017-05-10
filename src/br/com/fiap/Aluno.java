package br.com.fiap;

public class Aluno {
	
	private int codigoAluno;
	private String nomeAluno;
	
	
	public int getCodigoAluno() {
		return codigoAluno;
	}
	public void setCodigoAluno(int codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	@Override
	public String toString() {
		return "Aluno [codigoAluno=" + codigoAluno + ", nomeAluno=" + nomeAluno + "]";
	}
	
	public Aluno(int codigoAluno, String nomeAluno) {
		super();
		this.codigoAluno = codigoAluno;
		this.nomeAluno = nomeAluno;
	}
	
}
