package ProjetoConversordeMoedas;

import java.util.Scanner;

public class Projeto_conversor_v1_1
{

	public static void main(String[] args)
	{
		int op, op2, op3, op4, op5, op6, op7, op8, op9, op10;
		int realConvert, dolarAmConvert, euroConvert, libraConvert, ieneConvert, yuanConvert;
		double valorConvertido;

		Scanner leia = new Scanner(System.in);
		Conversor conversao = new Conversor(0);

		do
		{
			System.out.println("\nDigite sua moeda nativa para conversão: " // Menu Principal
					+"\n1-Real"
					+"\n2-Dólar Americano"
					+"\n3-Euro"
					+"\n4-Libra Esterlina"
					+"\n5-Iene Japonês"
					+"\n6-Yuan Renminbi Chinês"
					+"\n0-Sair");
					op = leia.nextInt();
					
			switch (op)
			{
			case 1: // Menu - Real para outras moedas.
			{
				System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Dólar Americano"
						+ "\n2-Euro"
						+ "\n3-Libra Esterlina"
						+ "\n4-Iene Japonês"
						+ "\n5-Yuan Renminbi Chinês");
				realConvert = leia.nextInt();

				switch (realConvert) {
				case 1: // Real para Dólar Americano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor,5.0764,"USD");
					break;
				}
				case 2: // Real para Euro
				{
					System.out.printf("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 5.2097,"EUR");
					break;
				}
				case 3: // Real para Libra Esterlina
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 6.1624,"GBP");
					break;
				}
				case 4: // Real para Iene Japonês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 26.2857,"JPY");
					break;
				}
				case 5: // Real para Yuan Renminbi Chinês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 1.3283,"CNY");
					break;
				}
				case 6: // Real para Dólar Canadense
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 3.9733,"CAD");
					break;
				}
				case 7: // Real para Dolar Australiano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 3.6178,"AUD");
					break;
				}
				case 8: // Real para Peso Mexicano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 3.9060,"MXN");
					break;
				}
				case 9: // Real para Rublo Russo
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 12.1149,"RUB");
					break;
				}
				case 10: // Real para Zloty Polonês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 1.1190,"PLN");
					break;
				}
				default: {
					System.out.println("\nEntre com uma opção valida!!!");
				}
				}
				break;
			}
			case 2: // Menu - Dólar Americano para outras moedas.
			{
				System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Real Brasileiro"
						+ "\n2-Euro"
						+ "\n3-Libra Esterlina"
						+ "\n4-Iene Japonês"
						+ "\n5-Yuan Renminbi Chinês");
				dolarAmConvert = leia.nextInt();

				switch (dolarAmConvert) {
				case 1: // Dólar Americano para Real
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 5.0764,"BRL");
					break;
				}
				case 2: // Dólar Americano para Euro
				{
					System.out.printf("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 1.0263,"EUR");
					break;
				}
				case 3: // Dólar Americano para Libra Esterlina
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 1.2142,"GBP");
					break;
				}
				case 4: // Dólar Americano para Iene Japonês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 133.44,"PJY");
					break;
				}
				case 5: // Dólar Americano para Yuan Renminbi Chinês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 6.7429,"CNY");
					break;
				}
				case 6: // Dólar Americano para Dólar Canadense
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 1.2776,"CAD");
					break;
				}
				case 7: // Dólar Americano para Dolar Australiano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 1.4032,"AUD");
					break;
				}
				case 8: // Dólar Americano para Peso Mexicano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 19.8283,"MXN");
					break;
				}
				case 9: // Dólar Americano para Rublo Russo
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 61.5000,"RUB");
					break;
				}
				case 10: // Dólar Americano para Zloty Polonês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 4.5365,"PLN");
					break;
				}
				default: {
					System.out.println("\nEntre com uma opção valida!!!");
				}
				}
				break;
			}
			case 3: // Menu - Euro para outras moedas.
			{
				System.out.println("\nDefina para qual moeda converter: " 
						+ "\n1-Dólar Americano" 
						+ "\n2-Real"
						+ "\n3-Libra Esterlina" 
						+ "\n4-Iene Japonês" 
						+ "\n5-Yuan Renminbi Chinês");
				euroConvert = leia.nextInt();

				switch (euroConvert) {
				case 1: // Euro para Dólar Americano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 1.0263,"USD");
					break;
				}
				case 2: // Euro para Real
				{
					System.out.printf("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 5.2318,"BRL");
					break;
				}
				case 3: // Euro para Libra Esterlina
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.8453,"USD");
					break;
				}
				case 4: // Euro para Iene Japonês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 136.976,"USD");
					break;
				}
				case 5: // Euro para Yuan Renminbi Chinês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 6.9144,"USD");
					break;
				}
				case 6: // Euro para Dólar Canadense
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 1.3108,"USD");
					break;
				}
				case 7: // Euro para Dolar Australiano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 1.4431,"USD");
					break;
				}
				case 8: // Euro para Peso Mexicano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 20.3623,"USD");
					break;
				}
				case 9: // Euro para Rublo Russo
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 61.7864,"USD");
					break;
				}
				case 10: // Euro para Zloty Polonês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 4.4672,"USD");
					break;
				}
				default: {
					System.out.println("\nEntre com uma opção valida!!!");
				}
				}
				break;
			}
			case 4: // Libra para outras moedas
			{
				System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Dólar Americano"
						+ "\n2-Real"
						+ "\n3-Euro"
						+ "\n4-Iene Japonês"
						+ "\n5-Yuan Renminbi Chinês");
				libraConvert = leia.nextInt();

				switch (libraConvert) {
				case 1: // Libra para Dólar Americano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 1.2131,"USD");
					break;
				}
				case 2: // Libra para Real
				{
					System.out.printf("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 6.1869,"USD");
					break;
				}
				case 3: // Libra para Euro
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 1.1828,"USD");
					break;
				}
				case 4: // Libra para Iene Japonês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 162.0338,"USD");
					break;
				}
				case 5: // Libra para Yuan Renminbi Chinês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 8.1793,"USD");
					break;
				}
				case 6: // Libra para Dólar Canadense
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 1.5506,"USD");
					break;
				}
				case 7: // Libra para Dolar Australiano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 1.7071,"USD");
					break;
				}
				case 8: // Libra para Peso Mexicano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 24.0873,"USD");
					break;
				}
				case 9: // Libra para Rublo Russo
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 73.0893,"USD");
					break;
				}
				case 10: // Libra para Zloty Polonês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 5.5092,"USD");
					break;
				}
				default: {
					System.out.println("\nEntre com uma opção valida!!!");
				}
				}
				break;
			}
			case 5: // Iene para outras moedas
			{
				System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Dólar Americano"
						+ "\n2-Real"
						+ "\n3-Euro"
						+ "\n4-Libra Esterlina"
						+ "\n5-Yuan Renminbi Chinês");
				ieneConvert = leia.nextInt();

				switch (ieneConvert) {
				case 1: // Iene para Dólar Americano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.0075,"USD");
					break;
				}
				case 2: // Iene para Real
				{
					System.out.printf("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.0382,"USD");
					break;
				}
				case 3: // Iene para Euro
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.0073,"USD");
					break;
				}
				case 4: // Iene para Libra
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 0.0062,"USD");
					break;
				}
				case 5: // Iene para Yuan Renminbi Chinês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 0.0505,"USD");
					break;
				}
				case 6: // Iene para Dólar Canadense
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.0096,"USD");
					break;
				}
				case 7: // Iene para Dolar Australiano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.0105,"USD");
					break;
				}
				case 8: // Iene para Peso Mexicano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 0.1487,"USD");
					break;
				}
				case 9: // Iene para Rublo Russo
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 0.466,"USD");
					break;
				}
				case 10: // Iene para Zloty Polonês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.034,"USD");
					break;
				}
				default: {
					System.out.println("\nEntre com uma opção valida!!!");
				}
				}
				break;
			}
			case 6: // Yuan para outras moedas
			{
				System.out.println("\nDefina para qual moeda converter: "
						+ "\n1-Dólar Americano"
						+ "\n2-Real"
						+ "\n3-Euro"
						+ "\n4-Libra Esterlina"
						+ "\n5-Iene Japonês");
				yuanConvert = leia.nextInt();

				switch (yuanConvert) {
				case 1: // Yuan para Dólar Americano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.1483,"USD");
					break;
				}
				case 2: // Yuan para Real
				{
					System.out.printf("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.7566,"USD");
					break;
				}
				case 3: // Yuan para Euro
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.1446,"USD");
					break;
				}
				case 4: // Yuan para Libra
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 0.1223,"USD");
					break;
				}
				case 5: // Yuan para Iene Japonês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 19.8116,"USD");
					break;
				}
				case 6: // Yuan para Dólar Canadense
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.1896,"USD");
					break;
				}
				case 7: // Yuan para Dolar Australiano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.2088,"USD");
					break;
				}
				case 8: // Yuan para Peso Mexicano
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 2.9461,"USD");
					break;
				}
				case 9: // Yuan para Rublo Russo
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoMult(conversao.valor, 9.2325,"USD");
					break;
				}
				case 10: // Yuan para Zloty Polonês
				{
					System.out.println("\nEntre com valor a ser convertido: ");
					conversao.setValor(leia.nextDouble());
					conversao.conversaoDiv(conversao.valor, 0.6739,"USD");
					break;
				}
				default: {
					System.out.println("\nEntre com uma opção valida!!!");
				}
				}
				break;
			}
			}
		} while (op != 0);
	}

}
