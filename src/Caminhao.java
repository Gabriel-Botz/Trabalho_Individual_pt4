import java.time.LocalDate;

public non-sealed class Caminhao extends Veiculo{

    final private double capacidadeCargaToneladas;

    public Caminhao(int anoFabricacao, String marca, String placa, double precoFipe, double valorLocacaoDiaria, double capacidadeCarga) {
        super(anoFabricacao, marca, placa, precoFipe, valorLocacaoDiaria);
        this.capacidadeCargaToneladas = capacidadeCarga;
    }

    @Override
    public double calcularIpva() {

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - getAnoFabricacao();

        if (idade > 20){
            return 0.0;
        }

        double valorIpva;

        valorIpva = getPrecoFipe() * 0.015;
        return valorIpva;
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {

        if (dias <= 0){
            throw new IllegalArgumentException("Quantidade de dias inválido");
        }
        if (pesoCarga < 0.0){
            throw new IllegalArgumentException("O peso de carga inválido.");
        }


        System.out.println("Dias alugados: " + dias);

        double valorTotal = getValorLocacaoDiaria() * dias;;

        if (pesoCarga > capacidadeCargaToneladas){

            double taxa;
            taxa = valorTotal * 0.10;
            valorTotal = valorTotal + taxa;

            System.out.println("O veículo excedeu o limite de carga, valor de acréscimo: R$" + taxa);
        }

        return valorTotal;
    }
}
