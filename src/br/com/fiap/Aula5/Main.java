package br.com.fiap.Aula5;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

//		ThreadExemplo app1 = new ThreadExemplo();
//		ThreadExemplo app2 = new ThreadExemplo();
//		ThreadExemplo app3 = new ThreadExemplo();
//		ThreadExemplo app4 = new ThreadExemplo();
//		ThreadExemplo app5 = new ThreadExemplo();
//		
//		
//		app1.setName("app1");
//		app1.start();
//		
//		app2.setName("app2");
//		app2.start();
//		
//		app3.setName("app3");
//		app3.start();
//		
//		app4.setName("app4");
//		app4.start();
//		
//		app5.setName("app5");
//		app5.start();
		
//		Cavalo cavalo = new Cavalo("Mazinho");
//		cavalo.start();
//		
//		Cavalo cavalo2 = new Cavalo("Paulinha");
//		cavalo2.start();
//		
//		Cavalo cavalo3 = new Cavalo("Guilherme");
//		cavalo3.start();
		
		try {

//			Path origem = Paths.get("./textos/");
//			Path destino = Paths.get("./temp/");
//			Files.walkFileTree(origem, new CopiarArquivos(destino));
			Files.list(Paths.get("./temp")).filter(p -> p.toString().endsWith(".java"))
			.forEach(System.out::println);

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
