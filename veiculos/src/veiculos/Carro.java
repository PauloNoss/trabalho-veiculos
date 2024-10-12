package veiculos;

public class Carro {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Veículo: " + marca + " " + modelo + " (" + ano + ")");
    }
}
