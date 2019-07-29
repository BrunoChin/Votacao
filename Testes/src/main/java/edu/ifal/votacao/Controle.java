/**
 * 
 */
package edu.ifal.votacao;

/**
 * @author priscylla
 *
 */
public class Controle {
	
	public boolean permiteVotar(int idade) {
		if (idade < 16)
			return false;
		return true;
	}
	
	public boolean votoObrigatorio(int idade) {
		if(idade > 70)
			return false;
		if(idade >= 16 && idade < 18)
			return false;
		return permiteVotar(idade);
	}

}
