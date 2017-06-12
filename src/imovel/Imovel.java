/*Cada imovel vai ter um dono, e pode ser 
 * de um tipo (hotel, comercio, residencia,
 * industria, clube social) e cada imovel
 * desse tem um preco e uma taxa de aluguel.
 * 
 */

package imovel;

public class Imovel {
	
	/*
	 * Atributos da classe Imovel
	 */
	private int dono;
	private String tipo;
	private int preco;
	private int aluguel;
	private int posicao;
	
	/*
	 * Funções acessadoras e modificadoras
	 */
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getAluguel() {
		return aluguel;
	}
	public void setAluguel(int aluguel) {
		this.aluguel = aluguel;
	}
	public int getDono() {
		return dono;
	}
	public void setDono(int dono) {
		this.dono = dono;	
	}

}
