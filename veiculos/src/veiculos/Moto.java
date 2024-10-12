package veiculos;

public class Moto extends Carro {
    private String tipoDeCorrida;

    public Moto(String marca, String modelo, int ano, String tipoDeCorrida) {
        super(marca, modelo, ano);
        this.tipoDeCorrida = tipoDeCorrida;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto: " + marca + " " + modelo + " (" + ano + ")");
        System.out.println("Tipo de Corrida: " + tipoDeCorrida);
    }
}
