package DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
   
	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
			System.out.println("é um número válido");
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		} finally {
			terminal.close();
		}
		
	}
	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo número " + i);
        }
    }

}

class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
 }
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		//realizar o for para imprimir os números com base na variável contagem
		


