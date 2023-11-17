package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WishList {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		List<String> gifts = new ArrayList<>();
		
		while (true) {
            System.out.print("Inserisci il nome del regalo: ");
            String regalo = in.nextLine();
            
            
         // Aggiungere il regalo alla lista
            gifts.add(regalo);
            
            System.out.println("Lunghezza della lista: " + gifts.size());
            
            System.out.println("Vuoi aggiungere un altro regalo?");
            String gift=in.nextLine();

            // Verificare se l'utente vuole fermarsi
            if ( gift.equals("no")) {
                break;
            }  
		}
		in.close();
		
		Collections.sort(gifts);
		
		 System.out.println("Lista dei regali di Natale:");

	        for (String regalo : gifts) {
	            System.out.println("- " + regalo);
	        }
	
	}
}
