package java_algaworks;

import Classes.ClassCarro;
import Classes.ClassDono;

public class main {

    public static void main(String[] args) {
        
        ClassDono dono1 = new ClassDono();
        ClassDono dono2 = new ClassDono();
        
        dono1.nome = "Rafael Nunes";
        dono1.idade = 26;
        
        dono2.nome = "Milton Neves";
        dono2.idade = 19;
        
        ClassCarro carro1 = new ClassCarro(); // CARRO 1
        ClassCarro carro2 = new ClassCarro(); // CARRO 2
        
        carro1.fabricante = "Fiat";
        carro1.modelo = "Toro";
        carro1.cor = "Branco Gelo";
        carro1.anoFabricacao = 2021;
        
        carro2.fabricante = "VolksWagen";
        carro2.modelo = "Gol G3";
        carro2.cor = "Vermelho Ferrari";
        carro2.anoFabricacao = 2012;
        
        carro1.dono = dono1;
        carro2.dono = dono2;
        
        
        System.out.println("Carro 1: " + carro1.dono.nome);
        System.out.println("Dono 1: " + dono1.nome);
        
        System.out.println("Carro 2: " + carro2.dono.nome);
        System.out.println("Dono 2: " + dono2.nome);
           
    }
        
}
