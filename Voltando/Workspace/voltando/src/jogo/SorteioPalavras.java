package jogo;

import java.util.ArrayList;
import java.util.Random;

public class SorteioPalavras {
	String palavra;

	public static String sorteio() {

		Random aleatorio = new Random();
		ArrayList palavrasPasta = new ArrayList<String>();
		int tipo = 0;
		String tipoNome = " ";

		int valor = 0;
		valor = aleatorio.nextInt(4);
		tipo = valor;

		switch (tipo) {
		case 0:
			tipoNome = "Fruta!";
			palavrasPasta.add("m e l a n c i a".toUpperCase());
			palavrasPasta.add("a b a c a x i".toUpperCase());
			palavrasPasta.add("b a n a n a".toUpperCase());
			palavrasPasta.add("p i t a y a".toUpperCase());
			palavrasPasta.add("m a r a c u j a".toUpperCase());
			palavrasPasta.add("a b a c a t e".toUpperCase());
			palavrasPasta.add("t a n g e r i n a".toUpperCase());
			palavrasPasta.add("l i c h i a".toUpperCase());
			break;
		case 1:
			tipoNome = "Carro!";
			palavrasPasta.add("f u s c a".toUpperCase());
			palavrasPasta.add("g o l".toUpperCase());
			palavrasPasta.add("s a v e i r o".toUpperCase());
			palavrasPasta.add("g o l f".toUpperCase());
			palavrasPasta.add("p a m p a".toUpperCase());
			palavrasPasta.add("m o n t a n a".toUpperCase());
			palavrasPasta.add("h i l u x".toUpperCase());
			palavrasPasta.add("b e l i n a".toUpperCase());
			break;
		case 2:
			tipoNome = "Cidade!";
			palavrasPasta.add("o r l a n d o".toUpperCase());
			palavrasPasta.add("c h i c a g o".toUpperCase());
			palavrasPasta.add("v e n e z a".toUpperCase());
			palavrasPasta.add("r o m a".toUpperCase());
			palavrasPasta.add("l i s b o a".toUpperCase());
			palavrasPasta.add("p a r i s".toUpperCase());
			palavrasPasta.add("l o n d r e s".toUpperCase());
			palavrasPasta.add("b a r c e l o n a".toUpperCase());
			break;
		case 3:
			tipoNome = "Cor!";
			palavrasPasta.add("a m a r e l o".toUpperCase());
			palavrasPasta.add("p r e t o".toUpperCase());
			palavrasPasta.add("g e l o".toUpperCase());
			palavrasPasta.add("b e g e".toUpperCase());
			palavrasPasta.add("c i n z a".toUpperCase());
			palavrasPasta.add("r o s a".toUpperCase());
			palavrasPasta.add("v e r m e l h o".toUpperCase());
			palavrasPasta.add("r o x o".toUpperCase());
			break;
		default:
			break;
		}

		valor = aleatorio.nextInt(8); // escolhe um numero aleatório entre 0 e 7
		String palavra = (String) (palavrasPasta.get(valor)); // escolhe uma palavra aleatória entre 8
		return palavra + "-" + tipoNome;
	}

}
