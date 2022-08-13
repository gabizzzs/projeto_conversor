package ProjetoConversordeMoedas;

public class Conversor
{
	double valorConvertido;
	double valor;
	
	public Conversor(double valor)
	{
		this.valor = valor;
	}
	
		public void conversaoDiv (double valor, double cotacao)
		{
			valorConvertido=this.valor/cotacao;
			System.out.printf("\nValor da moeda convertida: %.2f",valorConvertido);
			
		}
		
		public void conversaoMult (double valor, double cotacao)
		{
			valorConvertido=this.valor*cotacao;
			System.out.printf("\nValor da moeda convertida: %.2f",valorConvertido);
			
		}
		
/**********************************************************************************************************************************/

		public double getValorConvertido() {
			return valorConvertido;
		}

		public void setValorConvertido(double valorConvertido) {
			this.valorConvertido = valorConvertido;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
/**********************************************************************************************************************************/
}
