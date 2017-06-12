/*A classe Industria é um tipo de imovel
 * sendo assim ela herda os atributos da classe
 * Imovel.
 * E ela pode ser adicionado em alguma posição
 * do tabuleiro.
 * 
 */

package imovel;

public class Industria extends Imovel{
	/*
	 * Atribuindo valores aos atributos das classe Industria
	 */
	public void setstart(){
		setDono(999);
		setTipo("Industria");
		setPreco(1700);
		setAluguel(85);
	}
}
