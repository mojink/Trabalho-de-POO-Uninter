package trabalho;

import java.util.Objects;

public class Dolar extends Moeda {

	double cotacao = 6.09; //Cotação atual da Moeda
	
	public Dolar(double valor) { //Construtor que pega o valor
		super(valor);
		this.valor = valor;
	}

	@Override
	public double converter() { //Converte o valor original da moeda para o valor em reais
		this.valor *= cotacao; //Soma o valor da moeda com a sua cotação
		return this.valor; //Retorna o valor da moeda em reais.
	}
	
	public void info () {
		System.out.println("Dolar: " + this.valor); //Mostra o valor da moeda
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cotacao);
		return result;
	}

	@Override
	public boolean equals(Object obj) { //ajuda a achar a moeda idéntica para a remoção
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		return Double.doubleToLongBits(cotacao) == Double.doubleToLongBits(other.cotacao); 
	}
}
