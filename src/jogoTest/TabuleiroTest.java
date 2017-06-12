/*
 * Test Junit da classe Tabuleiro
 */

package jogoTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TabuleiroTest {

	private BufferedReader br;

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	private void TestLerArqTabuleiro() throws IOException {
		br = new BufferedReader(new FileReader("C:/Users/HarrY/Desktop/Arquivos_exemplo/Arquivos_exemplo/jogadas2.txt")); 
		String line = br.readLine(); 
		
		while(line==null){ 
			Assert.assertTrue(false);
		}
	}
	
	//esse valor inicial ele recebe do txt
	@Test
	private void TestValorInicial(){
		int valorinicial = 10;
		
		if(valorinicial == 0){
			Assert.assertFalse(true);
		}
		else{
			Assert.assertFalse(false);
			
		}
		
		//for(int cont=0;cont<valorinicial;cont++)

	}
}
