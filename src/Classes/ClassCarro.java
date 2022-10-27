package Classes;

public class ClassCarro {
    
    public String fabricante;
    public String modelo;
    public String cor;
    public int anoFabricacao;
    
    public ClassDono dono;
    
    public void ligarCarro() {
        if(modelo != null) {
            System.out.println("Ligando carro: " + modelo);
        }
    }
    
}
