package trabalho;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listagemMoeda = new ArrayList<Moeda>(); //Cria um array para ajudar a guardar as moedas
		
		
	public void adicionar(Moeda m) { //Adiciona as moedas para o Array
		listagemMoeda.add(m); //Adiciona o item no ArrayList
	}
		
	public void remover(Moeda m) { //Remove as moedas com ajuda do equals
		listagemMoeda.remove(m); //Remove o item do ArrayList
	}
	
	public void listar () { //Lista a moeda de acordo com as informações de cada uma
		
		for (Moeda m : listagemMoeda) { //Faz uma repetição passando por cada elemento do ArrayList até chegar no último
			m.info(); //Mostra a informação da moeda
		}
	}
	
	public void totalConvertido () { //Início do método de conversão total
		double somador =0; //Variável responsável pela soma das moedas convertidas para reais
		for (Moeda m : listagemMoeda) { //Faz uma repetição passando por cada elemento do ArrayList até chegar no último
			somador += m.converter(); //Com o repetidor, o elemento do ArrayList usa sua conversão e seu valor de cotação para chegar em reais
		}
		
		System.out.printf("O total convertido a reais é: %.2f \n", somador); //Imprime na tela o valor total da cotação com 2 digitos decimais
		
		
			
		
		
	}
	
	
}
