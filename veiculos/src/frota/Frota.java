package frota;

import veiculos.Carro;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Carro> veiculos;

    public Frota() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Carro veiculo) {
        veiculos.add(veiculo);
    }

    public void exibirFrota() {
        System.out.println("Detalhes da Frota:");
        for (Carro veiculo : veiculos) {
            veiculo.exibirDetalhes();
            System.out.println("-----");
        }
    }
}

