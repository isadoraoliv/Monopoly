package jogo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Tabuleiro{
	private int tamanho;
	private int nplayers; 
	 
	//get 
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
		ArrayList<Player> players = new ArrayList<Player>();
		for(int cont=0; cont<nplayers; cont++){
			Player play = new Player();
			play.setSaldo(cont);
			players.add(play);
		}
	}
	public void CriaTabuleiro() throws FileNotFoundException{
		BufferedReader br; 
		  int valor = 0;
		  int valorinicial = 0;
		  int contvetor = 0;
		  br = new BufferedReader(new FileReader("C:/Users/HarrY/Desktop/Arquivos_exemplo/Arquivos_exemplo/tabuleiro1.txt")); 

		  try { 
		  StringBuilder sb = new StringBuilder(); 
		  String line = br.readLine(); 
		  while(line!=null){ 
		  sb.append(line); 
		  sb.append(System.lineSeparator()); 
		  line = br.readLine(); 
		  //System.out.println(line); 
		  } 
		   
		  String everything = sb.toString(); 
		  //System.out.println(everything);
		  String[] parts = everything.split(";");
		  //System.out.println(parts[8]);
		  valor = Integer.parseInt(parts[0]);
		  valorinicial = Integer.parseInt(parts[0]); //variavel valor recebe o inteiro convertido do txt
		//  int[] idades = new int[valor]; //define o tamnho do vetor
		  ArrayList<Imovel> vetor = new ArrayList<Imovel>();  
		  for(int cont=0;cont<valorinicial;cont++){ //estrutura de repeticao que inicia o tabuleiro
			  if(cont==0){
				  ClubeSocial start = new ClubeSocial(); //clubesocial eh a classe start
				  start.setstart();         //isso faz com que os 4 primeiros valores lidos no arquivos ja tenham sido utilizados parts[0-3]
				  vetor.add(start);
				  contvetor = 4;
				  valor=Integer.parseInt(parts[contvetor]); //ler linha abaixo
				  valor = Integer.parseInt(parts[contvetor].trim()); //sugestão do pessoa do stack, mas nao sei oq .trim faz
			  }
			  for(int cont2=0;cont2<6;cont2++){
				  	if(cont2==0 || cont2==1){ //nao preciso da id e nao preciso da casa do tabuleiro, porque o for ja faz isso, entao desconsidero as 2
					  cont2++;
					  contvetor++;
				  }
				  //abaixo olhamos valor casa para ver se cai 2 ou 3 [passe a vez ou add imovel]
				  if(valor==2){ //adiciona um passe a vez e faz cont2 ficar maior que 5 para que termine essa linha de instrucao e comece a prox
					  passeavez pass = new passeavez();
					  pass.setpass();
					  vetor.add(pass);
					  cont2 = 6;
					  contvetor++;
				  }
				  else{ //no caso o valor é 3 que é pra add imovel
					  cont2++; //incrementa o valor do contador para pegar o 4ª valor dos 6 da linha
					  if(valor == 1){
						  Residencia residencia = new Residencia();
						  cont2++;
						  contvetor++; //incrementa o valor do contador para pegar o 5ª valor dos 6 da linha
						  residencia.setPreco(valor);
						  cont2++;
						  contvetor++;//incrementa o valor do contador para pegar o 6ª valor dos 6 da linha
						  residencia.setAluguel(valor);
						  vetor.add(residencia);
						  cont2 = 6;
					  }
					  else if(valor == 2){
						  Comercio comercio = new Comercio();
						  cont2++;
						  contvetor++;//incrementa o valor do contador para pegar o 5ª valor dos 6 da linha
						  comercio.setPreco(valor);
						  cont2++;
						  contvetor++;//incrementa o valor do contador para pegar o 6ª valor dos 6 da linha
						  comercio.setAluguel(valor);
						  vetor.add(comercio);
						  cont2 = 6;
					  }
					  else if(valor == 3){
						  Industria industria = new Industria();
						  cont2++;
						  contvetor++;//incrementa o valor do contador para pegar o 5ª valor dos 6 da linha
						  industria.setPreco(valor);
						  cont2++;
						  contvetor++;//incrementa o valor do contador para pegar o 6ª valor dos 6 da linha
						  industria.setAluguel(valor);
						  vetor.add(industria);
						  cont2 = 6;
					  }
					  else if(valor == 4){
						  Hotel hotel = new Hotel();
						  cont2++;
						  contvetor++;//incrementa o valor do contador para pegar o 5ª valor dos 6 da linha
						  hotel.setPreco(valor);
						  cont2++;
						  contvetor++;//incrementa o valor do contador para pegar o 6ª valor dos 6 da linha
						  hotel.setAluguel(valor);
						  vetor.add(hotel);
						  cont2 = 6;
					  }
					  else if(valor == 5){
						  Hospital hospital = new Hospital();
						  cont2++;
						  contvetor++;//incrementa o valor do contador para pegar o 5ª valor dos 6 da linha
						  hospital.setPreco(valor);
						  cont2++;
						  contvetor++;//incrementa o valor do contador para pegar o 6ª valor dos 6 da linha
						  hospital.setAluguel(valor);
						  vetor.add(hospital);
						  cont2 = 6;
					  }
				  }
			  }
		  }
		  
		  System.out.println("test" + valor);
		  
		  } catch (IOException ioe) {
		        ioe.printStackTrace();
		    }
		  finally{ 
		  //br.close(); 
		  }
	
	}
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
				Hospital hospital = new Hospital();// apenas um hospital por tabuleiro, ja começa com ele que é -1
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
