package locadoraIO;

import java.io.IOException;

public class Main {
   
	

	public static void main(String[] args) throws IOException {
		
		Lerteclado lerTeclado = new Lerteclado();
		
		String line = lerTeclado.lerLinha();
		
		lerTeclado.close();
		
		new EscreverArquivo(line);

	}

}
