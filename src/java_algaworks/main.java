package java_algaworks;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int valor = 0;
        int soma = 0;
        
        do {
            System.out.println("Digite 0 (zero) para sair ou qualquer numero para somar: ");
            valor = entrada.nextInt();
                
            soma += valor;
            
        } while (valor != 0);
            System.out.println("Soma: " + soma);
    }
        
}
