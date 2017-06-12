/*A classe Comercio é um tipo de imovel
 * sendo assim ela herda os atributos da classe
 * Imovel.
 * E ela pode ser adicionado em alguma posição
 * do tabuleiro.
 * 
 */

package imovel;

public class Comercio extends Imovel{
	
	/*
	 * Atribuindo valores aos atributos das classe Comercio
	 */
	public void setstart(){
		setDono(999);
		setTipo("Comercio");
		setPreco(1000);
		setAluguel(300);
	}
}
