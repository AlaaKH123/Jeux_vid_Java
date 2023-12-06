import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Test {

	//_____________________ Fonction qui Prend un element aleatoire d'une liste donné en paramétre_________________
	
	public static<T> T getRandomElement(List<T> list) {
	        Random random = new Random();
	        int randomIndex = random.nextInt(list.size());
	        return list.get(randomIndex);				}
	
	
	public static void main(String[] args) {
		
		
		 String ch ;
		
		try {
			// on met les question reponse dans des liste pour les parcourir est assure ques le meme question ne se 
			//repéte pas pour un meme joueur 
			
			ArrayList<String> Quest_rep_j1 = new ArrayList<String>();
			ArrayList<String> Quest_rep_j2 = new ArrayList<String>();
			
			int p=0 ; //longueur de la liste question reponse de joueur 1
			int s =0; //longueur de la liste question reponse de joueur 2
			
			
			// Tous les lignes de fichier seront transformés en des elements de une Liste 
			List<String> allLines = Files.readAllLines(Paths.get("Jeux.txt"));
			// File sous forme d une liste : 
			// System.out.println(allLines);	
			
			
			// Liste de questions reponse pour le joueur 1 :
			
			for (int i=0;i<=allLines.size();i++)
			{
				ch=getRandomElement(allLines);
				Quest_rep_j1.add(ch);
				allLines.remove(ch);
				p=p+1;
				if(p==3)
					break ; 
			}
			// Liste de questions reponse pour le joueur 2 :
			
			for (int i=0;i<=allLines.size();i++)
			{
				ch=getRandomElement(allLines);
				Quest_rep_j2.add(ch);
				allLines.remove(ch);
				s=s+1;
				if(s==3)
					break ; 
			}
			//System.out.println(Quest_rep_j1);
			//System.out.println(Quest_rep_j2);
			//System.out.println(ch);
			
			
			
			// Prendre juste le question : 	
			//System.out.println(ch.substring(0, ch.indexOf(':')));
			// Prendre juste la reponse :
			//System.out.println(ch.substring(ch.indexOf(':')+1));	
			
			List <String> L = new ArrayList<String>();
			L.add("abcdefghijklmn"); 
			L.add("Benzema"); 
			L.add("leo messi"); 
			
			String sh = "Benzema";
			System.out.println("---"+sh.charAt(3)+"---");
			
			
			
			
			
			
			
			} catch (IOException e) {
			e.printStackTrace();
			}
	
		
		// Inserer les donneés des joueurs : 
		
		String j1 , j2 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom du joueur 1 :");
		j1 =sc.nextLine();
		System.out.println("Nom du joueur 2 :");
		j2 =sc.nextLine();
		
		System.out.println(args[1]);
		
		
		
		
		
	}
	}
