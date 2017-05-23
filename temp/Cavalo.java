package br.com.fiap.Aula5;

import javax.sound.midi.Track;

public class Cavalo extends Thread{
	
	private String nome;
	
	public Cavalo(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void run(){
		try{
			for (int i = 0; i < 10; i++) {
				Thread.sleep((long)(Math.random() * 5000));
				System.out.println(nome+" "+i*100/10+"%...");
			}
			System.out.println(nome+" ganhou!!!");
			System.exit(1);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
