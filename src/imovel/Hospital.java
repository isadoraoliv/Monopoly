/*A classe Hospital é um tipo de imovel
 * sendo assim ela herda os atributos da classe
 * Imovel.
 * E ela pode ser adicionado em alguma posição
 * do tabuleiro.
 * 
 */

package imovel;

public class Hospital extends Imovel{
	
	/*
	 * Atribuindo valores aos atributos das classe Hospital
	 */
	public void setstart(){
		setDono(999);
		setTipo("Hospital");
		setPreco(10000);
		setAluguel(40);
	}
}
