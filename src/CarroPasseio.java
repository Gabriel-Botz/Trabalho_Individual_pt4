import java.time.LocalDate;

public non-sealed class CarroPasseio extends Veiculo{

    public CarroPasseio(int anoFabricacao, String marca, String placa, double precoFipe, double valorLocacaoDiaria) {
        super(anoFabricacao, marca, placa, precoFipe, valorLocacaoDiaria);
    }

    @Override
    public double calcularIpva() {

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - getAnoFabricacao();

        if (idade > 20){
            return 0.0;
        }
        double valorIpva;

        valorIpva = getPrecoFipe() * 0.04;
        return valorIpva;
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {

        if (dias <= 0){
            throw new IllegalArgumentException("Quantidade de dias inválido");
        }
        if (pesoCarga < 0.0){
            throw new IllegalArgumentException("O peso ca carga inválido.");
        }

        System.out.println("Dias alugados: " + dias);

        double valorTotal = getValorLocacaoDiaria() * dias;
        return valorTotal;
    }



}
