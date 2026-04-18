import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Caminhao c1 = null;
        CarroPasseio cp1 = null;

       try {
           c1 = new Caminhao(2012, "Volvo", "abc-123", 430000.00,
                   800.00, 100000.00);
           System.out.println("Veículo: " + c1.getMarca() + "\nIPVA: " + c1.calcularIpva());
           System.out.println("Valor aluguel: " + c1.alugarVeiculo(200000.00, 20) + "\n");
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
       try {
           cp1 = new CarroPasseio(2020, "Ford", "abc-123", 120000.00,
                   250.00);
           System.out.println("Veículo: " + cp1.getMarca() + "\nIPVA: " + cp1.calcularIpva());
           System.out.println("Valor aluguel: " + cp1.alugarVeiculo(0.0, 10) + "\n");
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
    }
}