/*A classe Hotel é um tipo de imovel
 * sendo assim ela herda os atributos da classe
 * Imovel.
 * E ela pode ser adicionado em alguma posição
 * do tabuleiro.
 * 
 */

package imovel;

public class Hotel extends Imovel{
	
	/*
	 * Atribuindo valores aos atributos das classe Hotel
	 */
	 
	public void setstart(){
		setDono(999);
		setTipo("Hotel");
		setPreco(2000);
		setAluguel(300);
	}
}
