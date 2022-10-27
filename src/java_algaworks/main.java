package java_algaworks;

import Classes.ClassCarro;
import Classes.ClassDono;

public class main {

    public static void main(String[] args) {
        
        ClassDono eu = new ClassDono(); // DONO 1
        ClassDono vc = new ClassDono(); // DONO 2
        
        eu.nome = "Rafael Nunes";
        eu.idade = 26;
        
        vc.nome = "Milton Neves";
        vc.idade = 19;
        
        ClassCarro meuCarro = new ClassCarro(); // CARRO 1
        ClassCarro seuCarro = new ClassCarro(); // CARRO 2
        
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Toro";
        meuCarro.cor = "Branco Gelo";
        meuCarro.anoFabricacao = 2021;
        meuCarro.ligarCarro();
        
        seuCarro.fabricante = "VolksWagen";
        seuCarro.modelo = "Gol G3";
        seuCarro.cor = "Vermelho Ferrari";
        seuCarro.anoFabricacao = 2012;
        
        meuCarro.dono = eu;
        seuCarro.dono = vc;
        
        System.out.println("Eu: " + eu.nome);
        System.out.println("Dono do carro 1: " + meuCarro.dono.nome);
        System.out.println("**************************************");
        System.out.println("Vc: " + vc.nome);
        System.out.println("Dono do carro 2: " + seuCarro.dono.nome);
        
           
    }
        
}
