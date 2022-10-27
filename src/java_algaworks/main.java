package java_algaworks;

import Classes.ClassFolhaPagamento;

public class main {

    public static void main(String[] args) {
        
        ClassFolhaPagamento folha = new ClassFolhaPagamento();
        double valor = folha.calculoSalario(160, 0, 8.74, 0);
        
        System.out.println(valor);
        
    }
        
}
