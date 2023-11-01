package view;

import java.util.Scanner;
import main.Calculos;

public class Jogo {
	static Scanner input = new Scanner(System.in);
	static int pontos = 0;
	static Calculos calculos;
	
	public static void main(String[] args) {
		Jogo.play();
		
	}
	
	public static void play() {
		System.out.println("Informe o nivel de desejado [1], [2]:");
		int nivel = Jogo.input.nextInt();
		
		Jogo.calculos = new Calculos(nivel);
		
		System.out.println("Informe o resultado para a seguinte operaçã: ");
		
		if (calculos.getOperacao() == 0) {
			System.out.println(calculos.getValor1() + " + " + calculos.getValor2());
			int resposta = Jogo.input.nextInt();
			if (calculos.somar(resposta)) {
				Jogo.pontos += 1;
				System.out.println("Você tem " + Jogo.pontos + " ponto[s].");
			}
		}
		
		if (calculos.getOperacao() == 1) {
			System.out.println(calculos.getValor1() + " - " + calculos.getValor2());
			int resposta = Jogo.input.nextInt();
			if (calculos.subtrair(resposta)) {
				Jogo.pontos += 1;
				System.out.println("Você tem " + Jogo.pontos + " ponto[s].");
			}
		}
		
		if (calculos.getOperacao() == 2) {
			System.out.println(calculos.getValor1() + " * " + calculos.getValor2());
			int resposta = Jogo.input.nextInt();
			if (calculos.multiplicar(resposta)) {
				Jogo.pontos += 1;
				System.out.println("Você tem " + Jogo.pontos + " ponto[s].");
			} else {
				System.out.println("Essa operação" + calculos.getOperacao() + " não e reconhecida");
			}
		}
		
		System.out.println("deseja continuar? [1 - sim, 0 - não]");
		int continuar = Jogo.input.nextInt();
		
		if( continuar == 1) {
			Jogo.play();
		} else {
			System.out.println("Você fez " + Jogo.pontos + " ponto(s)");
			System.out.println("Até a proxima!");
			System.exit(0);
		}
	}

}
