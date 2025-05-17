package trabalho;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); //ler a resposta do usuário
		int seletor; //variável para guardar a resposta do usuário
		
		Cofrinho moedas = new Cofrinho(); //Chamando a classe
		
		System.out.println("Cofre de moedas");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular total convertido para Real");
		System.out.println("0 - Encerrar");
		seletor = teclado.nextInt(); //Menu e leitor de resposta
		
		Moeda moeda; //Chamando a classe para receber o valor
		int tipoMoeda; //Variáveis para ajudar na seleção e adição de moedas
		double valorMoeda;
		while (seletor != 0 ) { //Com a resposta que foi inserida pelo usuário, irá navegar nos casos abaixo
			
			switch(seletor) {
			
			case 1:
				 tipoMoeda=0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) { //Enquanto a opção não for uma das disponíveis a tela irá se repetir
					System.out.println("Selecione a moeda para adicionar: ");
					System.out.println("1 - Dolar");
					System.out.println("2 - Euro");
					System.out.println("3 - Real");
					tipoMoeda = teclado.nextInt(); //Variável para gravar o tipo de moeda
				}
				System.out.println("Qual o valor? ");
				valorMoeda = teclado.nextDouble(); //Variável para adicionar a moeda
				
				moeda = null;
				
				if(tipoMoeda == 1) {
					moeda = new Dolar(valorMoeda); //Chama a classe para criar um espaço na moeda
				}
				
				else if(tipoMoeda == 2) {
					moeda = new Euro(valorMoeda);
				}
				
				else {
					moeda = new Real(valorMoeda);
				}
				
				moedas.adicionar(moeda); //Após a verificação da adição da moeda, irá adicionar no espaço
				
				break;
			case 2:
				
				tipoMoeda=0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("Selecione a moeda para remover: ");
					System.out.println("1 - Dolar");
					System.out.println("2 - Euro");
					System.out.println("3 - Real");
					tipoMoeda = teclado.nextInt();
				}
				System.out.println("Qual o valor? ");
				valorMoeda = teclado.nextDouble();
				
				moeda = null;
				
				if(tipoMoeda == 1) {
					moeda = new Dolar(valorMoeda); //Chama a classe para criar um espaço na moeda para comparação e remoção da moeda certa
				}
				
				else if(tipoMoeda == 2) {
					moeda = new Euro(valorMoeda);
				}
				
				else {
					moeda = new Real(valorMoeda);
				}
				
				moedas.remover(moeda); //Caso no geral similar ao de cima, porém remove a moeda ao encontrar as características parecidas.
				
				break;
				
			case 3:
				moedas.listar(); //lista as moedas
				break;
			case 4:
				moedas.totalConvertido(); //Chama a função na classe de conversão total de moedas, imprimindo na tela o resultado
				break;
				
			default: //caso o usuário digite uma opção inválida
				System.out.println("Opção inválida, tente novamente!");
				
			}
			
			System.out.println("Menu");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Calcular total convertido para Real");
			System.out.println("0 - Encerrar");
			seletor = teclado.nextInt(); //Até o usuário digitar 0, o menú continuará a aparecer
		}
		
	}

}
