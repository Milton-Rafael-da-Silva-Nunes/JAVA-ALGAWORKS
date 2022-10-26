package java_algaworks;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int divisor = entrada.nextInt();
        
        for(int i=100; i<=120; i++) {
            if(i % divisor == 0){ /* 0(zero) significa numero PAR */
               continue;
            }
            System.out.println(i);
            
        }
        System.out.println("Fim do programa.");
                
    }
        
}
