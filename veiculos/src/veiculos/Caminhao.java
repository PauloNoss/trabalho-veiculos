package veiculos;

public class Caminhao extends Carro {
    private String tipoDeCarga;

    public Caminhao(String marca, String modelo, int ano, String tipoDeCarga) {
        super(marca, modelo, ano);
        this.tipoDeCarga = tipoDeCarga;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão: " + marca + " " + modelo + " (" + ano + ")");
        System.out.println("Tipo de Carga: " + tipoDeCarga);
    }
}
