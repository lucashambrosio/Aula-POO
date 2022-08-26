package br.com.aula2.exercicios;
import java.util.Scanner; //Biblioteca Scanner
public class Banco {

	public static void main(String[] args) {
		
		
		long numero;
		int agencia;
		double valor;
		
		Scanner ler = new Scanner (System.in);//Declarando scanner
		
		System.out.println("Digite o numero da conta: ");
		numero= ler.nextLong();
		
		System.out.println("Digite o numero a Agencia: ");
		agencia= ler.nextInt();
		
		
		/*Nome da classa*/ContaCorrente /*Nome da variavel */c1 = new ContaCorrente (numero,agencia);
		System.out.println("Digite o Valor de deposito ");
		valor = ler.nextDouble();
		c1.Depositar(valor);
		System.out.println("Saldo: " + c1.ConsultaSaldo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*ContaCorrente c1; //Cria uma variavel c1 do tipo conta corrente
		
		c1 = new ContaCorrente (12345, 526); // Estancia a variavel c1 (chamar o construtor)
		c1.Depositar(1000);// Colocando o valor de 1000 no saldo da conta corrente
		System.out.println(c1.ConsultaSaldo()); //Imprimir o saldo na tela
		
		c1.Sacar(500);// sacando 500
		System.out.println(c1.ConsultaSaldo()); //Imprimir o saldo na tela*/
		
		
		
	}
	
	

}
