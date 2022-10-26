package java_algaworks;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int valor = 0;
        int soma = 0;
        
        do {
            /*
            *@ do SEMPRE ESSE CODIGO SERÁ EXECUTADO ANTES DO WHILE
            * ex: ENQUANTO ELE NAO DIGITAR 0(ZERO) SERA PERGUNTADO UM NUMERO AO USUARIO
            */
            
            System.out.println("Digite 0 (zero) para sair ou qualquer numero para somar: ");
            valor = entrada.nextInt();
                
            soma += valor;
            
        } while (valor != 0);
            System.out.println("Soma: " + soma);
    }
        
}
