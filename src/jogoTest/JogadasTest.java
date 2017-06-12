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


public class JogadasTest {
	
	private BufferedReader br;

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	private void TestLerArqJogadas() throws IOException {
		br = new BufferedReader(new FileReader("C:/Users/HarrY/Desktop/Arquivos_exemplo/Arquivos_exemplo/jogadas2.txt")); 
		String line = br.readLine(); 
		
		if(line!=null){ 
			line = br.readLine(); 
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}
	}

}
