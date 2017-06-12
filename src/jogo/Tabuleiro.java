/*O tabuleiro é composto de posições, sendo que cada
 * posição será associado a um determinado imovel.
 * O tabuleiro vai ler um arquivo e vai ser construido, 
 * cada posição tem um imovel pré-determinado. Esse 
 * arquivo descreve para cada imovel um valor de compra 
 * e taxa de aluguel. 
 * 
 */

package jogo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import imovel.ClubeSocial;
import imovel.Comercio;
import imovel.Hospital;
import imovel.Hotel;
import imovel.Imovel;
import imovel.Industria;
import imovel.Residencia;


public class Tabuleiro{
	
	static final Logger logger2 = Logger.getLogger(Tabuleiro.class);
	
	/*
	 * Função que cria o tabuleiro
	 */
	public void CriaTabuleiro() throws FileNotFoundException{
	
		BufferedReader br; 
		int valor = 0;
		int valorinicial = 0;
		int contvetor = 0;
		
		
		
		/*
		 * Guardar informações do arquivo em um buffer
		 */
		br = new BufferedReader(new FileReader("C:/Users/HarrY/Desktop/Arquivos_exemplo/Arquivos_exemplo/jogadas2.txt")); 
		logger2.info("Informações guardadas no buffer");
		
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
			logger2.info("Arquivo lido!");
		  
		  String everything = sb.toString(); 
		  String[] parts = everything.split(";");

		  /*
		   * Variavel valor recebe o inteiro convertido do txt
		   */
		  valorinicial = Integer.parseInt(parts[0]);
		
		  /*
		   * Criando um arrayList do tipo Imovel
		   */
		  ArrayList<Imovel> vetor = new ArrayList<Imovel>(); 
		  
		  /*
		   * Estrutura de repetição que inicia o tabuleiro
		   */
		  for(int cont=0;cont<valorinicial;cont++){
			  /*
			   * Clube social é a classe start
			   * Depois faz com que os 4 primeiros valores lidos no arquivos ja tenham sido utilizados parts[0-3]
			   * 
			   */
			  if(cont==0){
				  ClubeSocial start = new ClubeSocial();
				  start.setstart();
				  vetor.add(start);
				  contvetor = 4;
				  valor=Integer.parseInt(parts[contvetor]);
			  }
			  
			  for(int cont2=0;cont2<6;cont2++){
				  	if(cont2==0 || cont2==1){ //nao preciso da id e da casa do tabuleiro, porque o for ja faz isso, entao desconsidero as 2
					  cont2++;
					  contvetor++;
					  valor=Integer.parseInt(parts[contvetor]);
				  	}
				  /*
				   * Verifica o valor casa para ver se cai 2 ou 3 [passe a vez ou add imovel]
				   * em seguida adiciona um passe a vez e faz cont2 ficar maior que 5 para que termine essa linha de instrucao e comece a prox
				   */
				  if(valor==2){
					  PassaVez pass = new PassaVez();
					  pass.setpass();
					  vetor.add(pass);
					  cont2 = 6;
					  contvetor++;
					  valor=Integer.parseInt(parts[contvetor]);
				  }
				  
				  /*
				   * O valor é 3 que é para add Imovel
				   * e o cont2 incrementa o valor do contador para pegar o 4º valor dos 6 da linha
				   * contvetor ++ incrementa o valor do contador para pegar o 5º valor dos 6 da linha
				   */
				  else{
					  cont2++;
					  if(valor == 1){
						  Residencia residencia = new Residencia();
						  cont2++;
						  contvetor++; //
						  valor=Integer.parseInt(parts[contvetor]);
						  residencia.setPreco(valor);
						  cont2++;
						  /*
						   * incrementa o valor do contador para pegar o 6º valor dos 6 da linha
						   */
						  contvetor++;
						  valor=Integer.parseInt(parts[contvetor]);
						  residencia.setAluguel(valor);
						  vetor.add(residencia);
						  cont2 = 6;
						  
					  }
					  
					  else if(valor == 2){
						  Comercio comercio = new Comercio();
						  cont2++;
						  /*
						   * incrementa o valor do contador para pegar o 5º valor dos 6 da linha
						   */
						  contvetor++;
						  valor=Integer.parseInt(parts[contvetor]);
						  comercio.setPreco(valor);
						  cont2++;
						  /*
						   * incrementa o valor do contador para pegar o 6º valor dos 6 da linha
						   */
						  contvetor++;
						  valor=Integer.parseInt(parts[contvetor]);
						  comercio.setAluguel(valor);
						  vetor.add(comercio);
						  cont2 = 6;
					  }
					  
					  else if(valor == 3){
						  Industria industria = new Industria();
						  cont2++;
						  /*
						   * incrementa o valor do contador para pegar o 5º valor dos 6 da linha
						   */
						  contvetor++;
						  valor=Integer.parseInt(parts[contvetor]);
						  industria.setPreco(valor);
						  cont2++;
						  /*
						   * incrementa o valor do contador para pegar o 6º valor dos 6 da linha
						   */
						  contvetor++;
						  valor=Integer.parseInt(parts[contvetor]);
						  industria.setAluguel(valor);
						  vetor.add(industria);
						  cont2 = 6;
					  }
					  
					  else if(valor == 4){
						  Hotel hotel = new Hotel();
						  cont2++;
						  /*
						   * incrementa o valor do contador para pegar o 5º valor dos 6 da linha
						   */
						  contvetor++;
						  valor=Integer.parseInt(parts[contvetor]);
						  hotel.setPreco(valor);
						  cont2++;
						  /*
						   * incrementa o valor do contador para pegar o 6º valor dos 6 da linha
						   */
						  contvetor++;//
						  valor=Integer.parseInt(parts[contvetor]);
						  hotel.setAluguel(valor);
						  vetor.add(hotel);
						  cont2 = 6;
					  }
					  
					  else if(valor == 5){
						  Hospital hospital = new Hospital();
						  cont2++;
						  /*
						   * incrementa o valor do contador para pegar o 5º valor dos 6 da linha
						   */
						  contvetor++;
						  valor=Integer.parseInt(parts[contvetor]);
						  hospital.setPreco(valor);
						  cont2++;
						  /*
						   * incrementa o valor do contador para pegar o 6º valor dos 6 da linha
						   */
						  contvetor++;
						  valor=Integer.parseInt(parts[contvetor]);
						  hospital.setAluguel(valor);
						  vetor.add(hospital);
						  cont2 = 6;
					  }
				  }
			  }
		  }
		  logger2.info("Tabuleiro criado!");
		  
		  for(int i=0; i<vetor.size();i++){ //alguns erros na logica mas compila :)
			  System.out.println(vetor.get(i));
		  } 
		  } catch (IOException ioe) {
		        ioe.printStackTrace();
		    }
		  finally{ 
			  try {
				  br.close();//fecha aquivo
			  } 
			  /*
			   * Lança uma excessão
			   */
			  catch (IOException e) {
				  e.printStackTrace();
			  } 
		  }
	
	}//fecha classe
	

	
	//funcao compra imovel nao funcinou, então vai sem
	public void compraimovel(List<Imovel> vetor, int valor, List<Player>pplayer){}
	/*public void statistic(){
		private File file;
		String str;
		int valor;
		for(int contador = 0 ; contador < 7 ; contador++){
		str = Integer.toString(valorfixo);
		try {
			FileWriter fr = new FileWriter(file);
			fr.write(str);			
			fr.close();
			//System.out.println("Escrita concluida com sucesso");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Falha ao escrever no arquivo");
			e.printStackTrace();
		}*/
		}
	
	
	/*public void CriaTabuleiro(int tamanho){
		this.tamanho = tamanho;
		int resul = 0;
		int residenciacont = 0;
		int comerciocont = 0;
		ArrayList<Imovel> vetor = new ArrayList<Imovel>();
		for(int cont=0; cont<tamanho; cont++){
			resul=cont%2;
			if(residenciacont==10){
				ClubeSocial clubesocial = new ClubeSocial();
				clubesocial.setclubesocial();
				vetor.add(clubesocial);
				residenciacont = 0;
			}
			else if(comerciocont==4){
				Industria industria = new Industria();
				industria.setindustria();
				vetor.add(industria);
				comerciocont = 0;
			}
			else if(cont==0){
				Hospital hospital = new Hospital();// apenas um hospital por tabuleiro, ja come�a com ele que � -1
				hospital.sethospital();
				vetor.add(hospital);
			}
			else if(cont==1){
				Hotel hotel1 = new Hotel(); // hotel depois do hospital, inicio do tabuleiro
				hotel1.sethotel();
				vetor.add(hotel1);
			}
			else if(cont==tamanho/2){
				Hotel hotel2 = new Hotel();
				hotel2.sethotel();
				vetor.add(hotel2); // hotel depois do meio do tabuleiro
			}
			else if(resul == 0){
				Residencia residencia = new Residencia();
				residencia.setresidencia();
				vetor.add(residencia);
				residenciacont++;
			}
			else if(resul == 1 ){
				Comercio comercio = new Comercio();
				comercio.setcomercio();
				vetor.add(comercio);
			}
		}
	}
*/
