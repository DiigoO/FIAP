package br.com.fiap.Aula4;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		
		LocalDateTime init = LocalDateTime.now();
		for(int i=0; i<10_000_000;i++){
			list.add("o/-"+i);
		}	
		LocalDateTime finilize = LocalDateTime.now();
		System.out.println("Time ArrayList INSERT: " +ChronoUnit.MILLIS.between(init,finilize));

		init = LocalDateTime.now();
		for(int i=0; i<10_000_000;i++){
			list2.add("lol-"+i); 
		}
		finilize = LocalDateTime.now();
		System.out.println("Time LinkedList INSERT: " +ChronoUnit.MILLIS.between(init,finilize));
		
		init = LocalDateTime.now();
		list.get(50_000);
		finilize = LocalDateTime.now();		
		System.out.println("Time ArrayList GET "+ChronoUnit.MILLIS.between(init,finilize));
		
		init = LocalDateTime.now();
		list2.get(50_000);
		finilize = LocalDateTime.now();		
		System.out.println("Time LinkedList GET "+ChronoUnit.MILLIS.between(init,finilize));

		

	}

}
