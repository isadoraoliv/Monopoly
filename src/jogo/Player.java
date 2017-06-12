/*Cada jogador vai ter uma id, um saldo 
 * inicial, a quantidade de jogadas que
 * fez durante o jogo, poderá jogar o dados
 * e será coletado informações sobre o 
 * redimento do jogador no decorreto do jogo
 * 
 */

package jogo;


public class Player {
	
	private int id;
	private int saldo;
	private int rendimento;
	private int dado = 0;
	private int posicao = 0;
	private int tamanho;
	private int nplayers; 
	
	/*
	 * Funcões acessadoras e modificadoras
	 */
	public int getSaldo() {
		return saldo;
	}
	
	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getRendimento() {
		return rendimento;
	}
	public void setRendimento(int rendimento) {
		this.rendimento = rendimento;
	}
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado= dado;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getNplayers() {
		return nplayers;
	}
	public void setNplayers(int nplayers) {
		this.nplayers = nplayers;
	}
		
}
