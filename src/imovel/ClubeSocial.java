/*A classe ClubeSocial é um tipo de imovel
 * sendo assim ela herda os atributos da classe
 * Imovel.
 * E ela pode ser adicionado em alguma posição
 * do tabuleiro.
 * 
 */

package imovel;

public class ClubeSocial extends Imovel{
	
	/*
	 * Atribundo valores aos atributos da classe ClubeSocial
	 */
	public void setstart(){
		setDono(1000);
		setTipo("start");
		setPreco(0);
		setAluguel(0);
	}
}
