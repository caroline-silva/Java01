public class Operadores {
	
	public static void main(String[] args) {
		System.out.println("Operacoes: \n");
		System.out.println("Resto 5 / 2 = " + (5 % 2)); //operacao de divisao
		System.out.println("Resto 5 * 2 = " + (5 * 2)); //operacao de multiplicacao
		System.out.println("Resto 5 + 2 = " + (5 + 2)); //operacao de adicao
		System.out.println("Resto 5 - 2 = " + (5 - 2)); //operacao de subtracao
		
		int x = 5; //atibuido valor 5 na variavel x
		int y = -x;
		System.out.println("Operacoes de atribuicoes: \n");
		System.out.println("\nValores das variaveis 'x' e 'y': \n");
		System.out.println("\nValor de x = " + x);
		System.out.println("Valor de y = " + y);
		
		y = --x; //diminui 1 antes da operacao
		System.out.println("\ndiminui 1 antes da operacao: \n");
		System.out.println("\nValor de x = " + x);
		System.out.println("Valor de y = " + y);
		
		y = x--; // diminui 1 depois da operacao
		System.out.println("\ndiminui 1 depois da operacao: \n");
		System.out.println("\nValor de x = " + x);
		System.out.println("Valor de y = " + y);
		
		y *= x; //multiplicacao e atribuicao
		System.out.println("\nmultiplicacao e atribuicao: \n");
		System.out.println("\nValor de y = " + y);
		
		y /= x; //divisao e atribuicao
		System.out.println("\ndivisao e atribuicao: \n");
		System.out.println("\nValor de y = " + y);
		
		y -= x; //subtracao e atribuicao
		System.out.println("\nsubtracao e atribuicao: \n");
		System.out.println("\nValor de y = " + y);
		
		y += x; //adicao e atribuicao
		System.out.println("\nadicao e atribuicao: \n");
		System.out.println("\nValor de y = " + y);
	}

}