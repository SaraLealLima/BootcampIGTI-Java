package leituraDeArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LeituraDeArquivos {

	public static void main(String[] args) {
		
		
		
		// tratamento de erro
		try {
			FileReader arquivo = new FileReader("C:\\Users\\Sara\\Documents\\arquivoDados.txt"); //com o FileReader voc� consegue pegar o arquivo que ser� lido
			BufferedReader lerArquivo = new BufferedReader(arquivo); //Esse BuefferedReader l� o arquivo
		
			String linha;   //variavel string que vai ler linha por linha
			linha = lerArquivo.readLine();
			
			while(linha != null) {       //enquanto linha for diferente de null (sem mais linhas)
				String[] dadosCliente = new String[5];     //dadosCliente se torna um array
				dadosCliente = linha.split(";");           //linha.split serve para "quebrar" a linha assim que for econtrado um ';'
				
				System.out.printf("Codigo cliente: %s\n"        //neste println s�o melhor organizadas as informa��es do cliente
						+ "Nome do cliente: %s\n"
						+ "Endere�o: %s\n"
						+ "Estado: %s\n"
						+ "Estado Civil: %s\n", dadosCliente[0], dadosCliente[1], dadosCliente[2], dadosCliente[3], dadosCliente[4]); //colocando sempre pelo indice
				
				linha = lerArquivo.readLine();
				System.out.println();
				
				
			}
			lerArquivo.close();       //fecha o arquivo
			arquivo.close();
			
		} catch (IOException e){      //caso d� algum erro, o catch te informa
			System.out.println("Erro lendo dados: " + e.getMessage());
			
			
		}
		
		
		
		
	}

}
