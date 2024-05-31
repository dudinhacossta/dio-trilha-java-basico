package edu.eduarda.primeirasemana;
import java.util.Scanner;
public class BancoSaldo {
    int Numero;
    String Agencia;
    String Nome;
    Double Saldo = 2000.0;
    public static void main(String[] args) {
        

        Scanner cadastrarCliente = new Scanner(System.in);
        BancoSaldo cliente = new BancoSaldo();

        System.out.println("Insira seu número: "); 
        int Numero = cadastrarCliente.nextInt();

        System.out.println("Insira o número da sua âgencia: "); 
        String Agencia = cadastrarCliente.next();

        System.out.println("Insira seu nome: "); 
        String Nome = cadastrarCliente.next();

            
        System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta "
        + Numero + " e seu saldo " + cliente.Saldo + " ja esta disponivel para saque.");           
        
    }
}
        
