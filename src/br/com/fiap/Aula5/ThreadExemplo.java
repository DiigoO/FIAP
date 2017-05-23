package br.com.fiap.Aula5;

public class ThreadExemplo extends Thread{
	
	public void run(){
		for (int i = 0; i < 1_000_000; i++) {
			System.out.println(getName()+": "+i);
		}
	}

}
