package Classes;

public class ClassFolhaPagamento {
    
    // COMO LER A ASSINATURA DO MEU METODO
    // double calculoSalario(int, int, double, double)
    public double calculoSalario (int horasNormais, 
            int horasExtras, double valorHoraNormal, double valorHoraExtra) {
        
        double valorHorasNormais = horasNormais * valorHoraNormal;
        double valorHoraExtras = horasExtras * valorHoraExtra;
        
        return valorHorasNormais + valorHoraExtras; // RETORNA O VALOR TOTAL FEITO LOGO A CIMA.
    }
   
    
}
