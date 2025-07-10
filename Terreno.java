package modelo;

public class Terreno extends Financiamento {
    private String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual,
                   String tipoZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    @Override
    public void exibirDados() {
        System.out.println("Financiamento de Terreno:");
        System.out.println("Valor do imóvel: R$ " + valorImovel);
        System.out.println("Valor total do financiamento: R$ " + calcularTotalPagamento());
        System.out.println("Tipo de zona: " + tipoZona);
        System.out.println("-------------------------------------------");
    }
}
