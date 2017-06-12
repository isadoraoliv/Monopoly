/*A classe Residencia é um tipo de imovel
 * sendo assim ela herda os atributos da classe
 * Imovel.
 * E ela pode ser adicionado em alguma posição
 * do tabuleiro.
 * 
 */

package imovel;

public class Residencia extends Imovel{
	
	/*
	 * Atribuindo valores aos atributos das classe Residencia
	 */
	public void setstart(){
		setDono(999);
		setTipo("Residencia");
		setPreco(5000);
		setAluguel(1000);
	}
}
