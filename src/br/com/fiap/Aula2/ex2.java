package br.com.fiap.Aula2;

public class ex2 {

	public static void main(String[] args) {
		Integer ar[] = {5,12,58,97,56,97};
		
		Integer max = null;
		Integer min = null;
		Double soma = 0d;
		Double media;
		for(Integer i: ar){
			soma += i;
			if(max == null || i > max){
				max = i;
			}
			if (min == null || i < min){
				min = i;
			}
		}
		
		media = soma / ar.length;
		
		System.out.println("O valor minimo �: " + min);
		System.out.println("O valor maximo �: " + max);
		System.out.println("O valor somado �: " + soma);
		System.out.println("A media �: " + media);
	

	}

}
