/*
 * A classe le o arquivo de jogadas e monta
 * as jogadas de cada jogador conforme a leitura
 * do arquivo. Isso inclui id do jogador, se 
 * quando ele cair em um imovel se deverá
 * comprar, alugar ou passar a vez. 
 * 
 */

package jogo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import imovel.Imovel;

public class Jogadas {
	
	static final Logger logger3 = Logger.getLogger(Tabuleiro.class);
	
	public void Joga() throws FileNotFoundException{
		
		/*
		 * variavel que recebe o valor inicial de jogadas pra servir de tamanho no for
		 */
		int valorfixo = 0;
		/*
		 * ira armazendo os valores da funcao - parseInt(parts[x]);
		 */
		int valorinteger = 0; 
		int contador = 0;
		int contador2 = 0;
		int contaArray = 0;
		
		/*
		 * Guardar informações do arquivo em um buffer
		 */
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/HarrY/Desktop/Arquivos_exemplo/Arquivos_exemplo/jogadas2.txt")); 
		logger3.info("Informações guardadas no arquivo.");
		
		  try { 
		  StringBuilder sb = new StringBuilder(); 
		  String line = br.readLine(); 

			/*
			 * Enquanto o arquivo for diferente de null, vai continuar lendo as informações do arquivo
			 */
		  	while(line!=null){ 
		  		sb.append(line); 
		  		sb.append(System.lineSeparator()); 
		  		line = br.readLine(); 
		  } 
		  logger3.info("Arquivo foi lido!");	
		  
		  String everything = sb.toString(); 
		  String[] parts = everything.split(";"); //COMO NAO CONSIGO LER O ARQUIVO DIVINDO COM O % E A QUEBRA DE LINHA, MUDEI TUDO PARA ;
		  
		  /*
		   * valor da posicao [1] é a quantidade de jogadores criados
		   */
		  ArrayList<Player> players = new ArrayList<Player>();
		  
		  valorfixo = Integer.parseInt(parts[1]);
		  
		  logger3.info("Contagem das jogadas");
		  /*
		   * Estrutura de repetição que conta as jogadas
		   */
		  for(contador=0; contador<valorfixo;contador++){
			  Player p1 = new Player();
			  p1.setId(contador);
			  /*
			   * setando o saldo do jogador
			   */
			  p1.setSaldo(valorinteger = Integer.parseInt(parts[2]));
			  p1.setId(contador);
			  players.add(p1);
		  }

		  /*
		   * valor da posicao [0] é a quantidade de jogadas, sera o for que administra as jogadas
		   * e começa a partir da quarta posicao, a quarta se mostra o ID
		   */
		  valorfixo = Integer.parseInt(parts[0]);
		  valorinteger = Integer.parseInt(parts[3]);
		  contaArray = 3;
		  for(contador2=0; contador2<valorfixo;contador2++){ 
			   /*
			   * //porque todo jogador soh faz 3 jogadas por linha no arquivo, sendo a primeira o id e não precisa aqui
			   */
			  for(contador=0; contador<3;contador++){ 
				  if(contador==0){
					  valorinteger = Integer.parseInt(parts[contaArray]);
					  /*
					   * pula o id que é fornecido
					   */
					  contador++;  
					  contaArray++;
				  }
				  
				  /*
				   * Roda as 2 ultima jogadas de cada jogador.
				   * No if, pega o id do jogador o for serve pra procurar qual dos x jogadores tem a id y
				   * e depois aumenta o contador para pegar o ultimo valor da linha. E o valor
				   * interger armazena o valor do  na variavel
				   * 
				   */
				  logger3.info("Estrutura de repetição, para rodar as 2 ultimas jogadas");
				  for(int i=0; i<2; i++){
					  if(valorinteger==players.get(i).getId()){
						  contaArray++;
						  valorinteger = Integer.parseInt(parts[contaArray]);
						  players.get(i).setId(valorinteger);
						  
						  	int dono1 = 0;
							int dono2 = 0;
							int posiplayer = players.get(i).getPosicao();
							int player = players.get(i).getId();
							/*
							 * muda a posicao do player: posicao atual + o valor, 
							 * depois pega a nova posição em player.get(i).getPosicao()
							 */
							players.get(i).setPosicao(posiplayer+player);
							posiplayer = players.get(i).getPosicao();
							Imovel[] vetor = null;
							dono1 = extracted(vetor)[posiplayer].getDono();
							dono2 = players.get(i).getId();
							
							/*
							 * Passa a vez porque ele já é o dono
							 */
							if( dono1 == dono2 ){
							}
							//999 é o valor  para identificar o banco
							else if(dono1 != dono2 || dono1==999){ 
								int preco =0, saldo =0;
								preco = ((Imovel) extracted(vetor)[posiplayer]).getAluguel();
								saldo = players.get(i).getSaldo();
								if(preco<saldo){
									players.get(i).setSaldo(saldo-preco);
									((Imovel) extracted(vetor)[posiplayer]).setDono(dono2);
								}
								
								else if(preco>saldo){
									System.out.println("Voce e pobre, mas como ainda tem money, fica no jogo");
								}
							}//aqui encerra quando for o banco o dono
							
							else if(dono1 != dono2 || dono1==1000){ //999 � o valor  para identificar o passe a vez	
							}
							
							else{ //aqui a regra seria dono1 != dono2 que seria pagar o aluguel pra outra pessoa
								int aluguel =0, saldo =0;
								aluguel = ((Imovel) extracted(vetor)[posiplayer]).getPreco();
								saldo = players.get(i).getSaldo();
								if(aluguel<saldo){
									players.get(i).setSaldo(saldo-aluguel);
									((Imovel) extracted(vetor)[posiplayer]).setDono(dono2);
								}
								else if(aluguel>saldo){
									System.out.println("Você é pobre, mas como ainda tem money, fica no jogo");
								}
							}
				  	  }
				  }
				  
			  }
			  logger3.info("Jogadas finalizadas!");
		  
		  for(int i=0; i<players.size();i++){
			  System.out.println(players.get(i).getId());
		  }
		  
		  }
	  } catch (IOException ioe) {
	        ioe.printStackTrace();
	    }
		  
	  finally{ 
	  try {
		br.close();
	  } catch (IOException e) {
		e.printStackTrace();
	  }
	  
	  }
	}

	private Imovel[] extracted(Imovel[] vetor) {
		return vetor;
	}

}
