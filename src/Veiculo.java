import java.time.LocalDate;

public abstract sealed class Veiculo {

  private String placa;
  private String marca;
  private double valorLocacaoDiaria;
  private int anoFabricacao;
  private double precoFipe;

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
}
