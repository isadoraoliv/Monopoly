/*Quando o jogador cair em uma posição 
 * do tabuleiro, ele pode ter a opção
 * de passa a sua vez, para outro jogador
 * 
 */

package jogo;

import imovel.Imovel;

public class PassaVez extends Imovel{
	
	/*
	 * Atribuindo valores aos atributos das classe PassaVez
	 */
	public void setstart(){
		setDono(999);
		setTipo("Pass");
		setPreco(0);
		setAluguel(0);
	}

	public void setpass() {
		
	}
}