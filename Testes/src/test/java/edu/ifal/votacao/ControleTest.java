package edu.ifal.votacao;

public class ControleTest {

	public static void main(String[] args) {
		Controle controle = new Controle();
		int idade; 
		boolean podeVotar;
		boolean votoObrogatorio;
		
		/**
		 * Teste 1
		 */
		idade = 10;
		podeVotar = controle.permiteVotar(idade);
		if(podeVotar)
			System.out.println("Falhou no teste 1");
		else
			System.out.println("Passou no teste 1");
		
		/**
		 * Teste 2
		 */
		idade = 20;
		podeVotar = controle.permiteVotar(idade);
		if(podeVotar)
			System.out.println("Passou no teste 2");
		else
			System.out.println("Falhou no teste 2");
		
		/**
		 * Teste 3
		 */
		idade = 16;
		podeVotar = controle.permiteVotar(idade);
		if(podeVotar)
			System.out.println("Passou no teste 3");
		else
			System.out.println("Falhou no teste 3");
		
		idade = 15;
		votoObrogatorio = controle.votoObrigatorio(idade);
		if(votoObrogatorio)
			System.out.println("Falhou no teste 4");
		else
			System.out.println("Passou no teste 4");

		idade = 16;
		votoObrogatorio = controle.votoObrigatorio(idade);
		if(votoObrogatorio)
			System.out.println("Falhou no teste 5");
		else
			System.out.println("Passou no teste 5");

		idade = 18;
		votoObrogatorio = controle.votoObrigatorio(idade);
		if(votoObrogatorio)
			System.out.println("Passou no teste 6");
		else
			System.out.println("Falhou no teste 6");

		idade = 19;
		votoObrogatorio = controle.votoObrigatorio(idade);
		if(votoObrogatorio)
			System.out.println("Passou no teste 7");
		else
			System.out.println("Falhou no teste 7");

		idade = 70;
		votoObrogatorio = controle.votoObrigatorio(idade);
		if(votoObrogatorio)
			System.out.println("Passou no teste 8");
		else
			System.out.println("Falhou no teste 8");

		idade = 71;
		votoObrogatorio = controle.votoObrigatorio(idade);
		if(votoObrogatorio)
			System.out.println("Falhou no teste 9");
		else
			System.out.println("Passou no teste 9");

	}

}
