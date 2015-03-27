import java.util.Scanner;

public class Calculadora{
	int variavel1,variavel2;

	public void soma(){
		System.out.println("---A soma dos dois números é igual a: " + (this.variavel1+variavel2));
	}
	
		public void subtracao(){
		System.out.println("---A subtração dos dois números é igual a: " + (this.variavel1-variavel2));
	}

		public void divisao(){
		System.out.println("---A divisão dos dois números é igual a: " + (this.variavel1/variavel2));
	}

		public void multiplicacao(){
		System.out.println("---A multiplicação dos dois números é igual a: " + (this.variavel1*variavel2));
	}


	public static void main(String [] args){
		Calculadora cal = new Calculadora();
		Calculadora ca2 = new Calculadora();
		Calculadora ca3 = new Calculadora();
		Scanner input= new Scanner(System.in);
		
		System.out.println("Entre com o valor 1 de 1: ");
		cal.variavel1=input.nextInt();
		System.out.println("Entre com o valor 2 de 1: ");
		cal.variavel2=input.nextInt();
		System.out.println("Entre com o valor 1 de 2: ");
		ca2.variavel1=input.nextInt();
		System.out.println("Entre com o valor 2 de 2: ");
		ca2.variavel2=input.nextInt();
		System.out.println("Entre com o valor 1 de 3: ");
		ca3.variavel1=input.nextInt();
		System.out.println("Entre com o valor 2 de 3: ");
		ca3.variavel2=input.nextInt();
		
		System.out.println("Resultados da primeira leva de números: ");
		cal.soma();
		cal.subtracao();
		cal.multiplicacao();
		cal.divisao();
		System.out.println("Resultados da segunda leva de números: ");;
		ca2.soma();
		ca2.subtracao();
		ca2.multiplicacao();
		ca2.divisao();
		System.out.println("Resultados da terceira leva de números: ");;
		ca3.soma();
		ca3.subtracao();
		ca3.multiplicacao();
		ca3.divisao();
	}
}
