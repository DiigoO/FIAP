package br.com.fiap.Aula4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;

public class Main {

//	public static void main(String[] args) {
//
//		Properties prop = new Properties(System.getProperties());
//		System.out.println("Propriedade testando "+prop.getProperty("testando"));
//		FileInputStream arquivoPropr = null;
//		try {
//			arquivoPropr = new FileInputStream("arquivo.properties");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		prop = new Properties(System.getProperties());
//		prop.setProperty("testando","1");
//		try {
//			prop.load(arquivoPropr);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.setProperties(prop);
//
//		ArrayList<Cliente> listaCliente=new ArrayList<Cliente>();
//		Cliente cliente3 = new Cliente(774,"Matias");
//		Cliente cliente1 = new Cliente(4,"João");
//		Cliente cliente2 = new Cliente(3,"Maria");
//		Cliente cliente4 = new Cliente(28,"Marcelo");
//		listaCliente.add(cliente1);
//		listaCliente.add(cliente2);
//		listaCliente.add(cliente3);
//		listaCliente.add(cliente4);
//		System.out.println(listaCliente);
//		Collections.sort(listaCliente, new Comparador());
//		System.out.println(listaCliente);
//	}
}
