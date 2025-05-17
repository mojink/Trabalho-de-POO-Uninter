package trabalho;

import java.util.Objects;

public abstract class Moeda {
	
	double valor; //Variável que vai armazenar o valor da moeda
	
	public Moeda(double valor) { //Construtor original das moedas
		super();
		this.valor += valor; //Pra ser bem honesto professor, estava com dúvidas de como realmente adicionar uma nova moeda ao invez de simplesmente substitui-la, fazendo o += pelo que parece cria um comportamento de separar moedas
	}                        //não sei se essa é uma das formas normais de fazer, mas testando foi algo que funcionou com pouquissima alteração no codigo

	
	public abstract void info(); 
	
	public abstract double converter();

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) { //ajuda a achar a moeda idéntica para a remoção
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor); 
	}

	
}
