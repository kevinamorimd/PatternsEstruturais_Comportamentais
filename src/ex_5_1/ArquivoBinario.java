package ex_5_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArquivoBinario {
	public void abreArquivoBinario() {
		try {
			FileInputStream binario = new FileInputStream("binario.txt");
			int dado;
			try {
				System.out.printf("Arquivo binario\n");
				dado = binario.read();
				while (dado != -1) {
					System.out.print(dado + " ");
					dado = binario.read();
				}
				System.out.println("");
				System.out.printf("----------------------------------------------------------\n");
			} catch (IOException error) {
				System.out.println("Erro ao ler o dado binario" + error);
			}

		} catch (FileNotFoundException error) {
			System.out.printf("Erro na abertura do arquivo: %s.\n", error.getMessage());
		}
	}
}