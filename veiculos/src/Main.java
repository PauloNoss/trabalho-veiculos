import frota.Frota;
import veiculos.Caminhao;
import veiculos.Carro;
import veiculos.Moto;

public class Main {
    public static void main(String[] args) {



        Carro carro1 = new Carro ("Toyota", "Corolla", 2021);
        Moto moto1 = new Moto("Honda", "CB500", 2022, "estrada");
        Caminhao caminhao1 = new Caminhao("Volvo", "FH", 2019, "carga pesada");
        Frota frota = new Frota();
        frota.adicionarVeiculo(carro1);
        frota.adicionarVeiculo(moto1);
        frota.adicionarVeiculo(caminhao1);
        frota.exibirFrota();
    }
}
