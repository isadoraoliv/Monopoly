package arquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class EscreverArquivo {

	private File file;

	public EscreverArquivo(File file) {
		super();
		this.file = file;
	}
	
	
	public void escrever(String str){		
		
		try {
			FileWriter fr = new FileWriter(file);
			fr.write(str);			
			fr.close();
			//System.out.println("Escrita concluida com sucesso");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Falha ao escrever no arquivo");
			e.printStackTrace();
			
		}
	}
	
	
}
