package br.com.fiap.Aula5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.WeakHashMap;

public class Atividade {

	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.of(2012, 9, 10, 12, 00);
		System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss")));
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getYear());
		System.out.println(date.getYear() / 100 + 1);
		
		ArrayList<String> arraylist = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		Stack<String> stackList = new Stack<>();
		HashSet<Integer> hashsetList = new HashSet<>();
		HashMap<Integer, Integer> hashmap = new HashMap<>();
		WeakHashMap<Integer, Integer> weakhashmap = new WeakHashMap<>();
		
		LocalDateTime init = LocalDateTime.now();
		LocalDateTime finalize = LocalDateTime.now();
		
				
		System.out.println(arrayVSlinkedInsert(arraylist, linkedList, init, finalize));
		System.out.println(arrayVSlinkedSearch(arraylist, linkedList, init, finalize));
		System.out.println(stackVShashsetInsert(stackList, hashsetList, init, finalize));
		System.out.println(stackVShashsetSearch(stackList, hashsetList, init, finalize));	
		System.out.println(hashmapVSweakhashmapInsert(hashmap, weakhashmap, init, finalize));
		System.out.println(hashmapVSweakhashmapSearch(hashmap, weakhashmap, init, finalize));
		
	}

	private static String hashmapVSweakhashmapInsert(HashMap<Integer, Integer> list, WeakHashMap<Integer, Integer> list2, LocalDateTime init, LocalDateTime finalize) {
		init = LocalDateTime.now();
		for(int i=0; i<10_000_000;i++){
			list.put(i, i);
		}	
		finalize = LocalDateTime.now();
		System.out.println("Time HashMap INSERT: " +ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultHashMap = ChronoUnit.MILLIS.between(init,finalize);

		init = LocalDateTime.now();
		for(int i=0; i<10_000_000;i++){
			list2.put(i, i); 
		}
		finalize = LocalDateTime.now();
		System.out.println("Time WeakHashMap INSERT: " +ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultWeakHashMap = ChronoUnit.MILLIS.between(init,finalize);
		
		if(resultHashMap < resultWeakHashMap){
			return "O melhor tipo de coleção para INSERÇÃO é o HashMap";
		} if(resultHashMap > resultWeakHashMap){
			return "O melhor tipo de coleção para INSERÇÃO é o WeakHashMap";
		}
		else {
			return "Resultado igual";
		}
	}
	
	private static String hashmapVSweakhashmapSearch(HashMap<Integer, Integer> list, WeakHashMap<Integer, Integer> list2, LocalDateTime init, LocalDateTime finalize) {
		init = LocalDateTime.now();
		list.get(50_000);
		finalize = LocalDateTime.now();		
		System.out.println("Time HashMap GET "+ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultHashMap = ChronoUnit.MILLIS.between(init,finalize);
		
		init = LocalDateTime.now();
		list2.get(50_000);
		finalize = LocalDateTime.now();		
		System.out.println("Time WeakHashMap GET "+ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultWeakHashMap = ChronoUnit.MILLIS.between(init,finalize);
		
		if(resultHashMap < resultWeakHashMap){
			return "O melhor tipo de coleção para BUSCA é o HashMap";
		}else if(resultHashMap > resultWeakHashMap){
			return "O melhor tipo de coleção para BUSCA é o WeakHashMap";
		}
		else {
			return "Resultado igual";
		}
	}

	private static String arrayVSlinkedInsert(ArrayList<String> list, LinkedList<String> list2, LocalDateTime init, LocalDateTime finalize) {
		init = LocalDateTime.now();
		for(int i=0; i<10_000_000;i++){
			list.add("o/-"+i);
		}	
		finalize = LocalDateTime.now();
		System.out.println("Time ArrayList INSERT: " +ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultArrayList = ChronoUnit.MILLIS.between(init,finalize);

		init = LocalDateTime.now();
		for(int i=0; i<10_000_000;i++){
			list2.add("lol-"+i); 
		}
		finalize = LocalDateTime.now();
		System.out.println("Time LinkedList INSERT: " +ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultLinkedList = ChronoUnit.MILLIS.between(init,finalize);
		
		if(resultArrayList < resultLinkedList){
			return "O melhor tipo de coleção para INSERÇÃO é o ArrayList";
		} if(resultArrayList > resultLinkedList){
			return "O melhor tipo de coleção para INSERÇÃO é o resultLinkedList";
		}
		else {
			return "Resultado igual";
		}
	}

	private static String arrayVSlinkedSearch(ArrayList<String> list, LinkedList<String> list2, LocalDateTime init, LocalDateTime finalize) {
		
		init = LocalDateTime.now();
		list.get(50_000);
		finalize = LocalDateTime.now();		
		System.out.println("Time ArrayList GET "+ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultArrayList = ChronoUnit.MILLIS.between(init,finalize);
		
		init = LocalDateTime.now();
		list2.get(50_000);
		finalize = LocalDateTime.now();		
		System.out.println("Time LinkedList GET "+ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultLinkedList = ChronoUnit.MILLIS.between(init,finalize);
		
		if(resultArrayList < resultLinkedList){
			return "O melhor tipo de coleção para BUSCA é o ArrayList";
		} if(resultArrayList > resultLinkedList){
			return "O melhor tipo de coleção para BUSCA é o resultLinkedList";
		}
		else {
			return "Resultado igual";
		}
	}
	
	private static String stackVShashsetInsert(Stack<String> list, HashSet<Integer> list2, LocalDateTime init, LocalDateTime finalize) {
		init = LocalDateTime.now();
		for(int i=0; i<10_000_000;i++){
			list.add("o/-"+i);
		}	
		finalize = LocalDateTime.now();
		System.out.println("Time Stack INSERT: " +ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultStack = ChronoUnit.MILLIS.between(init,finalize);

		init = LocalDateTime.now();
		for(int i=0; i<10_000_000;i++){
			list2.add(i); 
		}
		finalize = LocalDateTime.now();
		System.out.println("Time Hashset INSERT: " +ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultHashSet = ChronoUnit.MILLIS.between(init,finalize);
		
		if(resultStack < resultHashSet){
			return "O melhor tipo de coleção para INSERÇÃO é o Stack";
		}else if(resultStack > resultHashSet){
			return "O melhor tipo de coleção para INSERÇÃO é o resultHashSet";
		}
		else {
			return "Resultado igual";
		}
	}

	private static String stackVShashsetSearch(Stack<String> list, HashSet<Integer> list2, LocalDateTime init, LocalDateTime finalize) {
		
		init = LocalDateTime.now();
		list.get(50_000);
		finalize = LocalDateTime.now();		
		System.out.println("Time Stack GET "+ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultStack = ChronoUnit.MILLIS.between(init,finalize);
		
		init = LocalDateTime.now();
		list2.stream().filter(c -> c.equals(50_000));
		finalize = LocalDateTime.now();		
		System.out.println("Time HashSet GET "+ChronoUnit.MILLIS.between(init,finalize) + "ms");
		Long resultHashSet = ChronoUnit.MILLIS.between(init,finalize);
		
		if(resultStack < resultHashSet){
			return "O melhor tipo de coleção para BUSCA é o Stack";
		}else if(resultStack > resultHashSet){
			return "O melhor tipo de coleção para BUSCA é o resultHashSet";
		}
		else {
			return "Resultado igual";
		}
	}

}
