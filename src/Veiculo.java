import java.time.LocalDate;

abstract sealed class Veiculo implements Fretavel, Tributavel permits Caminhao, CarroPasseio {

  final private String placa;
  final private String marca;
  final private double valorLocacaoDiaria;
  final private int anoFabricacao;
  final private double precoFipe;

    public Veiculo(int anoFabricacao, String marca, String placa, double precoFipe, double valorLocacaoDiaria) {

        if (placa == null || placa.isBlank()){
            throw  new IllegalArgumentException("O campo 'Placa' não pode estar vazio!");
        }
        if (marca == null || marca.isBlank()){
            throw new IllegalArgumentException("O campo 'Marca' não pode estar vazio!");
        }
        if (valorLocacaoDiaria <=0){
            throw new IllegalArgumentException("O campo 'Valor da locação' não pode estar vazio!");
        }if (anoFabricacao <=0 || anoFabricacao > LocalDate.now().getYear()){
            throw new IllegalArgumentException("Ano de fabricação inválido!");
        }
        if (precoFipe <=0){
            throw new IllegalArgumentException("O campo 'Preço fipe' não pode estar vazio!");
        }

        this.anoFabricacao = anoFabricacao;
        this.marca = marca;
        this.placa = placa;
        this.precoFipe = precoFipe;
        this.valorLocacaoDiaria = valorLocacaoDiaria;

    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPrecoFipe() {
        return precoFipe;
    }

    public double getValorLocacaoDiaria() {
        return valorLocacaoDiaria;
    }

    @Override
    public String toString(){

     return "\nMarca: " + getMarca() + " | Ano fabricação: " + getAnoFabricacao() + " | Placa: " + getPlaca() + " | Valor fipe: " + getPrecoFipe() + " | Valor diária: " + getValorLocacaoDiaria();
    }

}
