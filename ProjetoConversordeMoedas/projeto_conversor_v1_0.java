package ProjetoConversordeMoedas;

import java.util.Scanner;

public class projeto_conversor_v1_0
{

	public static void main(String[] args)
	{
		int op, op2, op3, op4, op5, op6, op7, op8, op9, op10;
		int realConvert, dolarAmConvert, EuroConvert, LibraConvert, IeneConvert;
		int yuanConvert, dolarCnConvert, DolarAustConvert, PesoMxConvert, RubloConvert, zlotyConvert;
		double valorConvertido;

		Scanner leia = new Scanner(System.in);
		Conversor conversaoDiv = new Conversor(0);
		Conversor conversaoMult = new Conversor(0);
		
		do
		{
			System.out.println("\nDigite sua moeda nativa para conversão: "
				+ "\n1-Real"
				+ "\n2-Dólar Americano"
				+ "\n3-Euro"
				+ "\n4-Libra Esterlina"
				+ "\n5-Iene Japonês"
				+ "\n6-Yuan Renminbi Chinês"
				+ "\n7-Dólar Canadense"
				+ "\n8-Dolar Australiano"
				+ "\n9-Peso Mexicano"
				+ "\n10-Rublo Russo"
				+ "\n11-Zloty Polonês");
				op = leia.nextInt();
			switch (op)
			{
				case 1: // real para outras moedas
				{
				System.out.println("\nDefina para qual moeda converter: "
					+ "\n1-Dólar Americano"
					+ "\n2-Euro"
					+ "\n3-Libra Esterlina"
					+ "\n4-Iene Japonês"
					+ "\n5-Yuan Renminbi Chinês"
					+ "\n6-Dólar Canadense"
					+ "\n7-Dolar Australiano"
					+ "\n8-Peso Mexicano"
					+ "\n9-Rublo Russo"
					+ "\n10-Zloty Polonês");
					realConvert = leia.nextInt();

					switch (realConvert)
					{
						case 1: // Real para Dólar Americano
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,5.0764);
						break;
						}
						case 2: // Real para Euro
						{
						System.out.printf("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,5.2097);
						break;	
						}
						case 3: // Real para Libra Esterlina
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,6.1636);
						break;
						}
						case 4: // Real para Iene Japonês
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,26.2857);
						break;
						}
						case 5: // Real para Yuan Renminbi Chinês
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,1.3283);
						break;
						}
						case 6: // Real para Dólar Canadense
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,3.9733);
						break;
						}
						case 7: // Real para Dolar Australiano
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,3.6178);
						break;
						}
						case 8: // Real para Peso Mexicano
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,3.9060);
						break;
						}
						case 9: // Real para Rublo Russo
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoMult.setValor(leia.nextDouble());
						conversaoMult.conversaoMult(conversaoMult.valor,12.1149);
						break;
						}
						case 10: // Real para Zloty Polonês
						{
						System.out.println("\nEntre com valor a ser convertido: ");
						conversaoDiv.setValor(leia.nextDouble());
						conversaoDiv.conversaoDiv(conversaoDiv.valor,1.1190);
						break;
						}
					}
				}
			}	
		}
		while (op!=0);
	}
	
}
