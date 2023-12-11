// Voici ma solution concernant le problème Advent of Code 2022 day two : "https://adventofcode.com/2022/day/2"

package adventOfCode2022;

import java.io.BufferedReader;
import java.io.FileReader;

public class Daytwo {
	public static void main(String[] args) throws Exception {

// Adversaire joue : A = Pierre; B = Papier; C = Ciseaux;

// Score par manche: défaite = 0 points ; nul = 3 points ; victoire = 6 points ;

// Pour la partie 2 : X = on doit perdre ; Y = on doit faire un nul ; Z = on doit gagner;

		String ligne = "";
		int score = 0;
		BufferedReader br = new BufferedReader(
				new FileReader("D:\\Programmes Pro\\ECLIPSE\\Travaux\\Ressources AdventOfCode\\InputDay2-2022.txt"));
		while ((ligne = br.readLine()) != null) { // chaque ligne est parcourue

			switch (ligne) { // switch case, dès que ligne correspond à l'un de ces cas, on incrémente score
								// en fonction;
			// "
			case "A X": // Ici je choisis les ciseaux contre la pierre pour perdre (X)
				score += 3 + 0; // points pour le choix + points en fonction du résultat de la manche
				break;
			case "A Y": // Ici je choisis la pierre contre la pierre pour faire un nul (Y)
				score += 1 + 3;
				break;
			case "A Z": // Ici je choisis le papier contre la pierre pour gagner (Z)
				score += 2 + 6;
				break;
			case "B X":
				score += 1 + 0;
				break;
			case "B Y":
				score += 2 + 3;
				break;
			case "B Z":
				score += 3 + 6;
				break;
			case "C X":
				score += 2 + 0;
				break;
			case "C Y":
				score += 3 + 3;
				break;
			case "C Z":
				score += 1 + 6;
				break;
			}
		}
		System.out.println(score);
	}
}
/*
 * Switch case partie 1 // Je répond : X = Pierre (1point); Y = Papier
 * (2points); Z=Ciseaux (3points); //switch (ligne) { // switch case, dès que
 * ligne correspond à l'un de ces cas, on incrémente score; //" case "A X":
 * score += 1 + 3; // points pour le choix + points en fonction du résultat de
 * la manche break; case "A Y": score += 2 + 6; break; case "A Z": score += 3 +
 * 0; break; case "B X": score += 1 + 0; break; case "B Y": score += 2 + 3;
 * break; case "B Z": score += 3 + 6; break; case "C X": score += 1 + 6; break;
 * case "C Y": score += 2 + 0; break; case "C Z": score += 3 + 3; break; }
 */