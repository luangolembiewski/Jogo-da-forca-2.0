package jogo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JogoForca {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> dados = new ArrayList();
		String continuar = "sim";
		int round = 0;

		int valor = 0;

		while (continuar.equals("sim")) {

			String palavra = SorteioPalavras.sorteio(); // Chamando o metodo

			String tipoNome = palavra.substring(palavra.indexOf("-"), palavra.length());
			palavra = palavra.substring(0, palavra.indexOf("-"));

			round = round + 1;

			valor = 0;
			int acerto = 0;
			int erro = 0;
			String letra = "";
			String letrasDigitadas = "";
			String posicaoLetra = "";
			String barrinha = "";
			int j = 0;
			String jogador = "";
			String resultado = "";

			String[] palavraArray = palavra.split(" ");

			for (int a = 0; a < palavraArray.length; a++) {
				barrinha = barrinha + "_ ";

			}

			System.out.println("|=====================================================|");
			System.out.println("|=====FFFFF=====OOOO===RRRRRR=====CCCCC======AAAA=====|");
			System.out.println("|====FF========O====O==RR===RR===CC=========AA==AA====|");
			System.out.println("|====FFFFF=====O====O==RR=RRR====CC=========AAAAAA====|");
			System.out.println("|====FF======= O====O==RR==RR====CC========AA====AA===|");
			System.out.println("|====FF======= O====O==RR===RR===CC========AA====AA===|");
			System.out.println("|====FF=========OOOO===RR====RR===CCCCC====AA====AA===|");
			System.out.println("|=====================================================|");

			System.out.println("             Aperte 'Enter' para iniciar");
			leia.nextLine();

			System.out.println("Qual o nome do jogador:");
			jogador = leia.nextLine();

			System.out.println("________________               ");
			System.out.println("|                              ");
			System.out.println("|                  Dica: " + tipoNome);
			System.out.println("|                              ");
			System.out.println("|                              ");
			System.out.println("|" + barrinha);

			while ((acerto < palavraArray.length) && (erro < 6)) {
				System.out.println("Digite uma letra");
				letra = leia.next();
				System.out.println("===============================================");
				letra = letra.toUpperCase();

				while (letrasDigitadas.contains(letra)) {
					System.out.println("Letra repetida!");
					System.out.println("Digite novamente:");
					letra = leia.next();
					letra = letra.toUpperCase();
				}

				letrasDigitadas = letrasDigitadas + ". " + letra;
				posicaoLetra = "";
				List<Integer> posicaoLetraInt = new ArrayList<Integer>();
				for (j = 0; j < palavraArray.length; j++) {
					if (palavraArray[j].equals(letra)) {
						int x = 0;
						posicaoLetraInt.add(x, j);
						x = x++;
						acerto = acerto + 1;
					}
				}

				if (!palavra.contains(letra)) {
					erro = erro + 1;
					System.out.println("LETRA INEXISTENTE!!");
				} else if (letrasDigitadas.contains(letra)) {
					System.out.println("CONTEM!!");
				}

				for (int c = 0; c < posicaoLetraInt.size(); c++) {
					int inicio = (posicaoLetraInt.get(c) * 2);
					barrinha = barrinha.substring(0, inicio) + letra
							+ barrinha.substring((inicio + 1), barrinha.length());
				}

				switch (erro) {
				case 0:
					System.out.println("________________      letras digitadas:  ");
					System.out.println("|                     " + letrasDigitadas);
					System.out.println("|                                        ");
					System.out.println("|                     Dica: " + tipoNome);
					System.out.println("|                                        ");
					System.out.println("|" + barrinha);

					break;
				case 1:
					System.out.println("________________      letras digitadas:  ");
					System.out.println("|               O     " + letrasDigitadas);
					System.out.println("|                                        ");
					System.out.println("|                     Dica: " + tipoNome);
					System.out.println("|                                        ");
					System.out.println("|" + barrinha);

					break;
				case 2:
					System.out.println("________________      letras digitadas:  ");
					System.out.println("|               O     " + letrasDigitadas);
					System.out.println("|               |                        ");
					System.out.println("|                     Dica: " + tipoNome);
					System.out.println("|                           ");
					System.out.println("|" + barrinha);

					break;
				case 3:
					System.out.println("________________      letras digitadas:   ");
					System.out.println("|               O     " + letrasDigitadas);
					System.out.println("|              /|                         ");
					System.out.println("|                     Dica: " + tipoNome);
					System.out.println("|                           ");
					System.out.println("|" + barrinha);

					break;
				case 4:
					System.out.println("________________      letras digitadas:   ");
					System.out.println("|               O     " + letrasDigitadas);
					System.out.println("|              /|\\                       ");
					System.out.println("|                     Dica: " + tipoNome);
					System.out.println("|                                         ");
					System.out.println("|" + barrinha);

					break;
				case 5:
					System.out.println("________________      letras digitadas:   ");
					System.out.println("|               O     " + letrasDigitadas);
					System.out.println("|              /|\\                       ");
					System.out.println("|              /      Dica: " + tipoNome);
					System.out.println("|                                         ");
					System.out.println("|" + barrinha);
					break;
				}

			}
			if (erro == 6) {
				System.out.println("VOCE PERDEU, TENTE NOVAMENTE!!         ");
				System.out.println("________________                       ");
				System.out.println("|               O                      ");
				System.out.println("|              /|\\      Dica: " + tipoNome);
				System.out.println("|              / \\                    ");
				System.out.println("|");
				System.out.println("|" + palavra);
				resultado = ("PERDEU");
			} else if (acerto == palavraArray.length) {
				System.out.println("======================================");
				System.out.println("    PARABÉNS " + jogador.toUpperCase() + ", VOCÊ GANHOU!!");
				resultado = ("GANHOU");
			}
			System.out.println("======================================");
			System.out.println("Deseja jogar novamente? (sim/nao)");
			leia.nextLine();
			continuar = leia.nextLine();
			continuar = continuar.toLowerCase();

			dados.add("Round: " + round + " {Jogador: " + jogador + "; " + resultado + " ; Dica: " + tipoNome + " ; Palavra: " + palavra + "}");
			if (continuar.equals("sim")) {
				for (int i = 0; i < 10; i++) {
					System.out.println("");
				}
			}
		}
		System.out.println("======================================");
		for (int i = 0; i < dados.size(); i++) {
			System.out.println(dados.get(i));
		}

		System.out.println("======================================");
		System.out.println("            FIM DO JOGO!!");
	}
}