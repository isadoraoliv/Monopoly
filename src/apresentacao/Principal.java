/*Esse projeto consiste em implementar um jogo
 * de banco imobiliario. O programa terá que ler
 * um arquivo e com base nesses dados gerar um 
 * tabuleiro, em seguida será lido um arquivo de 
 * que terá as jogadas e dados dos jogadores.
 * Depois de processar as informações e as 
 * sequencia das jogadas, serão computados dados
 * estatisticos sobre o jogo e gravado em um aquivo.
 * 
 * @author Anderson Felipe Baldissarelli
 * @author Isadora de Oliveira
 * @version 1.2
 *
 */


package apresentacao;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import jogo.Jogadas;
import jogo.Tabuleiro;

public class Principal{
	
	static final Logger logger = Logger.getLogger(Principal.class);

	public static void main(String[] args) throws FileNotFoundException {
		
		/*
		 * O log4j está configurado de acordo com esse arquivo
		 */
		PropertyConfigurator.configure("log4j.properties");
		
		/*
		* Metódo principal para chamar a função que cria o tabuleiro
		* e a função joga
		*/
		Tabuleiro tab = new Tabuleiro();	
		Jogadas jog = new Jogadas();
		logger.info("Chama a função que cria tabuleiro");
		tab.CriaTabuleiro();
		logger.info("Chama a função das jogadas");
		jog.Joga();
		
	}
}
	
	//C:\Users\HarrY\Desktop\Arquivos_exemplo\Arquivos_exemplo\tabuleiro1.txt
	//C:/Users/HarrY/Desktop/Arquivos_exemplo/Arquivos_exemplo/tabuleiro1.txt

//float numF = sc.nextFloat();
//int num1 = sc.nextInt();
//byte byte1 = sc.nextByte();
//long lg1 = sc.nextLong();
//boolean b1 = sc.nextBoolean();
//double num2 = sc.nextDouble();
//String nome = sc.nextLine();