package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.lessons.java.christmas.pojo.Gift;

public class WishList {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
//		List<String> gifts = new ArrayList<>();
//		
//		while (true) {
//            System.out.print("Inserisci il nome del regalo: ");
//            String regalo = in.nextLine();
//            
//            
//         // Aggiungere il regalo alla lista
//            gifts.add(regalo);
//            
//            System.out.println("Lunghezza della lista: " + gifts.size());
//            
//            System.out.println("Vuoi aggiungere un altro regalo?");
//            String gift=in.nextLine();
//
//            // Verificare se l'utente vuole fermarsi
//            if ( gift.equals("no")) {
//                break;
//            }  
//		}
//		in.close();
//		
//		Collections.sort(gifts);
//		
//		 System.out.println("Lista dei regali di Natale:");
//
//	        for (String regalo : gifts) {
//	            System.out.println("- " + regalo);
//	        }
		
		 List<Gift> gifts = new ArrayList<>();
	        

	        while (true) {
	            System.out.print("Inserisci il nome del regalo: ");
	            String nomeRegalo = in.nextLine();

	            System.out.print("A chi è destinato il regalo? (mamma, papà, cugino, ...): ");
	            String destinatario = in.nextLine();

	            Gift regalo = new Gift(nomeRegalo, destinatario);
	            gifts.add(regalo);

	            System.out.println("Lunghezza della lista: " + gifts.size());

	            System.out.println("Vuoi aggiungere un altro regalo? (sì/no)");
	            String risposta = in.nextLine().toLowerCase();

	            if (!risposta.equals("sì") || !risposta.equals("si")) {
	                break;
	            }
	        }

	        System.out.print("Vuoi ordinare la lista per nome o per destinatario? ");
	        String ordinamento = in.nextLine().toLowerCase();

	        if (ordinamento.equals("nome")) {
	            Collections.sort(gifts, Comparator.comparing(regalo -> regalo.getName()));
	        } else if (ordinamento.equals("destinatario")) {
	            Collections.sort(gifts, Comparator.comparing(regalo -> regalo.getReceiver()));;
	        } 

	        in.close();

	        System.out.println("Lista dei regali di Natale:");

	        for (Gift regalo : gifts) {
	        	System.out.println("Nome: " + regalo.getName() + ", Destinatario: " + regalo.getReceiver());
	        }
    }

}
