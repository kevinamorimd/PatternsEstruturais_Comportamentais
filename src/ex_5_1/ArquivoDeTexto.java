package ex_5_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoDeTexto {
	public void abreArquivoDeTexto() {
		try {
			FileReader arquivo = new FileReader("arquivo.txt");
			BufferedReader lerArquivo = new BufferedReader(arquivo);

			String linha = lerArquivo.readLine();

			System.out.printf("Arquivo de texto\n");
			while (linha != null) {
				System.out.printf("%s\n", linha);
				linha = lerArquivo.readLine();
			}
			System.out.printf("----------------------------------------------------------\n");
		} catch (IOException error) {
			System.out.printf("Erro na abertura do arquivo: %s.\n", error.getMessage());
		}
	}
}
